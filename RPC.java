
/**
 * Write a description of class Main here.
 *
 * Emma Lee
 * Problem Set 3B
 */
import java.util.Scanner;

public class RPC
{
    public static void Main() {
        
    boolean play = true;
    int move=0;
    int computer=0;
    int win = 0; //lose
    final int badRock = -1;
    final int badPaper = -2;
    final int badCrossblade = -3;
    final int rock = 1;
    final int paper = 2;
    final int crossblade = 3;
    

    
    
    //
    
    Scanner in = new Scanner (System.in);
    
    
    
    String myMove = "";
    String computerMove = "";
    System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
    String myResponse = in.nextLine();
    
    if (myResponse.length()>=0){
        if (myResponse.toLowerCase().lastIndexOf("paper") == myResponse.length()-5){
            move = 2;
        }
        if (myResponse.toLowerCase().lastIndexOf("rock") == myResponse.length()-4){
            move = 1;
        }
        if (myResponse.toLowerCase().lastIndexOf("crossblade") == myResponse.length()-10){
            move = 3;
        }
        
    } else {
        System.out.println("Cannot play.");
        play = false;
    }

        
    if (myResponse.length() < 50 && play) {
        if (move == 1) {
            computer = 2;
        }
        if (move == 2) {
            computer = 3;
        }
        if (move == 3) {
            computer = 1;
        }
        
        System.out.println("Length under 50. Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier!");
        win = 0;
    }
    //When you win, every other move not shown below is lose ( win is set as 0).
    if (myResponse.length() >= 50 && play) {
        computer = (int) (Math.random()*3 + 1);
        if (computer == move) {
            win = 2; //tie
        }
        if (computer == paper && move == crossblade) {
            win = 1; //my win
        }
        if (computer == rock && move == paper) {
            win = 1; //my win
        }
        if (computer == crossblade && move == rock) {
            win = 1; //my win
        }
    }
       if (move == rock){
           myMove = "rock";
       }
       if (move == paper){
           myMove = "paper";
       }
       if (move == crossblade){
           myMove = "crossblade";
       }
       if (computer == rock) {
           computerMove = "rock";
       }
       if (computer == paper) {
           computerMove = "paper";
       }
       if (computer == crossblade) {
           computerMove = "crossblade";
       }
    
       
       if (win == 0){
           System.out.println("You lose: My move: " + myMove + " Computer Move: " + computerMove);
       }
        if (win == 1){
           System.out.println("You win!: My move: " + myMove + " Computer Move: " + computerMove);
           System.out.println("You: As I predicted, I have won this battle. The kingdom is MINE!");
       }
        if (win == 2){
           System.out.println("You tied! : My move: " + myMove + " Computer Move: " + computerMove);
           System.out.println("You: Unbelievable! We have tied! *Eye twitches*");
       }
    
}
}

    
    

           
   
