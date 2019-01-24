package extra;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import sun.text.normalizer.ReplaceableString;

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
	button.setEnabled(true);
	button.addActionListener(this);
	
	 }

	public static void main(String[] args) {

		LeetSpeakTranslator translator = new LeetSpeakTranslator();
		translator.createGUI();
		
		
		
		
}


	@Override
	public void actionPerformed(ActionEvent e) {

	String loading = input.getText();
	
	loading = loading.replace('a', '4');
	
	loading = loading.replace('A', '@');
	
	loading = loading.replace('e', '3');
	
	loading = loading.replace('E', '3');
	
	loading = loading.replace('i', '1');
	
	loading = loading.replace('o', '0');
	
	loading = loading.replace('s', '$');	
	
	output.setText(loading);



	
}
}
