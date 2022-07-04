package com.qa.rockpapaerscissors;

import java.util.Random;
import java.util.Scanner;

public class Runner {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //promptAnswer();
        //randomGenerator();
        checkAnswer(promptAnswer(), randomGenerator());
    }

    public static RPS promptAnswer() {
        System.out.println("enter ROCK, PAPER or SCISSORS");
        String input = scan.next();
        if(input.equals("ROCK")) {
            return RPS.ROCK;
        }
        else if(input.equals("PAPER")) {
            return RPS.PAPER;
        }
        else {
            return RPS.SCISSOR;
        }
    }

    public static RPS randomGenerator() {
        Random rand = new Random();
        int randInt = rand.nextInt(3);

        if(randInt == 1) {
            return RPS.ROCK;
        }
        else if (randInt == 2) {
            return RPS.PAPER;
        }
        else{
            return RPS.SCISSOR;
        }
    }

    //rock beats scissor, defeated by paper
    //paper beats rock, defeated by scissors
    //scissors beat paper, defeated by rock
    public static void checkAnswer(RPS playerOne, RPS playerTwo) {
        if(playerOne == RPS.ROCK) {
            System.out.println("    _______\n" +
                    "---'   ____)\n" +
                    "      (_____)\n" +
                    "      (_____)\n" +
                    "      (____)\n" +
                    "---.__(___)");
            if(playerTwo == RPS.SCISSOR) {
                System.out.println("        PLAYER ONE WINS        ");
                System.out.println("_______\n" +
                        "____(____   '---\n" +
                        "(______          \n" +
                        "(__________       \n" +
                        "(____)      \n" +
                        "(___)__.---");
            }
            else if (playerTwo == RPS.PAPER){
                System.out.println("        PLAYER TWO WINS        ");
                System.out.println("_______\n" +
                        "____(____   '---\n" +
                        "(______          \n" +
                        "(_______          \n" +
                        "(_______         \n" +
                        "(__________.---");
            }
            else {
                System.out.println("        DRAW        ");
                System.out.println("_______\n" +
                        "(____   '---\n" +
                        "(_____)      \n" +
                        "(_____)      \n" +
                        "(____)      \n" +
                        "(___)__.---");
            }
        }
        else if(playerOne == RPS.PAPER) {
            System.out.print("    _______\n" +
                    "---'   ____)____\n" +
                    "          ______)\n" +
                    "          _______)\n" +
                    "         _______)\n" +
                    "---.__________)");
            if(playerTwo == RPS.ROCK) {
                //player one wins
                System.out.println("        PLAYER ONE WINS        ");
                System.out.println("_______\n" +
                        "(____   '---\n" +
                        "(_____)      \n" +
                        "(_____)      \n" +
                        "(____)      \n" +
                        "(___)__.---");
            }
            else if(playerTwo == RPS.SCISSOR){
                //player two wins
                System.out.println("        PLAYER TWO WINS        ");
                System.out.println("_______\n" +
                        "____(____   '---\n" +
                        "(______          \n" +
                        "(__________       \n" +
                        "(____)      \n" +
                        "(___)__.---");
            }
            else {
                System.out.println("        DRAW        ");
                System.out.println("_______\n" +
                        "____(____   '---\n" +
                        "(______          \n" +
                        "(_______          \n" +
                        "(_______         \n" +
                        "(__________.---");
            }
        }
        else {
            System.out.print("    _______\n" +
                    "---'   ____)____\n" +
                    "          ______)\n" +
                    "       __________)\n" +
                    "      (____)\n" +
                    "---.__(___)");
            if(playerTwo == RPS.PAPER) {
                //player one wins
                System.out.println("        PLAYER ONE WINS        ");
                System.out.println("_______\n" +
                        "____(____   '---\n" +
                        "(______          \n" +
                        "(_______          \n" +
                        "(_______         \n" +
                        "(__________.---");
            }
            else if(playerTwo == RPS.ROCK){
                //player two wins
                System.out.println("        PLAYER TWO WINS        ");
                System.out.println("_______\n" +
                        "(____   '---\n" +
                        "(_____)      \n" +
                        "(_____)      \n" +
                        "(____)      \n" +
                        "(___)__.---");
            }
            else {
                System.out.println("        DRAW        ");
                System.out.println("_______\n" +
                        "____(____   '---\n" +
                        "(______          \n" +
                        "(_______          \n" +
                        "(_______         \n" +
                        "(__________.---");
            }
        }
    }
}