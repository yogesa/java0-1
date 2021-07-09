package javaSE.e1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em = new Employee("张仁丰");
        Employee em1 = new Employee("乔峰");
        em.setAge(30);
        em.setDestination("北京");
        em.setSalary(10000.00);
        System.out.println(em.toString());

        em1.setAge(40);
        em1.setDestination("上海");
        em1.setSalary(20000.00);
        System.out.println(em1.toString());

        Employee ech = new Employee("陈辉");
        ech.setDestination("jiujaing");
        ech.setAge(25);;
        System.out.println(ech.toString());

    }
}
