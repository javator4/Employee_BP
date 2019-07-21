package pl.sda.employee.view;

import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.EmployeeModel;

public class EmployeeView {

    public void showEmployee(EmployeeModel employee) {

        System.out.println(employee.toString());
    }

    public void showEmployees() {
        for ( EmployeeModel e: EmployeeDatabase.getEmployeeList() ) {
            System.out.println(e.toString());
        }
    }
}
