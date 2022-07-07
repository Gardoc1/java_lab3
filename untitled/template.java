//old working version in case something goes wrong
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


public class Main {


    static void WriteScoresToTheFile(int var1ToWrite, int var2ToWrite) {
        try(FileWriter writer = new FileWriter("aboba.txt")){
            String toAppend = "Wins: " + var1ToWrite + " Loses: " + var2ToWrite;
            writer.append(toAppend);
        } catch(IOException ex) {
            System.out.println("Aboba!");
        }
    }

    static String[] ReadScoresToTheFile() {
        char[] buffer = new char[0];
        try (FileReader reader = new FileReader("aboba.txt")) {
            int c;
            buffer = new char[256];
            while ((c = reader.read(buffer)) > 0) {
                if (c < 256) {
                    buffer = Arrays.copyOf(buffer, c);
                }
            }
        } catch (IOException ex) {
            System.out.println("Похоже не удалось открыть файл...");
        }
        String array = new String(buffer);
        String[] elems = array.split("\\s+");
        String[] toReturn = {elems[1], elems[3]};
        return toReturn;
    }
    static int i=-1;

    static void func(int integ) {
        i = integ;
    }

    static void playRound(JFrame frame, JLabel label, JLabel label_round, JLabel label_score) {


        Random rnd = new Random();
        String[] turns = {"Камень", "Бумага", "Ножницы"};
        String PlayerTurn;
        String AITurn;








        //String[] scores = ReadScoresToTheFile();

        //Scanner scanner = new Scanner(System.in);

        //int PlayerWinsAtAll = Integer.parseInt(scores[0]);
        //int PlayerLosesAtAll = Integer.parseInt(scores[1]);


        boolean UserWon = false;
        boolean AIWon = false;
        boolean DRAW = false;
        int PlayerWins = 0;
        int AIWins = 0;
        int RoundCount = 1;

        while(UserWon == false && AIWon == false && DRAW == false){

            label_round.setText("Round "+RoundCount);
            //label.setText("Enter your choice");

            PlayerTurn = turns[i];

//            while(!(PlayerTurn.equals("Камень") || PlayerTurn.equals("Ножницы") || PlayerTurn.equals("Бумага"))) {
//                label.setText("Нет такой команды!");
//                label.setText("Попробуйте ввести заново.");
//                PlayerTurn = scanner.nextLine();
//            }
            int AITurnInd = rnd.nextInt(3);
            AITurn = turns[AITurnInd];
            label_round.setText("AI have chosen:"+AITurn);
            if(PlayerTurn.equals("Камень") && AITurn.equals("Ножницы")){
                UserWon = true;
            } else if(PlayerTurn.equals("Ножницы") && AITurn.equals("Камень")){
                AIWon = true;
            } else if(PlayerTurn.equals("Бумага") && AITurn.equals("Ножницы")){
                AIWon = true;
            } else if(PlayerTurn.equals("Ножницы") && AITurn.equals("Бумага")){
                UserWon = true;
            } else if(PlayerTurn.equals("Бумага") && AITurn.equals("Камень")){
                UserWon = true;
            } else if(PlayerTurn.equals("Камень") && AITurn.equals("Бумага")){
                AIWon = true;
            } else {
                DRAW = true;
            }

            if(UserWon){
                label.setText("WIN");
                label_score.setText("1:0");
                //PlayerWins += 1;
                //UserWon = false;
            }else if (AIWon){
                label.setText("LOSE");
                label_score.setText("0:1");
                //AIWins += 1;
                //AIWon = false;
            }else if(DRAW){
                label.setText("DRAW");
            }
            //label_score.setText("Score:"+"\n"+PlayerWins+":"+AIWins);
            RoundCount +=1;
        }
//        if (PlayerWins > AIWins){
//            label.setText("You win!");
//            //PlayerWinsAtAll++;
//            //WriteScoresToTheFile(PlayerWinsAtAll, PlayerLosesAtAll);
//        } else{
//            label.setText("You lost(");
//            //PlayerLosesAtAll++;
//            //WriteScoresToTheFile(PlayerWinsAtAll, PlayerLosesAtAll);
//        }

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Main menu");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // верстка главного меню
        JButton NGbutton = new JButton("New game");
        NGbutton.setBounds(100, 100, 200, 50);
        JButton HSbutton = new JButton("High Scores");
        HSbutton.setBounds(100, 200, 200, 50);
        JButton AboutButton = new JButton("About");
        AboutButton.setBounds(100, 300, 200, 50);
        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(100, 400, 200, 50);
        frame.add(NGbutton);
        frame.add(HSbutton);
        frame.add(AboutButton);
        frame.add(ExitButton);


        JLabel label = new JLabel("ROCK PAPER SCISSORS PRO MLG CYBER VIDEO GAME BOIIII");
        label.setBounds(100, 0, 1000, 100);
        frame.add(label);


        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JFrame frame2 = new JFrame("About");
        frame2.setSize(600, 600);
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);


        JLabel label2 = new JLabel("Rules");
        label2.setBounds(100, 0, 1000, 100);
        frame2.add(label2);


        JLabel label3 = new JLabel("COMING SOON");
        label3.setBounds(100, 0, 1000, 100);


        JButton BackButton = new JButton("Back");
        BackButton.setBounds(100, 100, 200, 50);
        frame2.add(BackButton);




        AboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(true);
                frame.setVisible(false);
            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.setVisible(false);
                frame.setVisible(true);
            }
        });



        JFrame frame3 = new JFrame("Game");
        frame3.setSize(600, 600);
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null);

        JFrame frame4 = new JFrame("High scores");
        frame4.setSize(600, 600);
        frame4.setLayout(null);
        frame4.setLocationRelativeTo(null);

        JButton BackButton2 = new JButton("Back");
        BackButton2.setBounds(100, 100, 200, 50);
        frame4.add(BackButton2);
        frame4.add(label3);


        BackButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame4.setVisible(false);
                frame.setVisible(true);
            }
        });

        HSbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame4.setVisible(true);
                frame.setVisible(false);
            }
        });


        JLabel label_text = new JLabel("CHOOSE AN OPTION");
        label_text.setBounds(100, 200, 1000, 100);
        frame3.add(label_text);

        JLabel label_score = new JLabel("0:0");
        label_score.setBounds(100, 100, 1000, 100);
        label_score.setVisible(false);
        frame3.add(label_score);

        JLabel label_round = new JLabel("Round: 1");
        label_round.setBounds(100, 0, 1000, 100);
        frame3.add(label_round);

        JButton RockButton = new JButton("Камень");
        RockButton.setBounds(0, 400, 100, 50);
        frame3.add(RockButton);

        JButton PaperButton = new JButton("Бумага");
        PaperButton.setBounds(100, 400, 100, 50);
        frame3.add(PaperButton);

        JButton ScissorsButton = new JButton("Ножницы");
        ScissorsButton.setBounds(200, 400, 100, 50);
        frame3.add(ScissorsButton);


        RockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                func(0);
                //label_text.setText(String.valueOf(i)); это была просто проверка работает ли кнопка
                playRound(frame3, label_text, label_round, label_score);
            }
        });

        PaperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                func(1);
                //label_text.setText(String.valueOf(i));
                playRound(frame3, label_text, label_round, label_score);
            }
        });

        ScissorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                func(2);
                //label_text.setText(String.valueOf(i));
                playRound(frame3, label_text, label_round, label_score);
            }
        });


        NGbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(true);
                frame.setVisible(false);
            }
        });


        //frame.pack();
        frame.setVisible(true);
    }
}