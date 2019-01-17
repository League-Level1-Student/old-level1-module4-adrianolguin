package extra;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class LeetSpeakTranslator implements ActionListener {
	
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JButton button = new JButton("Translate");
	 JTextField input = new JTextField(10);
	 JTextField output = new JTextField(10);
	
	
	  void createGUI() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	input.setEditable(true);
	output.setEditable(false);
	panel.add(input);
	panel.add(output);
	frame.pack();

	 }
	
	

	public static void main(String[] args) {

		LeetSpeakTranslator translator = new LeetSpeakTranslator();
		translator.createGUI();
		
}



	@Override
	public void actionPerformed(ActionEvent arg0) {

		
		
	}



	
}
