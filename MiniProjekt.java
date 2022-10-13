package miniprojekt;

 import java.util.Random;
 import java.util.Scanner;

 public class MiniProjekt {

 	public static void main(String[] args) {

 		
 	int answer, guess;
 	final int MAX = 100;
 	int a =1;
 	
 	
  boolean loop = false;

 		
 		Scanner sc = new Scanner(System.in);
 		Random rand = new Random();
 		
		answer = rand.nextInt(MAX)+1;
 		
 		
 		System.out.println("\n    Welcome to this game!");
 		System.out.println("Guess a nummer between 0 to 100!!");
 		
 				
 		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
 		
 		
 		do {
 			
 		
 		guess = sc.nextInt();

 		
 		if (guess > 100) {
 			System.out.println("Just between 0 to 100 please!!");
 			System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
 			
 			
 		}
 		
 		

 		if ( checkAnswer(answer, guess) == 0 ) {
 			System.out.println( " Good job man!!  the nummer was " + answer );
 			System.out.println("You tried " + a);
 			System.out.println("_____________________________________");
 			
 			loop = true;

 		}
 		
 		
 		 if(checkAnswer(answer, guess) == -1) {
 			 System.out.println("and your number was bigger ");
 			 System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_");
 			System.out.println("Try agian");
 			System.out.println("______________________________");
 		}
 		
 		 if (checkAnswer(answer, guess) == 1) {
 			 System.out.println("and your number was smaller");
 			 System.out.println("_-_-_-_-_-_-_-_-_-_-_-__-_-");
 			 System.out.println("Try agian");
 				System.out.println("______________________________");
 		 }
 		
 		 a++;

 	} while (!loop);
 		

 	
 	}
 	public static int checkAnswer (int answer, int guess) {
 		if ( answer == guess) {
 			return 0;
 		} else if  ( answer < guess) {
 			return -1;
 		}
 		else {
 			return 1;
 		}
 			
 	}
 	
 	
 	
 		

 }
