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
	JPanel panel;
	JButton gtd;
	JButton mht;
	JButton hq;
	JButton gft;
	JToolBar toolbar;
	
	public TTH()
	{
		super("Things to Help");
		//Set variables.
		panel = new JPanel();
		setSize(180*3,180*3);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		toolbar = new JToolBar();
		gtd = new JButton("Good Thought Diary");
		mht = new JButton("Mental Health Tips");
		hq = new JButton("Happy Quotes");
		gft = new JButton("Goals For Today"); 
		
		//Add action listeners so buttons do things.
		gtd.addActionListener(this);
		mht.addActionListener(this);
		hq.addActionListener(this);
		gft.addActionListener(this);
		
		panel.setLayout(new BorderLayout());	
		toolbar.add(gtd);
		toolbar.add(mht);
		toolbar.add(hq);
		toolbar.add(gft);
		panel.add(toolbar,BorderLayout.NORTH); 
		add(panel);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	public static void main(String [] args)
	{
		TTH test = new TTH();
	}
}
