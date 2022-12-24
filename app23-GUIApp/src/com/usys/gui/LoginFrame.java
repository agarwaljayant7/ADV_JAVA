package com.usys.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginFrame extends Frame implements ActionListener {

	Label l1, l2;
	TextField tf1, tf2;
	Button b1;
	String result = "";

	public LoginFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setBackground(Color.green);
		this.setTitle("Login Frame");
		this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		l1 = new Label("User Name          ");
		l2 = new Label("Password           ");

		tf1 = new TextField(20);
		tf2 = new TextField(20);

		b1 = new Button(" Login ");

		Font font = new Font("arial", Font.BOLD, 15);
		l1.setFont(font);
		l2.setFont(font);
		tf1.setFont(font);
		tf2.setFont(font);
		b1.setFont(font);

		b1.addActionListener(this);

		this.add(l1);
		this.add(tf1);
		this.add(l2);
		this.add(tf2);
		this.add(b1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonLabel = e.getActionCommand();
		String val1 = tf1.getText();
		String val2 = tf2.getText();

		if (buttonLabel.trim().equals("Login")) {
			if (val1.equals("j") && val2.equals("k")) {
				result = "Welcome";
			} else {
				result = "Login failed";
			}
		}

		repaint();
	}

	@Override
	public void paint(Graphics g) {
		Font font = new Font("arial", Font.BOLD, 35);
		g.setFont(font);
		g.drawString("Status  : " + result, 100, 250);
	}
}
