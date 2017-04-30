package javabasic.session3.belajar.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import org.apache.commons.lang.StringUtils;

import javabasic.session3.belajar.bangundatar.Segitiga;

public class SegitigaClickListener implements ActionListener {
	
	private JTextField alasTextField;
	private JTextField tinggiTextField;
	private JTextField luasTextField;
	
	private Segitiga segitiga;
	
	public SegitigaClickListener(JTextField alasTextField, JTextField tinggiTextField, JTextField luasTextField) {
		this.alasTextField = alasTextField;
		this.tinggiTextField = tinggiTextField;
		this.luasTextField = luasTextField;
		
		segitiga = new Segitiga();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(StringUtils.isNotEmpty(alasTextField.getText())) {
			segitiga.setAlas(Double.parseDouble(alasTextField.getText()));
		} else {
			segitiga.setAlas(0);
		}
		
		if(StringUtils.isNotEmpty(tinggiTextField.getText())) {
			segitiga.setTinggi(Double.parseDouble(tinggiTextField.getText()));
		} else {
			segitiga.setTinggi(0);
		}
		
		luasTextField.setText(segitiga.hitungLuas() + StringUtils.EMPTY);
	}
	
}
