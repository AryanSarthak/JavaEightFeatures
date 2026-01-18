package com.gevernova.problemstatement.employeeprocessor;

import java.util.*;
import java.util.stream.*;

class EmployeeProcessor {

    static void process(List<Employee> list){

        List<Employee> filtered =
                list.stream()
                        .filter(e->e.getDepartment().equalsIgnoreCase("Engineering"))
                        .filter(e->e.getSalary()>80000)
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .toList();

        Map<String,List<Employee>> grouped =
                filtered.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        Map<String,Double> avgSalary =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(filtered);
        System.out.println(grouped);
        System.out.println(avgSalary);
    }
}
