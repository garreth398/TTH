import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAdder extends JPanel implements ActionListener
{
	JTextField textField;
    JTextArea textArea;
    private final static String newline = "\n";
	
	public TextAdder()
	{
		super(new GridBagLayout());
		
		textField = new JTextField(20);
		textfield.addActionListener(this);
		
		textArea = new JTextArea(5, 20);
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;
        add(textField, c);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
		add(scrollPane, c)
	}
	
	public void actionPreformed(ActionEvent e)
	{
		
	}
}
