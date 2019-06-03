package za.co.shoprite.database;

import java.util.Scanner;
import za.co.shoprite.staff.Cashier;

public class Application{

public static void main(String [] args){
Scanner scanner=new Scanner(System.in);
Cashier cashier=new Cashier();
Sales sales=new Sales();
cashier.password=7794;

System.out.print("LOGIN");

System.out.println("Enter your password: ");
int answer1=scanner.nextInt();
	if(answer1==cashier.password){
	System.out.print("Access Granted");
	}



}//end of main method
}//end of class
