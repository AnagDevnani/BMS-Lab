class Account{
private String name;
private String account;
private double bal;

public Account (String name, String accnum, double ball){
this.name = name;
this.account = account;
this.bal = bal;
}

public void deposit (double amt){
if (amt > 0){
bal+=amt;
System.out.println("Depositetd" + amt);
}
else{
System.out.println("Invalid Deposit");
}
}

public void displayBal(){
System.out.println("Balance" + bal);
}

public void withdraw (double amt){
if (amt>0 && amt<=bal){
bal-=amt;
System.out.println("Withdraw: "+amt);
}
else{
System.out.println("Insufficient Funds");
}
}
public double getBal(){
return bal;
}

public void setBal(double Bal){
this.bal = bal;
}
}

class SavAct extends Account{
private static final double int_rate = 0.05;
public SavAct (String name, String accnum, double bal){
super(name, accnum, bal);
}
public void addInterest(){
double interest = getBal() * int_rate;
setBal(getBal() + interest);
System.out.println("Interest added:" + interest);
}
}
class CurAct extends Account{
public static final double win_bal = 500;
public static final double penalty = 50;
public CurAct(String name, String accnum, double bal){
super(name, accnum, bal);
}
public void withdraw (double amt){
if (amt>0 && getBal() - amt>=0){
setBal(getBal() - amt);
System.out.println("Withdraw: " + amt);
checkMinBal();
}
else{
System.out.println("Insufficient Funds");
}
}
private void checkMinBal(){
if (getBal() < win_bal){
setBal(getBal()-penalty);
System.out.println("Below min balance, penalty: "+penalty);
}
}
}
public class Bank{
public static void main(String[] args){
SavAct savacc = new SavAct("Rahul","Rahul13",1000);
CurAct curacc = new CurAct("Rohan","Rohan14",500);
System.out.println("Savings Account: ");
savacc.deposit(500);
savacc.displayBal();
savacc.addInterest();
savacc.withdraw(200);
savacc.displayBal();

System.out.println("\n Current Account: ");
curacc.deposit(1000);
curacc.displayBal();
curacc.withdraw(1000);
curacc.displayBal();
curacc.withdraw(200);
}
}
