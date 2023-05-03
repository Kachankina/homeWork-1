import java.util.Objects;


public class Employee {
    static int employeeCounter = 0;

    private int age;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
        this("DefaultFirstName","DefaultLastName");
    }
   public Employee(String firstName, String lastName){
        this(35, firstName,lastName);
    }
    
    public Employee(int age, String firstName, String lastName, double salary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        employeeCounter++;

    }

    public Employee(int age, String firstName, String lastName){
        this age = age;
        this firstName = firstName;
        this lastName = lastName;
        salary = 50;
        employeeCounter++;
    }

    public boolean equals(Object obj){
        if(obj instanceof Employee employee){
            return lastName.equals(employee.lastName) && lastName.equals(employee.lastName);
        }
        return false;
    }

    public int hashCode(){
        return Objects.hash(firstName, lastName);

    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public boolean compareTo(Employee anotherEmployee){
        if (age > anotherEmployee.age){
            return false;
        }else if (age < anotherEmployee.age){
            return true;
        }
        return false;
    }

    void upgrade(double salary){
        double salary1 = 20;
        double salaryUp = salary + salary1;

    }
        
}



