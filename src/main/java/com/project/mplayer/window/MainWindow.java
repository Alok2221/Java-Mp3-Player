package com.project.mplayer.window;

import javax.swing.*;

public class MainWindow {

    private final JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("MP3 Player");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 500);
        window.setLocationRelativeTo(null);

    }

    public void show() {
        window.setVisible(true);

    }


}
