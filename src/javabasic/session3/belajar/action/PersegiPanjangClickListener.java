package javabasic.session3.belajar.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import org.apache.commons.lang.StringUtils;

import javabasic.session3.belajar.bangundatar.PersegiPanjang;

public class PersegiPanjangClickListener implements ActionListener {

	private JTextField panjangTextField;
	private JTextField lebarTextField;
	private JTextField luasTextField;
	
	private PersegiPanjang persegiPanjang;
	
	public PersegiPanjangClickListener(JTextField panjangTextField, JTextField lebarTextField, JTextField luasTextField) {
		this.panjangTextField = panjangTextField;
		this.lebarTextField = lebarTextField;
		this.luasTextField = luasTextField;
		
		persegiPanjang = new PersegiPanjang();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(StringUtils.isNotEmpty(panjangTextField.getText())) {
			persegiPanjang.setPanjang(Double.parseDouble(panjangTextField.getText()));
		} else {
			persegiPanjang.setPanjang(0);
		}
		
		if(StringUtils.isNotEmpty(lebarTextField.getText())) {
			persegiPanjang.setLebar(Double.parseDouble(lebarTextField.getText()));
		} else {
			persegiPanjang.setLebar(0);
		}
		
		luasTextField.setText(persegiPanjang.hitungLuas() + StringUtils.EMPTY);
	}

}
