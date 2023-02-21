package project.testing.bank;
public class Account {

    private String username;
    private String password;
    private static int counter = 0; //static since a new id needs to be generated everytime an object is instantiated
    private long id;
    private double balance;
    private long phonenumber;
    private long[] idno = new long[100]; // idno is declared array so as findacc method can if an id exists or not 

    public Account() {
        this("John doe", "Default password", 0);  // Calling the 3 parameter constructor
        System.out.println("You have been assigned the guest credentials"); //Whenever constructor is left empty user will be granted default credentials
    }

    public Account(String username, String password, long phonenumber) {
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.id = counter++; //first id is 0
        this.idno[counter - 1] = this.id; // counter-1 stores '0' in the first index, and so on, without -1 id's would always leave vacant spots in the array
    }

    public void withdraw(double wammount) {
        if (this.phonenumber == 0) {
            System.out.println("You need to be logged on in order to proceed;");
            return;
        }
        if (this.balance <= 0) {
            System.out.println("Insufficient balance");
        } else {
            this.balance = this.balance - wammount;
            System.out.println("You have successfully withdrew " + wammount + '$' + "\n" +
                    "Your current balance is " + this.balance + '$');
        }
    }

    public void deposit(double dammount) {
        if (this.phonenumber == 0) {
            System.out.println("You need to be logged on in order to proceed;");
            return;
        }
        this.balance = this.balance + dammount;
        System.out.println("You have successfully deposited " + dammount + '$' + "\n" +
                "Your current balance is " + this.balance + '$');
    }

    public void findAcc(long find) {
        for (int i = 0; i < counter; i++) {
            if (find == idno[i]) {
                System.out.println("It exists");
                return;
            }
        }
        System.out.println("It doesn't exist");
    }

    @Override
    public String toString() {
        return "Backend{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", phonenumber=" + phonenumber +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }



}


