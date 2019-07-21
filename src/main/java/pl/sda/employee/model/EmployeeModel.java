package pl.sda.employee.model;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter

public class EmployeeModel {

    private String name;
    private String surname;
    private char sex;
    private int dept_no;

    @Override
    public String toString() {
        return "\nImię: " + name + " | Nazwisko: " + surname + " | Płeć: " + sex + " | Nr Departamentu: " + dept_no;
    }
}
