package atm;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;

public class Class1 extends Class2 {
      
Scanner sc = new Scanner(System.in);
DecimalFormat dc = new DecimalFormat("'$'###,##0.00");
HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

void getlogin()
{  
	 int x=1;
	do {
	 
	  try	
	{
	    data.put(123456,1234);
	    data.put(567890, 5678);
	   // System.out.println(data.entrySet());
	    System.out.println("Welcome to ATM project");
	    System.out.println("Enter Customer Id");
	    int id=sc.nextInt();
	    setCustomerNumber(id);
	    
	    System.out.println("Enter pin ");
	    int pin=sc.nextInt();
	    setPinNumber(pin);
	}
	catch(Exception e)
	{
	  e.printStackTrace();	
	  x=2;
	}
      int cn=getCustomerNumber();
      int pn=getPinNumber();
      if(data.containsKey(cn) && data.get(cn)==pn)
      {
    	  getAccountType();
      }
      else {
    	  System.out.println("Enter valid account Id and Pin");
      }
	  
     }while(x==1);
  }

void getAccountType()
{
	System.out.println("Select your Account Type");
	System.out.println("1. Check Account");
	System.out.println("2. Saving Account");
	System.out.println("3.Exit");
	
	int ch = sc.nextInt();
	
	switch(ch)
	{
	case 1:
		getCheckingAccount();
		break;
		
	case 2:
		getSavingAccount();
		break;
		
	case 3: 
		System.out.println("Thank you or visiting our ATM");
		break;
		
	default:
		System.out.println("Please Enter valid choice");
		getAccountType();
	}
}

 void getSavingAccount() {
	System.out.println("Saving Account");
	System.out.println("Enter choice");
	System.out.println("1.view Balance");
	System.out.println("2.withdraw balance");
	System.out.println("3.Deposit fund");
	System.out.println("4.Exit");
	
	int ch = sc.nextInt();
	
	switch(ch)
	{
	case 1 :
		System.out.println("Your balnace is "+dc.format(savingBalance));
		getSavingAccount();
		break;
		
	case 2:
	   getSavingWithdrawInput();
	   getAccountType();
	   break;
	
	case 3:
		getSavingDepositInput();
		getAccountType();
		break;
		
	case 4:
		System.out.println("thank you for visiting our ATM machine");
		break;
	
	default:
		System.out.println("enter valid choice");
		getSavingAccount();
	}
	
}

 void getCheckingAccount() {
  
		System.out.println("Checking Account");
		System.out.println("Enter choice");
		System.out.println("1.view Balance");
		System.out.println("2.withdraw balance");
		System.out.println("3.Deposit fund");
		System.out.println("4.Exit");
		
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1 :
			System.out.println("Your balnace is "+dc.format(checkingBalance));
			getCheckingAccount();
			break;
			
		case 2:
		   getCheckingWithdrawInput();
		   getAccountType();
		   break;
		
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("thank you for visiting our ATM machine");
			break;
		
		default:
			System.out.println("enter valid choice");
			getCheckingAccount();
	
     }
  }
}
