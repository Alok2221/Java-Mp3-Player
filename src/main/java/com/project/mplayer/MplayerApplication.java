package com.project.mplayer;

import com.project.mplayer.window.MainWindow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class MplayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MplayerApplication.class, args);

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainWindow mainWindow = new MainWindow();
				mainWindow.show();
			}
		});
	}


}
