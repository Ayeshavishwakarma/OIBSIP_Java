package randomnumber;

import java.util.Random;
import java.util.Scanner;

public class Numberguess 
{
public static void main(String[]args) 
{
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	int number=rand.nextInt(100)+1;
	int attempts=5;
	boolean guessed=false;
	System.out.print("Guess a number between 1 to 100");
	
	while(attempts>0) 
	{
		System.out.println("Enter your guess:");
		int num=sc.nextInt();
		if(num==number) 
		{
			System.out.println("correct!you guessed the number.");
			guessed=true;
			break;
		}
		else if(num>number) 
		{
			System.out.println("too high");
		}
		else 
		{
			System.out.println("too low");
		}
		attempts--;
		System.out.println("Attempts left:"+attempts);
		
		}
	
	if(!guessed) 
	{
		System.out.println("you lost!"+number);
	}
	System.out.println("Game Over.Thanks for playing!");
	sc.close();
	
}
}
