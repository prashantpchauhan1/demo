package com.coding.demo.controller;

import com.coding.demo.dto.LoginDto;
import com.coding.demo.dto.ResponseDto;
import com.coding.demo.dto.UserDto;
import com.coding.demo.model.User;
import com.coding.demo.repository.UserRepository;
import com.coding.demo.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Random;
import java.util.random.RandomGenerator;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Value("${message.greet}")
    private String name;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/register")
    public ResponseDto<User> registerUser(@RequestBody UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.firstName());
        user.setLastName(userDto.lastName());
        user.setUsername(userDto.firstName().toLowerCase().substring(0,3)
                +userDto.lastName().toLowerCase().substring(0,3)
                + "123");
        user.setPassword(bCryptPasswordEncoder.encode(userDto.password()));
        user.setAddresses(userDto.addresses());
        user.setEmail(userDto.email());
        user.setPhoneNumber(userDto.phoneNumber());
        user.setActive(true);
        User savedUser = userRepository.insert(user);
        return new ResponseDto<>(HttpStatus.CREATED,
                "user Registered successfully",
                savedUser);
    }

    @PostMapping("/login")
    public ResponseDto<String> loginUser(@RequestBody LoginDto loginDto){
        System.out.println(name);
        Optional<User> user = userRepository.getUserByUsername(loginDto.username());
        if(user.isPresent()){
            if(bCryptPasswordEncoder.matches(loginDto.password(), user.get().getPassword())){
                return new ResponseDto<>(HttpStatus.OK,
                        "user logged in successfully",
                        jwtUtil.generateToken(loginDto.username()));
            }else{
                return new ResponseDto<>(HttpStatus.FORBIDDEN,
                        "incorrect password",
                        null);
            }
        }
        return new ResponseDto<>(HttpStatus.NOT_FOUND,
                "user not found",
                null);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello from api";
    }

}
