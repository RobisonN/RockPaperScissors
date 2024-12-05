// Noah Robison

import java.util.Scanner;
import java.util.Random;

public class HW3 {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Random r = new Random();
	
		String[] choices = {"rock", "paper","scissors"};	//declaring choice variables in array
		String playAgain = "";	//declaring variable for playing the game again
		
		
		do
		{
			//round trackers for wins
			int compWins = 0;
			int humanWins = 0;
			int rounds = 0;
			
			System.out.println("Let\'s play rock, paper, scissors! Best two out of three rounds wins!");
			
			while(humanWins < 2 && compWins < 2 && rounds < 3)	
			{
				System.out.println("Enter your choice of \"rock\", \"paper\", or \"scissors\":");
				String humanChoice = key.next();
			
				if(!humanChoice.equalsIgnoreCase("rock") && !humanChoice.equalsIgnoreCase("paper") && !humanChoice.equalsIgnoreCase("scissors"))	//If user puts invalid input, redo
				{
					System.out.println("Invalid input! Please enter rock, paper, or scissors.");
				
				}
				
				int computerChoiceIndex = r.nextInt(3); // 0, 1, or 2
				String computerChoice = choices[computerChoiceIndex];
		        System.out.println("Computer chose: " + computerChoice);
		        
		        // Determine the winner of the round
		        if (humanChoice.equalsIgnoreCase(computerChoice)) 
		        {
		           System.out.println("It's a tie!");
		        } 
		            
		        else if ((humanChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) || (humanChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) || (humanChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock"))) 
		        {
		           System.out.println("You win this round!");
		           humanWins++;
		        } 
		            
		        else 
		        {
		        	System.out.println("Computer wins this round!");
		            compWins++;
		        }

		        rounds++;
		        System.out.println("Score - You: " + humanWins + " | Computer: " + compWins + "\n");
			}
			
		            // Final result
			if (humanWins > compWins) 
		 	{
		 		System.out.println("Congratulations, you won the game!");
		 	} 
		 		   
		 		   
		 	else 
		 	{
		 		System.out.println("Computer wins the game!");
		 	}
			
		 		 
		 	System.out.println("Would you like to play again?");
		  
		 	playAgain = key.next();
			
			
		}while (playAgain.equals("yes"));
		
		System.out.println("Thanks for playing!");

	}
		
		

}


