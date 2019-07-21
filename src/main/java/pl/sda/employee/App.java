package pl.sda.employee;

import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        EmployeeController employeeController = new EmployeeController(new EmployeeService(), new EmployeeView());

        boolean running = true;
        while(running == true) {
            System.out.print("\n1. Add employee\n2. Show employee\n3. Show all employees\nChoose: ");
            int value = input.nextInt();

            switch (value) {
                case 1: {
                    employeeController.prepaireEmployee(input); }
                    break;
                case 2: {
                    employeeController.showEmployee(input); }
                    break;
                case 3: {
                    employeeController.showEmployees(); }
                    break;
                case 0: {
                    running = false; }
                    break;

            }
        }
    }
}
