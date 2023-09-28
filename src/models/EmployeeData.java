package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeData {

    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> empList = null;
        try {
            empList = tryGetEmployees();
        } catch (SQLException e) {
            System.err.println("Hiba! Az SQL lekérés sikertelen");
            System.err.println(e.getMessage());
        }
        return empList;
    }
    
    public ArrayList<Employee> tryGetEmployees () throws SQLException {
        Connection con = Mariadb.connectDB();
         String sql = "select * from employees";
        Statement stmt = con.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        ArrayList<Employee> empList = new ArrayList<>();
        while(res.next()) {
            Employee emp = new Employee();
            emp.setId(res.getInt("id"));
            emp.setName(res.getString("name"));
            emp.setCity(res.getString("city"));
            emp.setSalary(res.getDouble("salary"));
            empList.add(emp);
        }
        return empList;
    }
}
