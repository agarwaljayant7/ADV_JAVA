package com.jayant.gui;

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

import com.jayant.dao.StudentDao;
import com.jayant.dto.Student;
import com.jayant.factory.ConnectionFactory;
import com.jayant.factory.StudentDaoFactory;

public class RegisterFrame extends Frame implements ActionListener {

	Label sidLabel, snameLabel, saddrLabel;
	TextField sidTextField, snameTextField, saddrTextField;
	Button regButton;
	String status = "";
	
	public RegisterFrame() {
		
		ConnectionFactory.getConnection();
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setBackground(Color.cyan);
		this.setTitle("Student Registration Frame");
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ConnectionFactory.close();
				System.exit(0);
			}
		});
		
		sidLabel = new Label("Student Id   " );
		snameLabel = new Label("Student name ");
		saddrLabel = new Label("Student Address ");
		
		sidTextField = new TextField(25);
		snameTextField = new TextField(25);
		saddrTextField = new TextField(25);
		
		regButton = new Button("Register");
		regButton.addActionListener(this);
		
		Font font = new Font("consolas", Font.BOLD, 25);
		sidLabel.setFont(font);
		snameLabel.setFont(font);
		saddrLabel.setFont(font);
		sidTextField.setFont(font);
		snameTextField.setFont(font);
		saddrTextField.setFont(font);
		regButton.setFont(font);
		
		this.add(sidLabel);this.add(sidTextField);
		this.add(snameLabel);this.add(snameTextField);
		this.add(saddrLabel);this.add(saddrTextField);
		this.add(regButton);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String sid = sidTextField.getText();
		String sname = snameTextField.getText();
		String saddr = saddrTextField.getText();
		
		Student student = new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setSaddr(saddr);
		
		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		status = studentDao.register(student);
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		
		Font font = new Font("arial", Font.BOLD, 35);
		g.setFont(font);
		g.drawString("Status :  " + status, 100, 350);
	}
}
