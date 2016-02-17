import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.net.URL;
import java.io.Serializable;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class GFT extends JFrame implements ActionListener
{
	//Basic variable needed.
    String goal;
	JPanel panel;
    JButton addButton;
    JTextArea textField;
    JLabel label;
	File file;
	Scanner scan;
	PrintWriter fw;
	
	public GFT()
	
	{
		super("Goals For Today");
		//Set variables.
		panel = new JPanel();
        addButton = new JButton("Add");
        textField = new JTextArea(5, 20);
        label = new JLabel("");
		setSize(180*3,180*3);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
		panel.setLayout(new BorderLayout());
	try {	
	    file = new File("GFT.txt");
            scan = new Scanner(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
		ArrayList<String> labels = new ArrayList<>();
		int i = 0;
		while(scan.hasNext())
		{
			String s = scan.nextLine();
			labels.add(s);
		}
		
		add(panel);
        add(textField);
        add(addButton);
        add(label);
		for(int x = 0; x < labels.size(); x++)
		{
			JLabel goals = new JLabel();
			goals.setText(labels.get(x));
			add(goals);
		}
        addButton.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
        goal = textField.getText();
        textField.setText("");
        textField.requestFocus();
        label.setText(goal);
		saveGoal(goal, file);
        goal = "";
		file = new File("GT.txt");
		ArrayList<String> labels1 = new ArrayList<>();
		int i = 0;
		while(scan.hasNext())
		{
			String s1 = scan.nextLine();
			labels1.add(s1);
		}
		for(int x = 0; x < labels1.size(); x++)
		{
			JLabel goals = new JLabel();
			goals.setText(labels1.get(x));
			panel.add(goals);
		}
		label.setText("");
	}
	
	public void saveGoal(String s, File file)
	{
		try
		{
			fw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
			fw.println(s);
			fw.close();
		}
		catch(IOException e) 
		{
			System.err.println("File not found. Please scan in new file.");
		}
	}
}
