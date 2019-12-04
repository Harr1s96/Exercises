package com.qa.game;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        ComputerStates p2 = new ComputerStates();
        PlayerStates p1 = new PlayerStates();
        States myState;

        int turns = 0;

        while (turns <= 2) {
            
            String userInput = null;
             
            while (userInput != null) {
                userInput = scan.nextLine();

                switch (userInput) {

                    case "ROCK":
                        p1.playRock();
                        break;                    
                }
             }
            States myState = p1.playRandom();
            States compState = p2.playRandom();


            if (compState.equals(States.PAPER) && myState.equals(States.ROCK)) {
                System.out.println("Computer " + Outcomes.WIN);
                turns++;
            }

            else if (compState.equals(States.SCISSOR) && myState.equals(States.PAPER)) {
                System.out.println("Computer " + Outcomes.WIN);
                turns++;

            }

            else if (compState.equals(States.ROCK) && myState.equals(States.SCISSOR)) {
                System.out.println("Computer " + Outcomes.WIN);
                turns++;
            }

            else if (compState.equals(myState)) {
                System.out.println("It is a " + Outcomes.DRAW);
                turns++;
            }

            else {
                System.out.println("You " + Outcomes.WIN);
                turns++;
            }

        }
    }
}

