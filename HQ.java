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

public class HQ extends JFrame implements ActionListener
{
	//Basic variable needed.
	JPanel panel;
	JButton refresh;
	JLabel quote;
	ArrayList<String> quotes;
	File file;
	Scanner scan;
	int len;
	int randQuote;
	
	public HQ() throws IOException
	{
		super("Happy Quotes");
		//Set variables.
		panel = new JPanel();
		refresh = new JButton("Refresh");
		
		setSize(180*3,180*3);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setLayout(new FlowLayout());
		panel.setLayout(new BorderLayout());
		
		quotes = new ArrayList<>();
		file = new File("hq.txt");
		scan = new Scanner(file);

		while(scan.hasNext())
		{
			String s = scan.nextLine();
			quotes.add(s);
		}
		
		quotes.trimToSize();
		len = quotes.size();
		
		randQuote = (int)(Math.random() * len);
		quote = new JLabel("");
		quote.setText(quotes.get(randQuote));
		
		refresh.addActionListener(this);
		
		panel.setLayout(new BorderLayout());
		add(panel);
		add(refresh, BorderLayout.CENTER);
		add(quote, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == refresh)
		{
			randQuote = (int)(Math.random() * len);
			quote.setText("");
			quote.setText(quotes.get(randQuote));
			add(quote);
		}
	}
}
