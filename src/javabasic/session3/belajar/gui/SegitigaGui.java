package javabasic.session3.belajar.gui;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javabasic.session3.belajar.action.SegitigaClickListener;
import javabasic.session3.belajar.common.BangunDatarConstantsDefinition;

public class SegitigaGui extends AbstractFrameConstructor {

	private JInternalFrame segitigaFrame;
	private JLabel alasLabel;
	private JLabel tinggiLabel;
	private JLabel luasLabel;
	private JTextField alasTextField;
	private JTextField tinggiTextField;
	private JTextField luasTextField;
	private JButton luasButton;

	public SegitigaGui() {
		super();
	}

	@Override
	protected void constructGui() {
		segitigaFrame = new JInternalFrame(BangunDatarConstantsDefinition.FRAME_SEGITIGA_TITLE, // title 
				true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		segitigaFrame.setSize(400, 200);
		segitigaFrame.setLayout(null);
		segitigaFrame.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
		
		alasLabel = new JLabel(BangunDatarConstantsDefinition.LABEL_SEGITIGA_ALAS);
		tinggiLabel = new JLabel(BangunDatarConstantsDefinition.LABEL_SEGITIGA_TINGGI);
		luasLabel = new JLabel(BangunDatarConstantsDefinition.LABEL_SEGITIGA_LUAS);
		
		alasTextField = new JTextField(20);
		tinggiTextField = new JTextField(20);
		luasTextField = new JTextField(20);		
		
		luasButton = new JButton(BangunDatarConstantsDefinition.BUTTON_COMMON_LUAS);
	}

	@Override
	protected void addFrameComponent() {
		segitigaFrame.add(alasLabel);
		segitigaFrame.add(tinggiLabel);
		segitigaFrame.add(luasLabel);
		segitigaFrame.add(luasButton);		
		segitigaFrame.add(alasTextField);
		segitigaFrame.add(tinggiTextField);
		segitigaFrame.add(luasTextField);
		
		alasLabel.setBounds(10, 10, 100, 20);
		tinggiLabel.setBounds(10, 30, 100, 20);
		luasLabel.setBounds(10, 50, 100, 20);
		
		alasTextField.setBounds(150, 10, 200, 20);
		tinggiTextField.setBounds(150, 30, 200, 20);
		luasTextField.setBounds(150, 50, 200, 20);
		
		luasButton.setBounds(150, 70, 200, 20);
	}
	
	@Override
	protected void addFrameAction() {
		luasButton.addActionListener(new SegitigaClickListener(alasTextField, tinggiTextField, luasTextField));
	}

	public JInternalFrame getSegitigaFrame() {
		return segitigaFrame;
	}

	@Override
	public void show() {
		segitigaFrame.setVisible(true);
	}

	@Override
	public void hide() {
		segitigaFrame.setVisible(false);
	}
}
