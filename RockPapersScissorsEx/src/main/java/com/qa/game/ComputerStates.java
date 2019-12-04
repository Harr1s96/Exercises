package com.qa.game;

import java.util.*; 

public class ComputerStates {

	public States playRandom() {

        Random rand = new Random(); 
        List<States> listOfStates = new ArrayList<>();

        listOfStates.add(States.ROCK);
        listOfStates.add(States.PAPER);
        listOfStates.add(States.SCISSOR);

        return listOfStates.get(rand.nextInt(listOfStates.size())); 

    }
}