package javaSE.e1;

public class Employee {

    private  String name;
    private  int age;
    private  String destination;
    private static double salary;
    public static final String DEPARTMENT = "开发人员";

    Employee()
    {

    }
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDestination() {
        return destination;
    }

    void setDestination(String destination) {
        this.destination = destination;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emplyee：\n" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", destination='" + destination + '\'' +
                ", salary=" + salary +
                '\n';
    }

    public static void main(String[] args) {
        salary = 10000;
        System.out.println(DEPARTMENT+"工资为："+salary);
    }
}
