package sinau.session4.belajar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class CobaMigLayout2 {
	private JFrame segitigaFrame;
	private JLabel alasLabel;
	private JLabel tinggiLabel;
	private JLabel luasLabel;
	private JTextField alasTextField;
	private JTextField tinggiTextField;
	private JTextField luasTextField;
	private JButton luasButton;
	
	public CobaMigLayout2() {
		segitigaFrame = new JFrame("Hitung Luas Segitiga");
		
		segitigaFrame.setLayout(new MigLayout());
		segitigaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		alasLabel = new JLabel("Alas");
		tinggiLabel = new JLabel("Tinggi");
		luasLabel = new JLabel("Luas");		
		alasTextField = new JTextField(20);
		tinggiTextField = new JTextField(20);
		luasTextField = new JTextField(20);		
		
		luasButton = new JButton("Hitung Luas");
		
		segitigaFrame.add(alasLabel, "cell 0 0");
		segitigaFrame.add(tinggiLabel, "cell 0 1");
		segitigaFrame.add(luasLabel, "cell 0 2");
		
		segitigaFrame.add(alasTextField, "cell 1 0");				
		segitigaFrame.add(tinggiTextField, "cell 1 1");		
		segitigaFrame.add(luasTextField, "cell 1 2");	
		segitigaFrame.add(luasButton, "cell 1 3");
		
		segitigaFrame.setVisible(true);
		segitigaFrame.pack();
	}

	public static void main(String[] args) {
		new CobaMigLayout2();
	}
}
