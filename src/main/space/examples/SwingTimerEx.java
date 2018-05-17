package main.space.examples;

import main.space.entities.Board;

import javax.swing.*;
import java.awt.*;

public class SwingTimerEx extends JFrame {
    public SwingTimerEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        setResizable(false);
        pack();

        setTitle("Star");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SwingTimerEx swingTimerEx = new SwingTimerEx();
            swingTimerEx.setVisible(true);
        });
    }
}
