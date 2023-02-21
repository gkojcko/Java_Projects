package project.testing;

public class Employee extends Worker {

    private String hireDate;
    public long employeeId;
    private static int EmployeNo = 1 ;

    Employee(){

    }
    Employee(String name, String birthDate, String endDate,String hireDate){
        super(name, birthDate, endDate);
        this.employeeId = EmployeNo++;
        this.hireDate = hireDate;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "hireDate='" + hireDate + '\'' +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}
