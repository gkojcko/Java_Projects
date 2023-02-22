package project.testing;

public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    Worker(){

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    Worker(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        System.out.print(this.name + " is ");
        String year = (birthDate.substring(6));
        int year1 = 2023 - (Integer.parseInt(year)) ;
        return year1;


    }
    public double collectPay(){
        System.out.println(this.name + " Got ");
        return 25.0;
    }
    public String endDate(){
        return endDate;
    }
}
