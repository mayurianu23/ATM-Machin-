import java.util.Scanner; 
//create ATMExample class  
public class ATMExample  
{  

    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance = 1000, withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM Machine");  
            System.out.println("Enter your choise");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                       System.out.print("Enter money to be withdrawn:"); 
                        withdraw = sc.nextInt();    
                         if(balance >= withdraw)  
                           { 
                               balance = balance - withdraw;  
                               System.out.println("Please collect your money");  
                            }  
                          else  
                            { 
                              System.out.println("Insufficient Balance");  
                            }  
                              System.out.println("");  
                 break;  
   
                case 2:  
                     System.out.print("Enter money to be deposited:");  
                     deposit = sc.nextInt();    
                     balance = balance + deposit;  
                     System.out.println("Your Money has been successfully depsited");  
                     System.out.println("");  
                 break;  
   
                case 3:  
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                break;  
   
                case 4:  
                     System.exit(0);  
            }  
        }  
    }  
}