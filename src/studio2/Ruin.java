package studio2;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How much money are you starting with?");
		double startAmount = in.nextDouble();
		
		System.out.print("What is your win probability?");
		double winChance = in.nextDouble();
		
		System.out.print("What is your win limit in dollars?");
		double winLimit = in.nextDouble();
		
		System.out.print("How many days are you going to try your luck at gambling?");
		int totalSimulations = in.nextInt();
		
		double total = winLimit;
		int dayCounter = 0;
		for (int days = 0; days < totalSimulations; days++ )
		{ 
			
			for(int i = 0; i < total; i++ )
			{
				double currentBalance = startAmount;
				while (currentBalance < winLimit && currentBalance > 0)
				{
					if(Math.random()< winChance)
					{
					currentBalance = currentBalance + 1;
					//System.out.println("You won! Your current balance is " + currentBalance);
					}
					else
					{
					currentBalance = currentBalance - 1;
					//System.out.println("You lost! Your current balance is " + currentBalance);
					
					}
				}
			}
			dayCounter++;
			System.out.println("You played" + dayCounter);
		
		}
	
				
				
				
				
			
		
	}

}
