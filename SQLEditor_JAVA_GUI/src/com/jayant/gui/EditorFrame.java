package com.jayant.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.jayant.dao.EditorDao;
import com.jayant.factories.ConnectionFactory;
import com.jayant.factories.EditorDaoFactory;

public class EditorFrame extends Frame implements ActionListener {

	Label label;
	TextArea textArea;
	Button button;
	boolean flag = false;
	EditorDao editorDao = EditorDaoFactory.getEditorDao();
	
	static {
		ConnectionFactory.getConnection();
	}
	public EditorFrame() {
		this.setVisible(true);
		this.setSize(800, 600);
		this.setTitle("SQL Editor Frame");
		this.setLayout(new FlowLayout());
		this.setBackground(Color.pink);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				ConnectionFactory.close();
				System.exit(0);
			}
		});
		
		label = new Label("SQL Editor     ");
		textArea = new TextArea(3, 35);
		button = new Button("Execute");
		button.addActionListener(this);
		
		Font font = new Font("arial", Font.BOLD, 25);
		label.setFont(font);
		textArea.setFont(font);
		button.setFont(font);
		
		this.add(label);
		this.add(textArea);
		this.add(button);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String query = textArea.getText();
		flag = editorDao.executeUserQuery(query);
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		Font font = new Font("arial", Font.BOLD, 25);
		g.setFont(font);
		
		if(flag) {
			
		}else {
			int rowCount = editorDao.getRowCount();
			g.drawString("RowCount : " + rowCount, 100, 400);
		}
	}

}










