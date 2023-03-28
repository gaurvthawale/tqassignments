package com.nestedloops;



import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {

	public static void main(String[] args) 
	{
     double answer =  Math.random() ;
     System.out.println(answer);
     int k = 10;
     
     Scanner input = new Scanner(System.in);
     
     boolean correct = false;
     
     System. out.println("I'm thinking of a number betweeen.");
     
     while (k > 0)
     {
         System. out.println("Enter your guess: ");
         int guess = input.nextInt();
         
         if (guess == answer) 
         {
             System. out.println("You guessed the number!You win!");
             correct=true;
             break;
         }
        
         else if (guess > answer)
         {
             System.out.println("Your guess is high.");
             k--;
         }
        
         else 
         {
             System.out.println("Your guess is  low");
         }
         
         k--;
     }


		if (correct==false)
		{
			System.out.println("You ran out of tries!");
		}
	}
}
