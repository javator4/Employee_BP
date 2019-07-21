package pl.sda.employee.controller;

import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.EmployeeModel;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;


public class EmployeeController {

    private EmployeeService service;
    private EmployeeView view;

    public EmployeeController(EmployeeService service, EmployeeView view) {
        this.service = service;
        this.view = view;
    }

    public void prepaireEmployee(Scanner input) {
        System.out.print("Podaj dane pracownika:\nImię: ");
        String name = input.nextLine();
        System.out.print("Nazwisko: ");
        String surname = input.nextLine();
        System.out.println("Płeć: ");
        char sex = input.nextLine().charAt(0);
        System.out.println("Nr Departamentu: ");
        int dept_no = input.nextInt();

        EmployeeModel employeeModel = new EmployeeModel(name, surname, sex, dept_no);
        service.addEmployee(employeeModel);
    }

    public void showEmployee(Scanner input) {
        System.out.print("Choose employee: ");
        int choice = input.nextInt();
        EmployeeModel employee = EmployeeDatabase.getEmployeeList().get(choice);
        view.showEmployee(employee);
    }

    public void showEmployees() {
        view.showEmployees();
    }
}
