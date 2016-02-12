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
    String thought;
	JPanel panel;
    JButton addButton;
    JTextField textField;
    JLabel label;
	
	public GTD()
	{
		super("Good Thoughts Diary");
		//Set variables.
		panel = new JPanel();
        addButton = new JButton("Add");
        textField = new JTextField(20);
        label = new JLabel("");
		setSize(180*3,180*3);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
		//panel.setLayout(new BorderLayout());
        
		add(panel);
        add(textField);
        add(addButton);
        add(label);
        addButton.addActionListener(this);
		setVisible(true);
	}
	
    @Override
	public void actionPerformed(ActionEvent e)
	{
        thought = textField.getText();
        textField.setText("");
        textField.requestFocus();
        label.setText(thought);
        thought = "";
	}
}
