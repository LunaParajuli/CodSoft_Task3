
/*
1.Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
*/

import java.util.*;

class ATM{
    float Balance;
    int PIN = 1234;
    
    public void checkpin(){
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if(enteredPIN==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    } 
    
    
    public void menu()
    {
        System.out.println("Enter your choice");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");
        
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        
        if(opt==1){
           checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();    
        }
        else if(opt==4){
            return;    
        }
        else{
           System.out.println("Enter a valid choice!!!");     
         }
                
    }
    public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
          System.out.println("Insufficient Balance");  
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successful");           
        }
        menu();
    } 
    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class AtmInterface{
    public static void main(String args[])
    {
      ATM obj = new ATM();
      obj.checkpin();
      
    }
}