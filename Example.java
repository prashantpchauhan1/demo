import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Mango", "Banana");
//       Stream<String> stream = list.stream();

        String[] list1 = {"Potato", "Tomato", "Carrot"};
//        Stream<String> stream = Arrays.stream(list1);

//        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

//        Stream<Double> randoms = Stream.generate(Math::random).limit(5);

//        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
//        integers.stream().filter(i->i%2!=0).collect(Collectors.toList()).forEach(System.out::println);

//        List.of(1,2,3,4,5,6,7,8,9,10).stream().filter(i->i%2!=0).sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        List.of("Prashant", "Sarabjit", "Anurodh", "Amit")
//                .stream()
//                .filter(name->name.startsWith("A"))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

//        List.of("Prashant", "Sarabjit", "Anurodh", "Amit")
//                .stream()
//                .filter(name->name.length()>5)
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

//        List.of("Java is fun", "Streams are powerful")
//                .stream()
//                .flatMap(c->Arrays.stream(c.split(" ")))
//                .forEach(System.out::println);
//    }

//               boolean a = List.of("Java is fun", "Streams are powerful")
//                .stream()
//                        .filter(s->!s.contains("a"))
//                        .anyMatch(s->s.startsWith("P"));
//               System.out.println("starts with P? "+ a);
//
//        boolean b = List.of("Java is fun", "Streams are powerful")
//                .stream()
//                .filter(s->!s.contains("a"))
//                .allMatch(s->s.length()>3);
//        System.out.println("length more than 3? "+ b);

//       Map<Integer,Map<Boolean,List<String>>> result = Arrays.asList("Apple","Mango","Banana")
//                .stream()
//                .collect(Collectors.groupingBy(String::length ,Collectors.partitioningBy(c->c.contains("a"))));
//
//        System.out.println(result);


//        Arrays.asList("Apple","Mango","Banana")
//                .stream()
//                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
//                .forEach(System.out::println);


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000, "Engineering"),
                new Employee("Bob", 85000, "HR"),
                new Employee("Charlie", 65000, "Engineering"),
                new Employee("Diana", 90000, "HR"),
                new Employee("Eve", 75000, "Sales")
        );

////        1. total salary of all emp
//        System.out.println(employees.stream().map(Employee::salary).reduce(0.0,(a,b)->a+b));
////        2. highest salary among employees
//        System.out.println(employees.stream().max(Comparator.comparing(Employee::salary)));
////        3.Concatenate all employee names into a single comma-separated string.
//        System.out.println(employees.stream().map(Employee::name).collect(Collectors.joining(",")));
////        4. Count how many employees are in the "Engineering" department.
//        System.out.println(employees.stream().filter(e-> e.department().equals("Engineering")).collect(Collectors.counting()));
////        5. Get average salary of employees in the "HR" department.
//        System.out.println(employees.stream().filter(e-> e.department().equals("HR")).collect(Collectors.averagingDouble(Employee::salary)));
//

////        Group employees by department.
//        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::department)));
////        Count employees in each department.
//        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::department,Collectors.counting())));
////         Get average salary per department
//        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::department,Collectors.averagingDouble(Employee::salary))));
////        Partition employees into two groups: those earning more than 80,000 and those earning less.
//        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::department,Collectors.partitioningBy(employee->employee.salary()>80000))));
////        Group employees by department and then list only names (not full objects).
//        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::department,Collectors.mapping(Employee::name, Collectors.toList()))));

//
//
//        List<Employees> employeeslist = Arrays.asList(
//                new Employees("Alice", Arrays.asList("Java", "Spring")),
//                new Employees("Bob", Arrays.asList("Java", "Docker")),
//                new Employees("Charlie", Arrays.asList("Python", "Docker")),
//                new Employees("Diana", Arrays.asList("Spring", "Kubernetes"))
//        );
//
////        Get a list of all employee names in uppercase.
//        System.out.println(employeeslist.stream().map(e-> e.name().toUpperCase()).collect(Collectors.toList()));
////        Get a list of all unique skills across all employees.
//        System.out.println(employeeslist.stream().flatMap(e->e.skills().stream()).distinct().collect(Collectors.toList()));
////        Count how many times each skill appears.
//        System.out.println(employeeslist.stream()
//                .flatMap(e->e.skills().stream())
//                .collect(Collectors.groupingBy(s->s,Collectors.counting())));
////        Get a list of all skills sorted alphabetically.
//        System.out.println(employeeslist.stream()
//                .flatMap(e->e.skills().stream())
//                .distinct()
//                .sorted().collect(Collectors.toList()));
////        Group employees by skill (i.e., for each skill, list employees who have it).
//        System.out.println(employeeslist.stream().flatMap(e->e.skills().stream().map(s->Map.entry(s,e.name())))
//                        .collect(Collectors.groupingBy(Map.Entry::getKey
//                                ,Collectors.mapping(Map.Entry::getValue,Collectors.toList()))));
//
//        System.out.println(employeeslist.stream().flatMap(e -> e.skills().stream().map(skill -> Map.entry(skill, e.name())))
//                .collect(Collectors.groupingBy(Map.Entry::getKey,
//                        Collectors.mapping(Map.Entry::getValue, Collectors.toList()))));

////        Sort employees by name alphabetically.
//        System.out.println(employees.stream()
//                .map(Employee::name)
//                .sorted()
//                .collect(Collectors.toList()));
////        Sort employees by salary in descending order.
//        System.out.println(employees.stream()
//                .sorted(Comparator.comparing(Employee::salary).reversed())
//                .collect(Collectors.toList()));
//
////        Sort employees by department, then by salary ascending.
//        System.out.println(employees.stream()
//                .sorted(Comparator.comparing(Employee::department).thenComparing(Employee::salary,Comparator.naturalOrder()))
//                .collect( Collectors.toList()));
////        Get the top 2 highest-paid employees.
//        System.out.println(employees.stream()
//                .sorted(Comparator.comparing(Employee::salary).reversed())
//                        .limit(2)
//                .collect( Collectors.toList()));
////        Sort employees by name length.
//        System.out.println(employees.stream()
//                .sorted(Comparator.comparing(e->e.name().length()))
//                .collect( Collectors.toList()));

////      Get total salary per department
//            System.out.println(employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::department,
//                        Collectors.reducing(
//                                0.0,
//                                Employee::salary,
//                                Double::sum
//                        )
//                )));


//        List<EmployeesDto> employeesNewList = Arrays.asList(
//                new EmployeesDto("Alice", 70000, "Engineering", Arrays.asList("Java", "Spring")),
//                new EmployeesDto("Bob", 85000, "HR", Arrays.asList("Java", "Docker")),
//                new EmployeesDto("Charlie", 65000, "Engineering", Arrays.asList("Python", "Docker")),
//                new EmployeesDto("Diana", 90000, "HR", Arrays.asList("Spring", "Kubernetes")),
//                new EmployeesDto("Eve", 75000, "Sales", Arrays.asList("Salesforce", "Excel"))
//        );
////        Group employee names by department using Collectors.mapping().
//        System.out.println(employeesNewList.stream()
//                .collect(Collectors.groupingBy(
//                        EmployeesDto::department,
//                        Collectors.mapping(EmployeesDto::name,Collectors.toList())
//                )));
////        Get an unmodifiable list of all employee names using Collectors.collectingAndThen().
//                  List<String> res = employeesNewList.stream()
//                        .map(EmployeesDto::name)
//                        .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
//                  System.out.println(res);
//
////        Get total salary per department using Collectors.reducing().
//        System.out.println(employeesNewList.stream()
//                .collect(Collectors.groupingBy(
//                        EmployeesDto::department,
//                        Collectors.reducing(0.0,EmployeesDto::salary,Double::sum))));
////        Group only high earners (salary > 80000) by department using Collectors.filtering() (Java 9+).
//        System.out.println(employeesNewList.stream()
//                .collect(Collectors.groupingBy(
//                        EmployeesDto::department,
//                        Collectors.filtering(e->e.salary()>80000,Collectors.toList()))));
////        Group all skills by department using Collectors.flatMapping()
//        System.out.println(employeesNewList.stream()
//                .collect(Collectors.groupingBy(
//                        EmployeesDto::department,
//                        Collectors.flatMapping(e->e.skills().stream(),Collectors.toList()))));
//


        //Calculate total salary using a parallel stream.
        System.out.println(employees.stream().parallel().map(Employee::salary).reduce(0.0,Double::sum));
        //Group employees by department using a parallel stream.
        System.out.println(employees.stream().parallel().collect(Collectors.groupingBy(Employee::department)));
        //Get the top 3 highest-paid employees using parallel stream.
        System.out.println(employees.stream().parallel().sorted(Comparator.comparing(Employee::salary).reversed()).limit(3).collect(Collectors.toList()));
        //Check if the stream is parallel before collecting.
        System.out.println(employees.stream().parallel().isParallel());
        //Compare performance of sequential vs parallel stream for a large dataset (optional bonus).

    }




    }

record Employee(String name,double salary,String department){ }
record Employees(String name,List<String> skills){ }
record EmployeesDto(String name,double salary,String department,List<String> skills){}
