package pl.sda.employee.service;

import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.EmployeeModel;

public class EmployeeService {

    public void addEmployee(EmployeeModel employee) {
        EmployeeDatabase.getEmployeeList().add(employee);
    }
}
