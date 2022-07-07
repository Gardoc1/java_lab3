package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Game.*;
public class View extends JFrame{


    private JFrame frame;
    private JFrame frame2;
    public JFrame frame3;
    private JFrame frame4;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    public JLabel label_text;
    public JLabel label_score;
    public JLabel label_round;
    private JButton NGbutton;
    private JButton AboutButton;
    private JButton ExitButton;
    private JButton HSbutton;
    private JButton BackButton;
    private JButton BackButton2;
    public JButton RockButton;
    public JButton PaperButton;
    public JButton ScissorsButton;
    public JButton PythonButton;
    public JButton SpockButton;

    public View(){
        frame = new JFrame("Main menu");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // верстка главного меню
        NGbutton = new JButton("New game");
        NGbutton.setBounds(100, 100, 200, 50);
        HSbutton = new JButton("High Scores");
        HSbutton.setBounds(100, 200, 200, 50);
        AboutButton = new JButton("About");
        AboutButton.setBounds(100, 300, 200, 50);
        ExitButton = new JButton("Exit");
        ExitButton.setBounds(100, 400, 200, 50);
        frame.add(NGbutton);
        frame.add(HSbutton);
        frame.add(AboutButton);
        frame.add(ExitButton);

        label = new JLabel("ROCK PAPER SCISSORS GAME");
        label.setBounds(100, 0, 1000, 100);
        frame.add(label);

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame2 = new JFrame("About");
        frame2.setSize(600, 600);
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);


        label2 = new JLabel("Rules");
        label2.setBounds(300, 0, 1000, 100);
        frame2.add(label2);
        JLabel label_rule1 = new JLabel("Rock beats Scissors and Python");
        label_rule1.setBounds(100, 30, 1000, 100);
        frame2.add(label_rule1);
        JLabel label_rule2 = new JLabel("Paper beats Rock and Spock");
        label_rule2.setBounds(100, 70, 1000, 100);
        frame2.add(label_rule2);
        JLabel label_rule3 = new JLabel("Scissors beats Paper and Python");
        label_rule3.setBounds(100, 100, 1000, 100);
        frame2.add(label_rule3);
        JLabel label_rule4 = new JLabel("Python beats Paper and Spock");
        label_rule4.setBounds(100, 130, 1000, 100);
        frame2.add(label_rule4);
        JLabel label_rule5 = new JLabel("Spock beats Scissors and Rock");
        label_rule5.setBounds(100, 160, 1000, 100);
        frame2.add(label_rule5);


        label3 = new JLabel("COMING SOON");
        label3.setBounds(100, 0, 1000, 100);


        BackButton = new JButton("Back");
        BackButton.setBounds(100, 500, 200, 50);
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



        frame3 = new JFrame("Game");
        frame3.setSize(600, 600);
        frame3.setLayout(null);
        frame3.setLocationRelativeTo(null);

        frame4 = new JFrame("High scores");
        frame4.setSize(600, 600);
        frame4.setLayout(null);
        frame4.setLocationRelativeTo(null);

        BackButton2 = new JButton("Back");
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

        label_text = new JLabel("CHOOSE AN OPTION");
        label_text.setBounds(100, 200, 1000, 100);
        frame3.add(label_text);

        label_score = new JLabel("0:0");
        label_score.setBounds(100, 100, 1000, 100);
        label_score.setVisible(false);
        frame3.add(label_score);

        label_round = new JLabel("Round: 1");
        label_round.setBounds(100, 0, 1000, 100);
        frame3.add(label_round);

        RockButton = new JButton("Камень");
        RockButton.setBounds(0, 400, 100, 50);
        frame3.add(RockButton);

        PaperButton = new JButton("Бумага");
        PaperButton.setBounds(100, 400, 100, 50);
        frame3.add(PaperButton);

        ScissorsButton = new JButton("Ножницы");
        ScissorsButton.setBounds(200, 400, 100, 50);
        frame3.add(ScissorsButton);

        PythonButton = new JButton("Питон");
        PythonButton.setBounds(300, 400, 100, 50);
        frame3.add(PythonButton);

        SpockButton = new JButton("Спок");
        SpockButton.setBounds(400, 400, 100, 50);
        frame3.add(SpockButton);

        NGbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.setVisible(true);
                frame.setVisible(false);
            }
        });

        frame.setVisible(true);

    }




}