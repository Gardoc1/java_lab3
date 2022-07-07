package Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Game.*;


public class Controller {

    public Controller(Model model, View view) {

        view.RockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.func(0);
                model.playRound(view.frame3, view.label_text, view.label_round, view.label_score);
            }
        });

        view.PaperButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.func(1);
                model.playRound(view.frame3, view.label_text, view.label_round, view.label_score);
            }
        });

        view.ScissorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.func(2);
                model.playRound(view.frame3, view.label_text, view.label_round, view.label_score);
            }
        });

        view.PythonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.func(4);
                model.playRound(view.frame3, view.label_text, view.label_round, view.label_score);
            }
        });

        view.SpockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.func(3);
                model.playRound(view.frame3, view.label_text, view.label_round, view.label_score);
            }
        });
    }
}
