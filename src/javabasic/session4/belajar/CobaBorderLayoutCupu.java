package javabasic.session4.belajar;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CobaBorderLayoutCupu {

	private JFrame segitigaFrame;
	private JLabel alasLabel;
	private JLabel tinggiLabel;
	private JLabel luasLabel;
	private JTextField alasTextField;
	private JTextField tinggiTextField;
	private JTextField luasTextField;
	private JButton luasButton;
	
	public CobaBorderLayoutCupu() {
		segitigaFrame = new JFrame("Hitung Luas Segitiga");
		
		segitigaFrame.setLayout(new BorderLayout());
		segitigaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		alasLabel = new JLabel("Alas");
		tinggiLabel = new JLabel("Tinggi");
		luasLabel = new JLabel("Luas");		
		alasTextField = new JTextField(20);
		tinggiTextField = new JTextField(20);
		luasTextField = new JTextField(20);		
		
		luasButton = new JButton("Hitung Luas");
		
		segitigaFrame.add(alasLabel, BorderLayout.NORTH);
		segitigaFrame.add(tinggiLabel, BorderLayout.CENTER);
		segitigaFrame.add(luasLabel, BorderLayout.SOUTH);				
		segitigaFrame.add(alasTextField, BorderLayout.NORTH);
		segitigaFrame.add(tinggiTextField, BorderLayout.CENTER);
		segitigaFrame.add(luasTextField, BorderLayout.SOUTH);
		segitigaFrame.add(luasButton, BorderLayout.SOUTH);
		
		segitigaFrame.setVisible(true);
		segitigaFrame.pack();
	}
	
	public static void main(String[] args) {
		new CobaBorderLayoutCupu();
	}
}
