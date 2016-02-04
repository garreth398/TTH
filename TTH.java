import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.net.URL;
import java.io.Serializable;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TTH extends JFrame implements ActionListener
{
	//Basic variable needed.
	JFrame panel;
	JButton gtd;
	JButton mht;
	JButton hq;
	JButton gft;
	
	public TTH()
	{
		//Set variables.
		panel = new JFrame("Things to Help");
		panel.setSize(180*3,180*3);
		panel.setResizable(true);
		panel.setLocationRelativeTo(null);
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gtd = new JButton("Good Thought Diary");
		mht = new JButton("Mental Health Tips");
		hq = new JButton("Happy Quotes");
		gft = new JButton("Goals For Today");
		
		//Add action listeners so bittons do things.
		gtd.addActionListener(this);
		mht.addActionListener(this);
		hq.addActionListener(this);
		gft.addActionListener(this);
		
		panel.setLayout(new BorderLayout());	
		add(gtd);
		add(mht);
		add(hq);
		add(gft);	
		panel.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	public static void main(String [] args)
	{
		TTH test = new TTH();
	}
}
