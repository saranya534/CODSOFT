package codsoft;
import java.util.Random;
import java.util.Scanner;
public class NUMBERGAME {
    public static void main(String[] a) {
        Scanner scan= new Scanner(System.in);
        Random random = new Random();
        int score=0;
        int rounds=0;
        int wins = 0;
        do {
            int n=random.nextInt(100)+1,attempt = 10 ,m;
            rounds++;
            System.out.println("\n Round"+ rounds+" (Guess from 1-100), Total Attempts: 6");
            while (attempt--> 0) {
                m= scan.nextInt();
                if (m ==n) {
                    score += attempt + 1;
                    wins++;
                    System.out.println("Correct! Score:" + score);
                    break;
                }
                
             if(m<n) {
                	System.out.println("Low" );
            }
            else{
            	System.out.println("High");
            }
                if (attempt > 0) System.out.println("Left: "+ attempt);
            }

            if (attempt< 0) 
            	System.out.println("Out of tries! Number was: " + n);
            System.out.println("Wins: " + wins + "/" + rounds + ", Total Score: " + score);
            System.out.print("Play again? (yes/no): ");
        }   
        while(scan.next().compareToIgnoreCase("yes")==0);
        {
        System.out.println("Thanks! Final Score: " + score);
        }
        scan.close();
    
}}
