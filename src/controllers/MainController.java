package controllers;

import java.util.ArrayList;

import models.Employee;
import models.EmployeeData;
import views.MainConsole;

public class MainController {
    public MainController() {
        ArrayList<Employee> emplist = new EmployeeData().getEmployees();
        MainConsole.printEmployees(emplist);
    }
}
