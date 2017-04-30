package javabasic.session3.belajar.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javabasic.session3.belajar.gui.AbstractFrameConstructor;

public class MainBangunDatarMenuViewSegitigaClickListener implements ActionListener {

	private AbstractFrameConstructor frameOpener;
	private AbstractFrameConstructor frameCloser;
	
	public MainBangunDatarMenuViewSegitigaClickListener(AbstractFrameConstructor frameOpener, AbstractFrameConstructor frameCloser) {
		this.frameOpener = frameOpener;
		this.frameCloser = frameCloser;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(frameOpener != null) {
			frameOpener.show();
		}
		
		if(frameCloser != null) {
			frameCloser.hide();
		}
	}

}
