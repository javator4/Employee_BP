package pl.sda.employee.database;

import pl.sda.employee.model.EmployeeModel;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeDatabase {

    private static ArrayList<EmployeeModel> employeeList = new ArrayList<>(Arrays.asList(
            new EmployeeModel("Janusz", "Frinn", 'M', 1),
            new EmployeeModel("Olgierd", "Muffaliński", 'M', 1),
            new EmployeeModel("Irmina", "Zagułło", 'F', 2)
    ));

    public static ArrayList<EmployeeModel> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(ArrayList<EmployeeModel> employeeList) {
        EmployeeDatabase.employeeList = employeeList;
    }
}
