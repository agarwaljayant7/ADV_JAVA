package com.jayant.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.jayant.dao.EmployeeDao;
import com.jayant.dto.Employee;
import com.jayant.factory.ConnectionFactory;
import com.jayant.factory.EmployeeDaoFactory;

public class DataPlayerFrame extends Frame implements ActionListener {

	Button firstButton, nextButton, previousButton, lastButton;

	EmployeeDao employeeDao;
	Employee employee;

	public DataPlayerFrame() {
		employeeDao = EmployeeDaoFactory.getEmployeeDao();
		this.setVisible(true);
		this.setSize(500, 900);
		this.setTitle("Data Player Frame");
		this.setLayout(new FlowLayout());
		this.setBackground(Color.green);
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				ConnectionFactory.close();
				System.exit(0);
				;
			}
		});

		firstButton = new Button("FIRST");
		nextButton = new Button("NEXT");
		previousButton = new Button("PREVIOUS");
		lastButton = new Button("LAST");

		firstButton.addActionListener(this);
		nextButton.addActionListener(this);
		previousButton.addActionListener(this);
		lastButton.addActionListener(this);

		Font font = new Font("arial", Font.BOLD, 25);
		firstButton.setFont(font);
		nextButton.setFont(font);
		previousButton.setFont(font);
		lastButton.setFont(font);

		this.add(firstButton);
		this.add(nextButton);
		this.add(previousButton);
		this.add(lastButton);

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String buttonLabel = actionEvent.getActionCommand();
		employee = employeeDao.getEmployee(buttonLabel);
		repaint();
	}

	@Override
	public void paint(Graphics g) {

		Font font = new Font("consolas", Font.BOLD, 30);
		g.setFont(font);
//		boolean employeeStatus = employeeDao.getEmployeeStatus();
		if (employee != null) {
			g.drawString("Employee Number  : " + employee.getEno(), 100, 200);
			g.drawString("Employee Name    : " + employee.getEname(), 100, 250);
			g.drawString("Employee Salary  : " + employee.getEsal(), 100, 300);
			g.drawString("Employee Address : " + employee.getEaddr(), 100, 350);
		}else {
			
			g.drawString("Employee does not exists ", 100, 250);
		}
	}

}
