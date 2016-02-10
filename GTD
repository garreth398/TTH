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

public class GTD extends JFrame implements ActionListener
{
	//Basic variable needed.
	JPanel panel;
	JButton tth;
	JButton mht;
	JButton hq;
	JButton gft;
	JToolBar toolbar;
	
	public GTD()
	{
		super("Good Thoughts Diary");
		//Set variables.
		panel = new JPanel();
		setSize(180*3,180*3);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		toolbar = new JToolBar();
		tth = new JButton("Things To Help");
		mht = new JButton("Mental Health Tips");
		hq = new JButton("Happy Quotes");
		gft = new JButton("Goals For Today"); 
		
		//Add action listeners so buttons do things.
		tth.addActionListener(this);
		mht.addActionListener(this);
		hq.addActionListener(this);
		gft.addActionListener(this);
		
		panel.setLayout(new BorderLayout());	
		toolbar.add(tth);
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
}
