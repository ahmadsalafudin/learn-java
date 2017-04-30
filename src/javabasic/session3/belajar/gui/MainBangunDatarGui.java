package javabasic.session3.belajar.gui;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javabasic.session3.belajar.action.MainBangunDatarMenuViewSegitigaClickListener;
import javabasic.session3.belajar.common.BangunDatarConstantsDefinition;
import javabasic.session3.belajar.gui.SegitigaGui;

public class MainBangunDatarGui extends AbstractFrameConstructor {
	
	private JFrame mainFrame;
	private JDesktopPane mainDesktop;
	private JMenuBar mainMenuBar;
	private JMenu viewMenu;
	private JMenuItem viewMenuItemSegitiga;
	private JMenuItem viewMenuItemPersegiPanjang;
	
	private SegitigaGui segitigaGui;
	
	public MainBangunDatarGui() {
		super();
	}
	
	@Override
	protected void constructGui() {
		segitigaGui = new SegitigaGui();
		
		// Instansiasi Desktop Pane
		mainDesktop = new JDesktopPane();
		
		// Instansiasi Menu Bar
		mainMenuBar = new JMenuBar();
		viewMenu = new JMenu(BangunDatarConstantsDefinition.MENU_MAINFRAME_VIEW);
		viewMenuItemSegitiga = new JMenuItem(BangunDatarConstantsDefinition.MENUITEM_MAINFRAME_VIEW_SEGITIGA);
		viewMenuItemPersegiPanjang = new JMenuItem(BangunDatarConstantsDefinition.MENUITEM_MAINFRAME_VIEW_PERSEGIPANJANG);
		
		// Instansiasi JFrame
		mainFrame = new JFrame(BangunDatarConstantsDefinition.FRAME_MAINFRAME_TITLE);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mainFrame.setSize(500, 300);
	}
	
	@Override
	protected void addFrameComponent() {		
		mainDesktop.add(segitigaGui.getSegitigaFrame());
		mainDesktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		
		viewMenu.add(viewMenuItemSegitiga);
		viewMenu.add(viewMenuItemPersegiPanjang);
		mainMenuBar.add(viewMenu);
		
		mainFrame.setJMenuBar(mainMenuBar);
		mainFrame.add(mainDesktop, BorderLayout.CENTER);
	}
	
	@Override
	protected void addFrameAction() {
		viewMenuItemSegitiga.addActionListener(new MainBangunDatarMenuViewSegitigaClickListener(segitigaGui, null));
	}

	@Override
	public void show() {
		mainFrame.setVisible(true);
	}

	@Override
	public void hide() {
		// do nothing		
	}
}
