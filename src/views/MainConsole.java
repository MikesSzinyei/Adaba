package views;

import java.util.ArrayList;
import models.Employee;

public class MainConsole {
    
    public MainConsole() {    
    }

    public static void printEmployees(ArrayList<Employee> empList) {
        for(Employee emp : empList) {
            System.out.printf(
                "%20s %20s %10.2f\n",
                emp.getName(),
                emp.getCity(),
                emp.getSalary()
            );
        }
    }
}
