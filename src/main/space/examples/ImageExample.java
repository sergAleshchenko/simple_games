package main.space.examples;

import main.space.entities.Board;

import javax.swing.*;
import java.awt.*;

public class ImageExample extends JFrame{
    public ImageExample() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        pack();

        setTitle("Bardejov");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ImageExample imageExample = new ImageExample();
            imageExample.setVisible(true);
        });
    }
}
