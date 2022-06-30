
  /*Santosh 
  May, 30th
  Purpose: to create a ROCK PAPER SCISSORS game
*/
//start of class
import java.util.Scanner;
import java.util.Random;
class Main {
//Main function
  public static void main(String[] args) {

/*DECLARING VARIABLES*/
    
    String selector;
    int bot;
    String user;
    int countUser = 0;
    int countBot = 0;
    String playAgain = ("o");

    Scanner reader = new Scanner (System.in); 
    
/*PRINTING WELCOME MESSAGE AND GAME INSTRUCTIONS*/
    
    System.out.println("");
    System.out.println("---------------WELCOME TO ROCK PAPER SCISSORS---------------");
    System.out.println("");
    System.out.println("The objective of this game is to beat your opponent using rock paper or scissors. You play 1 of the 3 and so does your opponent. Paper beats rock, Rock beats Scissors and Scissors beats Paper. If you both play the same thing, then its a tie.");
    System.out.println("");
    System.out.println("To play, simply select a game mode, then type in ROCK, PAPER or SCISSORS. The game bot will also select ROCK PAPER or SCISSORS. both choices get displayed and the game will determine the winner. If a tie occurs, another round of the game will play until there is a winner.");
    System.out.println("");
    System.out.println("----------------------------------------------------------------");
    System.out.println("");
    
/*PRINTING MAIN MENU WITH 3 CHOICES*/

//do while loop that loops the entire game unless the exit option in the main menu is chosen.
    do{ 
//do while loop that loops the main menu until the user types one of the three appropriate options      
      do{
        
        System.out.println("       MAIN MENU");
        System.out.println("");
        System.out.println("Type 1 for 1 round game");
        System.out.println("-------------------------");
        System.out.println("Type 2 for best of 3");
        System.out.println("-------------------------");
        System.out.println("Type 3 to quit game");
        System.out.println("");
        

        selector = reader.nextLine();
        
/*Validating Menu choice. user must selected 1, 2 or 3 to break loop*/     
      }while (!(selector.equals("1")||selector.equals("2")||selector.equalsIgnoreCase("3")));

/*1 ROUND GAME CODE IF USER SELECTED 1 ROUND OPTION*/

//switch case used to select between 3 different menu options
        switch(selector){

//switch case for 1 round game selection
          case "1":
            System.out.println("");
            System.out.println("WELCOME TO SINGLE ROUND ROCK PAPER SCISSORS");

//do while loop which loops the game if there is a tie
          do{

//do while loop which loops the game if the user inputs anything other than ROCK, PAPER or SCISSORS
            do{
            
/*PRINTING CHOICE BETWEEN ROCK PAPER AND SCISSORS*/          
              System.out.println("");
              System.out.println("----------------------");
              System.out.println("Pick ROCK, PAPER or SCISSORS");
              System.out.println("");

//user gets to type thier choice
              user = reader.nextLine();

//Random function picking numbers from 1-3. These numbers will represent rock, paper or scissors   
              bot = (int)(3*Math.random() +1);

/*PRINTING USER CHOICE AND BOT CHOICE*/
              
//if the random function selected 1, it means the bot selected ROCK
              
              if((bot ==1)&&((user.equalsIgnoreCase("ROCK"))||(user.equalsIgnoreCase("PAPER"))||(user.equalsIgnoreCase("SCISSORS")))){

                System.out.println("");
                System.out.println("YOU Picked: " + user);
                System.out.println("BOT picked: ROCK");
                System.out.println("");
                }

//if the random function selected 2, it means the bot selected PAPER
                
              else if((bot ==2)&&((user.equalsIgnoreCase("ROCK"))||(user.equalsIgnoreCase("PAPER"))||(user.equalsIgnoreCase("SCISSORS")))){

                System.out.println("");
                System.out.println("YOU Picked: " + user);
                System.out.println("BOT Picked: PAPER");
                System.out.println("");
                }

//if the random function selected 3, it means the bot selected SCISSORS
                
              else if((bot ==3)&&((user.equalsIgnoreCase("ROCK"))||(user.equalsIgnoreCase("PAPER"))||(user.equalsIgnoreCase("SCISSORS")))){
              
                System.out.println("");
                System.out.println("YOU Picked: " + user);
                System.out.println("BOT Picked: SCISSORS");
                System.out.println("");
                }

/*DETERMINING GAME OUTCOME*/

//Tie game scenerio
            
                if((user.equalsIgnoreCase("ROCK")&&bot==1)||(user.equalsIgnoreCase("PAPER")&&bot==2)||(user.equalsIgnoreCase("SCISSORS")&&bot==3)){

                  System.out.println("");
                  System.out.println("TIE GAME!");
                  System.out.println("");       
                  }
            
//User winning scenerio      
            
                else if((user.equalsIgnoreCase("ROCK")&&bot==3)||(user.equalsIgnoreCase("PAPER")&&bot==1)||(user.equalsIgnoreCase("SCISSORS")&&bot==2)){
    
                  System.out.println("");
                  System.out.println("YOU WIN!");
                  System.out.println("");
                  System.out.println("----------------------");
                  countUser++; 
                  System.out.println("");
                  System.out.println("Do you want to play again, if so type YES. Otherwise type anything else to return to main menu");
                  playAgain = reader.nextLine();
                  }

//User losing scenerio
                  
                else if((user.equalsIgnoreCase("ROCK")&&bot==2)||(user.equalsIgnoreCase("PAPER")&&bot==3)||(user.equalsIgnoreCase("SCISSORS")&&bot==1)){

                  System.out.println("");
                  System.out.println("YOU LOSE! BOT WINS!");
                  System.out.println("");
                  System.out.println("----------------------");
                  countBot++;
                  System.out.println("");
                  System.out.println("Do you want to play again, if so type YES. Otherwise type anything else to return to main menu");
                  playAgain = reader.nextLine();
                  }

/*LOOPING GAME IF USER INPUTS ANYTHING OTHER THAN ROCK PAPER OR SCISSORS*/
            
            }while(!(user.equalsIgnoreCase("ROCK")||user.equalsIgnoreCase("PAPER")||user.equalsIgnoreCase("SCISSORS")));

/*LOOPING GAME UNTIL THERE IS A WINNER*/
          
          }while(!(countUser >=(1)||countBot >=(1))||playAgain.equalsIgnoreCase("yes"));

//if user wins
            
            if(countUser>=1){
              System.out.println("");
              countUser = 0;
              countBot = 0;
              }

//if bot wins
            
            if(countBot >=1){             
              System.out.println("");
              countUser = 0;
              countBot = 0;
              }
            
//end of switch case 1
              break;
                        
/*BEST OF THREE GAMES CODE IF USER SELECTED THAT OPTION*/       

//switch case from main menu if the user wanted to play 3 round rock paper scissors
          case "2":
            System.out.println("");
            System.out.println("WELCOME TO BEST OF 3 ROCK PAPER SCISSORS.");
            System.out.println("");
            System.out.println("This version of the game keeps you playing multiple rounds until someone reaches a score of 2. A score board is listed after each round and a winner or a tie is declared at the end of each round and an ultimate winner is decided at the end after a score of 2 is achieved.");
              
/*PRINTING CHOICE FOR ROCK PAPER OR SCISSORS*/ 

//loop for if the user wants to play again
            do{
              
//loop for if the score is less than 2, the game loops
              do{
                
//loop for if the user enters something other than rock paper or scissors   
                do{
                  
                  System.out.println("");
                  System.out.println("----------------------");
                  System.out.println("Pick ROCK, PAPER or SCISSORS");
                  System.out.println("");

//user gets to type thier choice
                  
                  user = reader.nextLine();

/*RANDOM FUNCTION ALLOWING FOR BOT SELECTION*/

//random function that choices between 1-3. these numbers will be linked to rock paper or scissors
                  
                  bot = (int)(3*Math.random()+1 );
                
/*PRINTING USER CHOICE AND BOT CHOICE*/

//if random function selects 1 then bot picked rock
                  
                  if((bot ==1)&&((user.equalsIgnoreCase("ROCK"))||(user.equalsIgnoreCase("PAPER"))||(user.equalsIgnoreCase("SCISSORS")))){

                    System.out.println("");
                    System.out.println("YOU Picked " + user);
                    System.out.println("BOT picked: ROCK");
                    System.out.println("");
                    
                    }
//if random function selects 2 then bot picked paper 
                    
                  else if((bot ==2)&&((user.equalsIgnoreCase("ROCK"))||(user.equalsIgnoreCase("PAPER"))||(user.equalsIgnoreCase("SCISSORS")))){
              
                    System.out.println("");
                    System.out.println("YOU Picked " + user);
                    System.out.println("BOT picked: PAPER");
                    System.out.println("");
                    }

//if random function selects 3 then bot picked scissors
                    
                  else if((bot ==3)&&((user.equalsIgnoreCase("ROCK"))||(user.equalsIgnoreCase("PAPER"))||(user.equalsIgnoreCase("SCISSORS")))){
              
                    System.out.println("");
                    System.out.println("YOU Picked " + user);
                    System.out.println("BOT picked: SCISSORS");
                    System.out.println("");  
                    }
                
/*DETERMINING GAME OUTCOME*/ 

//tie round scenerio
                  
                  if((user.equalsIgnoreCase("ROCK")&&bot==1)||(user.equalsIgnoreCase("PAPER")&&bot==2)||(user.equalsIgnoreCase("SCISSORS")&&bot==3)){
    
                    System.out.println("TIE ROUND!");
                    System.out.println("");
                    System.out.println("SCOREBOARD");
                    System.out.println("..........");
                    System.out.println("YOU " + countUser);
                    System.out.println("BOT " + countBot);
                    }

//user winning round scenerio
                    
                  else if((user.equalsIgnoreCase("ROCK")&&bot==3)||(user.equalsIgnoreCase("PAPER")&&bot==1)||(user.equalsIgnoreCase("SCISSORS")&&bot==2)){

                    System.out.println("YOU WIN THIS ROUND!");
                    System.out.println("");
                    System.out.println("SCOREBOARD");
                    System.out.println("..........");
                    System.out.println("YOU " + ++countUser);
                    System.out.println("BOT " + countBot);
                    }  
                    
//user losing round scenerio
                    
                  else if((user.equalsIgnoreCase("ROCK")&&bot==2)||(user.equalsIgnoreCase("PAPER")&&bot==3)||(user.equalsIgnoreCase("SCISSORS")&&bot==1)){
  
                    System.out.println("YOU LOSE BOT WINS THIS ROUND!");
                    System.out.println("");
                    System.out.println("SCOREBOARD");
                    System.out.println("..........");
                    System.out.println("YOU " + countUser);
                    System.out.println("BOT " + ++countBot);
                    }

/*LOOPING GAME IF USER DOESNT SELECT ROCK PAPER OR SCISSORS*/
                
                }while(!(user.equalsIgnoreCase("ROCK")||user.equalsIgnoreCase("PAPER")||user.equalsIgnoreCase("SCISSORS"))); 

          
/*LOOPING GAME UNTIL EITHER USER OR BOT REACH A SCORE OF 2*/
              
              }while(!(countUser >=(2)||countBot >=(2)));

            System.out.println("------------------");
            System.out.println("END OF GAME!");
            System.out.println("");

//if the user wins the whole game by having a score of 2  
              
                if(countUser >=2){
                  System.out.println("YOUR THE ULTIMATE WINNER!!!! YAAAY!!!!"); 
                  System.out.println("----------------------------------");
                  System.out.println("");
                  countUser = 0;
                  countBot = 0;
                  
//user asked if they want to play again or return to main menu
                  
                  System.out.println("Do you want to play again, if so type YES. Otherwise type anything else to return to main menu");
                  playAgain = reader.nextLine();
                  }

//if the bot wins the whole game by having a score of 2
                if(countBot >=2){
                  System.out.println("YOUR THE ULTIMATE LOSER!!! BOT IS KING!!!");
                  System.out.println("----------------------------------");
                  System.out.println("");
                  countUser = 0;
                  countBot = 0;

//user asked if they want to play again or return to main menu
                  
                  System.out.println("Do you want to play again, if so type YES. Otherwise type anything else to return to main menu");
                  playAgain = reader.nextLine();
                  }

/*LOOPING GAME IF USER TYPES YES TO WANTING TO PLAY AGAIN*/
              
            }while(playAgain.equalsIgnoreCase("yes"));{
              
            }
           
              

/*SWITCH CASE EXIT FUNCTION IF EXIT OPTION SELECTED FROM MAIN MENU*/
            
          case "3":
            System.out.println("");         
            break;  
        }
      
/*LOOP FUNCTION FOR ENTIRE GAME UNTIL EXIT OPTION (3) IS SELECTED WHICH ENDS GAME*/
      
    }while(!(selector.equalsIgnoreCase("3")));
    
//printing goodbye message
    System.out.println("--------------------------------");
    System.out.println("HOPE YOU HAD FUN! BYE!");
   
  }//End of main function
}//End of class