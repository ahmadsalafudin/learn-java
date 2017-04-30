package javabasic.session4.belajar;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CobaBorderLayoutLumayan {

	private JFrame segitigaFrame;
	private JLabel alasLabel;
	private JLabel tinggiLabel;
	private JLabel luasLabel;
	private JTextField alasTextField;
	private JTextField tinggiTextField;
	private JTextField luasTextField;
	private JButton luasButton;
	
	// improvement from cupu
	private JPanel panelNorth;
	private JPanel panelCenter;
	private JPanel panelSouth;
	
	public CobaBorderLayoutLumayan() {
		segitigaFrame = new JFrame("Hitung Luas Segitiga");		
		
		segitigaFrame.setLayout(new BorderLayout());
		segitigaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// improvement from cupu
		panelNorth = new JPanel();
		panelNorth.setLayout(new FlowLayout());
		panelCenter = new JPanel();
		panelCenter.setLayout(new FlowLayout());
		panelSouth = new JPanel();
		panelSouth.setLayout(new FlowLayout());
		
		alasLabel = new JLabel("Alas");
		tinggiLabel = new JLabel("Tinggi");
		luasLabel = new JLabel("Luas");		
		alasTextField = new JTextField(20);
		tinggiTextField = new JTextField(20);
		luasTextField = new JTextField(20);		
		
		luasButton = new JButton("Hitung Luas");
		
		// improvement from cupu
		panelNorth.add(alasLabel);
		panelNorth.add(alasTextField);
		
		panelCenter.add(tinggiLabel);
		panelCenter.add(tinggiTextField);
		
		panelSouth.add(luasLabel);
		panelSouth.add(luasTextField);
		panelSouth.add(luasButton);
		
		segitigaFrame.add(panelNorth, BorderLayout.NORTH);
		segitigaFrame.add(panelCenter, BorderLayout.CENTER);
		segitigaFrame.add(panelSouth, BorderLayout.SOUTH);
		
		segitigaFrame.setVisible(true);
		segitigaFrame.pack();
	}

	public static void main(String[] args) {
		new CobaBorderLayoutLumayan();
	}

}
