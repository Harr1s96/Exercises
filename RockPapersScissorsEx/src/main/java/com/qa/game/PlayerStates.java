package com.qa.game;

import java.util.*;

public class PlayerStates {

	public States playPaper() {

        return States.PAPER;
	}

	public States playRock() {

        return States.ROCK;
	}

	public States playScissor() {

        return States.SCISSOR;

    }
    
    public States playRandom() {

        Random rand = new Random(); 
        List<States> listOfStates = new ArrayList<>();

        listOfStates.add(States.ROCK);
        listOfStates.add(States.PAPER);
        listOfStates.add(States.SCISSOR);

        return listOfStates.get(rand.nextInt(listOfStates.size())); 

    }

}
