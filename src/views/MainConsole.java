package views;

import models.EmployeeData;

public class MainConsole {
    
    public MainConsole() {
        new EmployeeData().getEmployees();
    }
}
