package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Class2 {

	private int CustomerNumber;
	private int PinNumber;
	protected double checkingBalance=0;
	protected double savingBalance=0;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat dc = new DecimalFormat("'$'###,## .00");
	
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}
	public int getPinNumber() {
		return PinNumber;
	}
	public void setPinNumber(int pinNumber) {
		PinNumber = pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calCheckingWithDraw(double amount)
	{   
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
		
	}
	
	public double calSavingWithDraw(double amount)
	{   
		savingBalance = savingBalance - amount;
		return savingBalance;
		
	}
	
	public double calCheckingDeposit(double amount)
	{   
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
		
	}
	
	public double calSavingDeposit(double amount)
	{   
		savingBalance = savingBalance + amount;
		return savingBalance;
		
	}
	
	public void getCheckingWithdrawInput()
	{
		System.out.println("checking balnace "+dc.format(checkingBalance));
		System.out.println("enter amount to withdraw");
		double amount=sc.nextDouble();
		if((checkingBalance-amount)>=0)
		{
			calCheckingWithDraw(amount);
			System.out.println("new balance "+dc.format(checkingBalance));
		}
		else
		{
		  System.out.println("\n balance cant be negative");	
		}
	}
	
	public void getCheckingDepositInput()
	{
		System.out.println("checking balnace "+dc.format(checkingBalance));
		System.out.println("enter amount to deposited ");
		double amount=sc.nextDouble();
		if((checkingBalance+amount)>=0)
		{
			calCheckingDeposit(amount);
			System.out.println("new balance "+dc.format(checkingBalance));
		}
		else
		{
		  System.out.println("\n balance cant be negative");	
		}
	}
	
	public void getSavingWithdrawInput()
	{
		System.out.println("checking balnace "+dc.format(savingBalance));
		System.out.println("enter amount to withdraw");
		double amount=sc.nextDouble();
		if((savingBalance-amount)>=0)
		{
			calSavingWithDraw(amount);
			System.out.println("new balance "+dc.format(checkingBalance));
		}
		else
		{
		  System.out.println("\n balance cant be negative");	
		}
	}
	
	public void getSavingDepositInput()
	{
		System.out.println("checking balnace "+dc.format(savingBalance));
		System.out.println("enter amount to deposit ");
		double amount=sc.nextDouble();
		if((savingBalance+amount)>=0)
		{
			calSavingDeposit(amount);
			System.out.println("new balance "+dc.format(savingBalance));
		}
		else
		{
		  System.out.println("\n balance cant be negative");	
		}
	}
	
	
}
