package project.testing;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    void retire(){
        System.out.println(" I have retired !");
    }

    SalariedEmployee(String name, String birthDate, String endDate, String hireDate,
                     double annualSalary, boolean isRetired){
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;

    }


}
