public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){

        this.name = name;

    }

    public void empAge (int empAge){

        age = empAge;

    }
    public void empDesign (String empDesign){

        designation = empDesign;

    }

    public void empSalary (double empSalary){

        salary = empSalary;

    }

    public void printEmployee(){

        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age : " + age);
        System.out.println("Employee Designation : " + designation);
        System.out.println("Employee Salary : " + salary);

    }

    public static void main(String[] args) {

        Employee empOne = new Employee ("Calvin Wong");
        Employee empTwo = new Employee ("Rita Liao");

        empOne.empAge(25);
        empOne.empDesign("Software Engineer");
        empOne.empSalary(200000.0);
        empOne.printEmployee();

        empTwo.empAge(23);
        empTwo.empDesign("Computer Engineer");
        empTwo.empSalary(150000.0);
        empTwo.printEmployee();



    }
}
