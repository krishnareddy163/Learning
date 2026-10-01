package Java8;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private long id;
    private String name;
    private String email;
    private String department;
    private double salary;

    public Employee(long id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "IT", 50000));
        employees.add(new Employee(2, "Sara", "HR", 45000));
        employees.add(new Employee(3, "Mike", "Finance", 60000));
        employees.add(new Employee(4, "Ram", "IT", 500000));
        employees.add(new Employee(5, "Kittu", "HR", 4500));
        employees.add(new Employee(6, "Raj", "Finance", 600000));

        Optional<Employee> highestSalaryEmployee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Map<String, Optional<Employee>> highestPaidByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        ));

        List<Employee> top2 = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(highestSalaryEmployee);
        System.out.println(highestPaidByDept);
        System.out.println(top2);
    }
}
