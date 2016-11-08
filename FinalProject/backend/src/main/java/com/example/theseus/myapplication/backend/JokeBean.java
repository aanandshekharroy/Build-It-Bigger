package com.example.theseus.myapplication.backend;

import com.example.JokeWizard;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeBean {

    private JokeWizard jokeWizard;
    private String jokeToSend;
    JokeBean(){
        jokeWizard=new JokeWizard();

    }
    public String getJoke(){
        jokeToSend=jokeWizard.getJoke();
        return jokeToSend;
    }
}