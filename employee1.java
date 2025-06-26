public class employee1 {
    protected int emp_id;
    protected int age;
    protected String emp_name;
    protected boolean isPermanent;
    public static void main(String[] args) {
        employee1 emp =new employee1();
        emp.emp_id=123;
        emp.age=(int)35.5;
        emp.emp_name="mrunal pawar";
        emp.isPermanent = true;
        System.out.println("successfully started");
    }
}
