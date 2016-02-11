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

public class HQ extends JFrame implements ActionListener
{
	//Basic variable needed.
	JPanel panel;
	
	public HQ()
	{
		super("Happy Quotes");
		//Set variables.
		panel = new JPanel();
		setSize(180*3,180*3);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		
		panel.setLayout(new BorderLayout());	 
		add(panel);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{

	}
}
