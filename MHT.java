import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.net.URL;
import java.io.Serializable;
import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class MHT extends JFrame implements ActionListener
{
	//Basic variable needed.
	JPanel panel;
	JLabel tip;
	JButton refresh;
	Scanner scan;
	File file;
	int len;
	int randTip;
	ArrayList<String> tips;
	
	public MHT() throws IOException
	{
		super("Mental Health Tips");
		//Set variables.
		panel = new JPanel();
		refresh = new JButton("Refresh");
		setSize(180*3,180*3);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setLayout(new FlowLayout());
		panel.setLayout(new BorderLayout());
		
		file = new File("MT.txt");
		scan = new Scanner(file);
		tips = new ArrayList<>();
		while(scan.hasNext())
		{
			String s = scan.nextLine();
			tips.add(s);
		}
		tips.trimToSize();
		
		len = tips.size();
		randTip = (int)(Math.random() * len);
		tip = new JLabel("");
		tip.setText(tips.get(randTip));
		
		refresh.addActionListener(this);
		
		panel.setLayout(new BorderLayout());	 
		add(panel);
		add(refresh, BorderLayout.CENTER);
		add(tip, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == refresh)
		{
			randTip = (int)(Math.random() * len);
			tip.setText("");
			tip.setText(tips.get(randTip));
			add(tip);
		}
	}
}
