package sinau.session4.belajar;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CobaBorderLayoutCool {

	private JFrame segitigaFrame;
	private JLabel alasLabel;
	private JLabel tinggiLabel;
	private JLabel luasLabel;
	private JTextField alasTextField;
	private JTextField tinggiTextField;
	private JTextField luasTextField;
	private JButton luasButton;

	// improvement from cupu & lumayan
	private JPanel panelNorth;
	private JPanel panelCenter;
	private JPanel panelSouth;

	public CobaBorderLayoutCool() {
		segitigaFrame = new JFrame("Hitung Luas Segitiga");

		segitigaFrame.setLayout(new BorderLayout());
		segitigaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// improvement from cupu & lumayan
		panelNorth = new JPanel();
		panelNorth.setLayout(new BorderLayout());
		panelCenter = new JPanel();
		panelCenter.setLayout(new BorderLayout());
		panelSouth = new JPanel();
		panelSouth.setLayout(new BorderLayout());

		alasLabel = new JLabel("Alas ");
		tinggiLabel = new JLabel("Tinggi ");
		luasLabel = new JLabel("Luas ");
		alasTextField = new JTextField(20);
		tinggiTextField = new JTextField(20);
		luasTextField = new JTextField(20);

		luasButton = new JButton("Hitung Luas");

		// improvement from cupu & lumayan
		panelNorth.add(alasLabel, BorderLayout.NORTH);
		panelNorth.add(tinggiLabel, BorderLayout.CENTER);
		panelNorth.add(luasLabel, BorderLayout.SOUTH);
		
		panelCenter.add(alasTextField, BorderLayout.NORTH);
		panelCenter.add(tinggiTextField, BorderLayout.CENTER);
		panelCenter.add(luasTextField, BorderLayout.SOUTH);
		
		segitigaFrame.add(panelNorth, BorderLayout.WEST);
		segitigaFrame.add(panelCenter, BorderLayout.CENTER);
		segitigaFrame.add(luasButton, BorderLayout.SOUTH);

		segitigaFrame.setVisible(true);
		segitigaFrame.pack();
	}

	public static void main(String[] args) {
		new CobaBorderLayoutCool();
	}
}
