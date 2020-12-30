package com.java8.topics;

import com.java8.topics.Bean.Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparator8Demo {

    public static void main(String[] args)
    {
        List<Emp> emp=new ArrayList<>();

        emp.add(new Emp(11,"Kalpesh","Chaudhari",35));
        emp.add(new Emp(3,"Rakesh","Patil",32));
        emp.add(new Emp(2,"Manish","Roy",37));
        emp.add(new Emp(9,"Akash","Mishra",35));
        emp.add(new Emp(5,"Dhanraj","Patil",36));
        emp.add(new Emp(8,"Sachin","Chaudhari",35));
        emp.add(new Emp(7,"Rahul","Jadhav",35));
        emp.add(new Emp(6,"Sanjay","Pagar",39));
        emp.add(new Emp(15,"Amol","Redekar",31));
        emp.add(new Emp(1,"Sandeep","Chaudhari",33));

        //Sort By Age
        emp.sort(Comparator.comparing(e -> e.getAge()));
        //Let's print the sorted list
        System.out.println(emp);

        //Sort BY First name
        emp.sort(Comparator.comparing(Emp::getFirstName));

        //Let's print the sorted list
        System.out.println(emp);


        //Sort all employees by first name; And then reversed
        Comparator<Emp> comparator = Comparator.comparing(e -> e.getFirstName());
        emp.sort(comparator.reversed());

        //Let's print the sorted list
        System.out.println(emp);



        //Sort on multiple fields – thenComparing()

//Sorting on multiple fields; Group by.
        Comparator<Emp> groupByComparator = Comparator.comparing(Emp::getFirstName)
                .thenComparing(Emp::getLastName);
        emp.sort(groupByComparator);

        System.out.println(emp);

//Parallel Sorting
        Emp[] employeesArray = emp.toArray(new Emp[emp.size()]);

//Parallel sorting
        Arrays.parallelSort(employeesArray, groupByComparator);

        System.out.println(employeesArray);

    }
}
