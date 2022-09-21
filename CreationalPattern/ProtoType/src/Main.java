public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees=new Employees();
        employees.loadDate();

        Employees employees1= (Employees) employees.clone();
        employees1.getEmployeList().add("element4");

        Employees employees2= (Employees) employees.clone();
        employees2.getEmployeList().remove("element2");

        System.out.println(employees.getEmployeList());
        System.out.println(employees1.getEmployeList());
        System.out.println(employees2.getEmployeList());
    }
}