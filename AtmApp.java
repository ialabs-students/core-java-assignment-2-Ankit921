
    import java.util.Scanner;



public class AtmApp {
public static void main(String[] args) {
{
int balance = 0, withdraw, deposit;
int A = 0, B= 0, C =0 , D = 0;
int countA = 0, countB = 0, countC = 0, countD = 0;



Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("Automated Teller Machine");
System.out.println("Choose 1 for Withdraw");
System.out.println("Choose 2 for Deposit");
System.out.println("Choose 3 for Check Balance");
System.out.println("Choose 4 for EXIT");
System.out.print("Choose the operation you want to perform:");
int choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter money to be withdrawn:");
withdraw = sc.nextInt();
if (balance >= withdraw & withdraw % 100 == 0 & withdraw > 0) {
balance = balance - withdraw;
if (withdraw / 2000 > 0) {
A = withdraw / 2000;
System.out.println("Dispensed 2000 notes: " + A);
withdraw = withdraw - (A * 2000);
countA -= A;
}
if (withdraw / 500 > 0) {
B = withdraw / 500;
System.out.println("Dispensed 500 notes: " + B);
withdraw = withdraw - (B * 500);
countB -= B;
}
if (withdraw / 200 > 0) {
C = withdraw / 200;
System.out.println("Dispensed 200 notes: " + C);
withdraw = withdraw - (C * 200);
countC -= C;
}
if (withdraw / 100 > 0) {
D = withdraw / 100;
System.out.println("Dispensed 100 notes: " + D);
withdraw = withdraw - (D * 100);
countD -= D;
}
if (countA < 0 || countB < 0 || countC < 0 || countD < 0) {
System.out.println("Can't withdraw funds because insufficient notes to withdraw this amount");
} else {
System.out.println("Please collect your money");
System.out.println("Balance: 2000s=" + countA + ", 500s=" + countB+ ", 200s=" + countC
+ ", 100s=" + countD + ", Total=" + balance);
}
} else {
System.out.println("Incorrect or Insufficient funds");
}
System.out.println("");
break;



case 2:
System.out.print("Enter number of 2000 notes:");
A = sc.nextInt();
System.out.print("Enter number of 500 notes:");
B = sc.nextInt();
System.out.print("Enter number of 200 notes:");
C = sc.nextInt();
System.out.print("Enter number of 100 notes:");
D = sc.nextInt();
countA += A;
countB += B;
countC += C;
countD += D;
deposit = A * 2000 + B * 500 + C * 200 + D * 100;
if(deposit == 0) {
System.out.println("Deposited amount can't be zero");
}
if(deposit < 0) {
System.out.println("Incorrect inputs");
}
balance = balance + deposit;
System.out.println("Your Money has been successfully deposited");
System.out.println("Current Balance is: "+ balance);
System.out.println("");
break;



case 3:
System.out.println("Balance : " + balance);
System.out.println("");
break;



case 4:
System.exit(0);
}
}
}
}
}
}
