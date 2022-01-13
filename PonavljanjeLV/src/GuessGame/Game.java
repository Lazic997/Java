package GuessGame;

import java.util.Scanner;

public class Game {
   
    public static void main(String[] args){
        
        int max = 20;
        int min = 1;
        int randomWinNum = (int)(Math.random()*(max-min+1)+min);
        int guessNumber = 0;
        int pBr = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n\t Guess Game");
        System.out.println("\nPokusajte pogoditi broj izmedju 1 i 20! (u pitanju su cijeli brojevi)");
        System.out.println("Unesite zeljeni broj: ");
        
        do{
            
            guessNumber = input.nextInt();
            pBr ++;
            
            if(guessNumber <1 || guessNumber > 20){
                System.out.println("Unjeli ste neispravan broj, molimo unesite broj u intervalu 1-20! (u pitanju su cijeli brojevi)");
            }
            else if(guessNumber > 1 || guessNumber < 20){
                if(guessNumber > randomWinNum){
                    System.out.println("Dobar pokusaj, ali broj koji ste unjeli veci je od dobitnog broja!\nPokusajte ponovno!");
                }
                else if(guessNumber < randomWinNum){
                    System.out.println("Dobar pokusaj, ali broj koji ste unjeli manji je od dobitnog broja!\nPokusajte ponovno!");
                }
                else{
                    System.out.println("Cestitamo pogodili ste broj koji je bio: " + randomWinNum);
                    System.out.print("Broj pokusaja: " + pBr);
                }
            }
            
        }while(guessNumber != randomWinNum);
    }

}
