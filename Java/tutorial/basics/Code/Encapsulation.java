class Bank{
    private int account_number;
    private int balence;

    public int getAccount_number() {
        return account_number;
    }
    public int getBalence() {
        return balence;
    }
public void setAccount_number(int account_number) {
    this.account_number = account_number;
}
public void setBalence(int balence) {
    this.balence = balence;
}

}
public class Encapsulation {

    public static void printDetails(Bank bank){
System.out.println(bank.getAccount_number());
System.out.println(bank.getBalence());
    }
    public static void main(String[] args) {
    Bank b= new Bank();
    b.setAccount_number(102);
    b.setBalence(100);
printDetails(b);
    
    }
}