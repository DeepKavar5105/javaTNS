public class Main {
        public static void main(String[] args) {
            Employee emp1 = new Employee("E001", "xyz@asd.com");
            System.out.println(emp1);
            emp1.setEmpId("E002");
            System.out.println(emp1);
        }

}