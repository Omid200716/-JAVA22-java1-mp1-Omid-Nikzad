import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		
	int randomNummer;
	int tryCoun;
	

		
			
		while (true) {
			tryCoun = 0;
		    randomNummer = rand.nextInt(100)+1;
		    System.out.println(randomNummer);
		
			System.out.println(" Guess from  0 to 100 ");
			
			while (true) {
				
				
				
				int answer = input.nextInt();
				tryCoun++;

				
				if (checkAnswer(randomNummer, answer) == 0){
					System.out.println("Corecct you win the game!");
					System.out.println(" You tried " + tryCoun);
					
					break;
					
				} 
				
				if (checkAnswer(randomNummer, answer) ==1) {
					System.out.println(" the number was bigger, try again!");
				} 
				
				if (checkAnswer(randomNummer, answer) ==2) {

					System.out.println(" the number was smaller, try again! ");
					
					
				}
					
}
			
		       }      
		
			
		}
	
	public static int checkAnswer( int guess, int answer) {
		if ( guess == answer)  {
			
			
			return 0;
			
		}else if( answer < guess) {
			return 1;
		}else {
			return 2;
		}
		

		
		

	}

}

