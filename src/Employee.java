import java.util.Objects;

public class Employee {

    private String name;
    private String middleName;
    private String surname;
    private int salary;
    private int department;
    private int id;
    private static int counter = 100;

    public Employee ( String name, String middleName, String surname, int salary, int department ) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.id = counter++;

    }

    public String getName () {
        return name;
    }

    public String getMiddleName () {
        return middleName;
    }

    public String getSurname () {
        return surname;
    }

    public int getSalary () {
        return salary;
    }

    public int getDepartment () {
        return department;
    }

    public int getId () {
        return id;
    }

    public void setDepartment ( int department ) {
        this.department = department;
    }

    public void setSurname ( String surname ) {
        this.surname = surname;
    }

    public void setSalary ( int salary ) {
        this.salary = salary;
    }


    public String toString () {
        return  "ФИО: " + this.surname+ " " +
                 this.name+ " " + this.middleName +
                " Зарплата " + this.salary +
                " Отдел " + this.department +
                " id " + this.id;
    }


    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( !(o instanceof Employee employee) ) return false;
        return salary == employee.salary && department == employee.department && id == employee.id && Objects.equals ( name, employee.name ) && Objects.equals ( middleName, employee.middleName ) && Objects.equals ( surname, employee.surname );
    }

    public int hashCode () {
        return Objects.hash ( name, middleName, surname, salary, department, id );
    }
}