public class Account {

    private int accid;
    private String name;
    private double balance;
    private static float intrate=6.5f;

    public Account(int accid, String name, double balance){
        this.accid=accid;
        this.name=name;
        this.balance=balance;
    }

    public void calculateInterest(){
        double interest=(this.balance*intrate*0.4)/100;
        System.out.println("Interest Earned: "+interest);
    }

    public void displayInterestRate(){
        System.out.println("Current Rate of Interest for: "+ this.accid+ "is: "+ intrate);
    }

    public String toString(){
        return "Accid: "+accid+" name"+this.name+" balance: "+this.balance;
    }

    public void main(String[] args){

    }
}
