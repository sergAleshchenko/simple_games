package main.examples;

import main.Board;

import javax.swing.*;
import java.awt.*;

public class CollisionEx extends JFrame {
    public CollisionEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());
        setResizable(false);
        pack();

        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            CollisionEx collisionEx = new CollisionEx();
            collisionEx.setVisible(true);
        });
    }
}
