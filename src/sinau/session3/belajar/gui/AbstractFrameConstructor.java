package sinau.session3.belajar.gui;

public abstract class AbstractFrameConstructor {

	protected AbstractFrameConstructor() {
		constructGui();
		addFrameComponent();
		addFrameAction();
	}
	
	protected abstract void constructGui();
	protected abstract void addFrameComponent();
	protected abstract void addFrameAction();
	
	public abstract void show();
	public abstract void hide();
}
