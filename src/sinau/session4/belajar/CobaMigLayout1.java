package sinau.session4.belajar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class CobaMigLayout1 {

	private JFrame segitigaFrame;
	private JLabel alasLabel;
	private JLabel tinggiLabel;
	private JLabel luasLabel;
	private JTextField alasTextField;
	private JTextField tinggiTextField;
	private JTextField luasTextField;
	private JButton luasButton;
	
	public CobaMigLayout1() {
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
		
		segitigaFrame.add(alasLabel);
		segitigaFrame.add(alasTextField, "wrap");
		
		segitigaFrame.add(tinggiLabel);
		segitigaFrame.add(tinggiTextField, "wrap");
		
		segitigaFrame.add(luasLabel);
		segitigaFrame.add(luasTextField, "wrap");
		
		segitigaFrame.add(luasButton, "south");
		
		segitigaFrame.setVisible(true);
		segitigaFrame.pack();
	}

	public static void main(String[] args) {
		new CobaMigLayout1();
	}

}
