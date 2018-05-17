package main.space.examples;


import main.space.entities.Board;

import javax.swing.*;
import java.awt.*;

public class ShootingMissilesEx extends JFrame{
    public ShootingMissilesEx() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        setSize(400, 300);
        setResizable(false);

        setTitle("Shooting missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ShootingMissilesEx shootingMissilesEx = new ShootingMissilesEx();
            shootingMissilesEx.setVisible(true);
        });
    }
}
