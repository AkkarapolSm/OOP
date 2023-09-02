package ZingleCode;
public class Employee2 {
    public int empId;
    private double salary;
    public String timeIn;
    public String timeOut;

    public void setTimeIn(String time) {
        timeIn = time;
    }
    public void setTimeOut(String time) {
        timeOut = time;
    }
    public double getSalary(int empId) {
        if (empId == 2264)
            salary = 30000;
        else salary = 20000;

        return salary;
    }
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2();
        employee2.empId = 2264;

        employee2.setTimeIn("08.20");
        employee2.setTimeOut("18.00");
        employee2.getSalary(employee2.empId);

        System.out.println("Value from method call =>");
        System.out.println(" empId:" + employee2.empId);
        System.out.println(" salary:" + employee2.salary);
        System.out.println(" timeIn:" + employee2.timeIn);
        System.out.println(" timeOut:" + employee2.timeOut);


        Employee2 emp = new Employee2();
        emp.getSalary(2021);
        System.out.println("\n salary of emp:" + emp.salary);
        
    }
}