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

public class GTD extends JFrame implements ActionListener
{
	//Basic variable needed.
    String thought;
	JPanel panel;
    JButton addButton;
    JTextArea textField;
    JLabel label;
	File file;
	Scanner scan;
	FileWriter fw;
	
	public GTD() throws IOException
	{
		super("Good Thoughts Diary");
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
		
		file = new File("GT.txt");
		scan = new Scanner(file);
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
			JLabel thoughts = new JLabel();
			thoughts.setText(labels.get(x));
			add(thoughts);
		}
        addButton.addActionListener(this);
		setVisible(true);
		
		fw = new FileWriter(file);
	}
	
	public void actionPerformed(ActionEvent e)
	{
        thought = textField.getText();
        textField.setText("");
        textField.requestFocus();
        label.setText(thought);
		saveThought(thought, fw);
        thought = "";
	}
	
	public void saveThought(String s, FileWriter w) throws IOException
	{
		try
		{
			w.write(s);
		}
		catch(FileNotFoundException e) 
		{
			System.err.println("File not found. Please scan in new file.");
		}
	}
}
