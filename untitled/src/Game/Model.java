package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import Game.*;
public class Model {
    private static int i=-1;
    public static void func(int integ) {
        i = integ;
    }

    public static void playRound(JFrame frame, JLabel label, JLabel label_round, JLabel label_score) {

        Random rnd = new Random();
        String[] turns = {"Rock", "Paper", "Scissors", "Spock", "Python"};
        String PlayerTurn;
        String AITurn;


        boolean UserWon = false;
        boolean AIWon = false;
        boolean DRAW = false;
        int PlayerWins = 0;
        int AIWins = 0;
        int RoundCount = 1;

        while(UserWon == false && AIWon == false && DRAW == false){

            label_round.setText("Round "+RoundCount);

            PlayerTurn = turns[i];

            int AITurnInd = rnd.nextInt(5);
            AITurn = turns[AITurnInd];
            label_round.setText("AI have chosen:"+AITurn);
            if(PlayerTurn.equals("Rock") && AITurn.equals("Scissors")){
                UserWon = true;
            } else if(PlayerTurn.equals("Scissors") && AITurn.equals("Rock")){
                AIWon = true;
            } else if(PlayerTurn.equals("Paper") && AITurn.equals("Scissors")){
                AIWon = true;
            } else if(PlayerTurn.equals("Scissors") && AITurn.equals("Paper")){
                UserWon = true;
            } else if(PlayerTurn.equals("Paper") && AITurn.equals("Rock")){
                UserWon = true;
            } else if(PlayerTurn.equals("Rock") && AITurn.equals("Paper")){
                AIWon = true;
            } else if(PlayerTurn.equals("Python") && AITurn.equals("Rock")){
                AIWon = true;
            } else if(PlayerTurn.equals("Rock") && AITurn.equals("Python")){
                UserWon = true;
            } else if(PlayerTurn.equals("Python") && AITurn.equals("Paper")){
                UserWon = true;
            } else if(PlayerTurn.equals("Paper") && AITurn.equals("Python")){
                AIWon = true;
            } else if(PlayerTurn.equals("Python") && AITurn.equals("Scissors")){
                AIWon = true;
            } else if(PlayerTurn.equals("Scissors") && AITurn.equals("Python")){
                UserWon = true;
            } else if(PlayerTurn.equals("Python") && AITurn.equals("Spock")){
                UserWon = true;
            } else if(PlayerTurn.equals("Spock") && AITurn.equals("Python")){
                AIWon = true;
            } else if(PlayerTurn.equals("Spock") && AITurn.equals("Rock")){
                UserWon = true;
            } else if(PlayerTurn.equals("Rock") && AITurn.equals("Spock")){
                AIWon = true;
            } else if(PlayerTurn.equals("Spock") && AITurn.equals("Paper")){
                AIWon = true;
            } else if(PlayerTurn.equals("Paper") && AITurn.equals("Spock")){
                UserWon = true;
            } else if(PlayerTurn.equals("Spock") && AITurn.equals("Scissors")){
                UserWon = true;
            } else if(PlayerTurn.equals("Scissors") && AITurn.equals("Spock")){
                AIWon = true;
            } else {
                DRAW = true;
            }

            if(UserWon){
                label.setText("WIN");
                label_score.setText("1:0");
            }else if (AIWon){
                label.setText("LOSE");
                label_score.setText("0:1");
            }else if(DRAW){
                label.setText("DRAW");
            }
            RoundCount +=1;
        }

    }

    public Model(){

    }

}
