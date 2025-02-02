package abstraction;

interface Click {

	void onClick();
}

interface DoubleClick {
	void doubleClick();

}

interface Dragable {
	void dragUp();

	void dragDown();

}

class Button implements Click, DoubleClick {

	@Override
	public void onClick() {

		System.out.println("Click...!");
	}

	@Override
	public void doubleClick() {

		System.out.println("Double Click...!");
	}

}

class Image implements Click, Dragable {

	@Override
	public void dragUp() {

		System.out.println("Volume Up...!");
	}

	@Override
	public void dragDown() {

		System.out.println("Volume Down...!");
	}

	@Override
	public void onClick() {

		System.out.println("Click...!");
	}

}

public class JavaMultipleInheritance {

	public static void main(String[] args) {

		Button b1 = new Button();
		b1.onClick();
		b1.doubleClick();

		Image i = new Image();
		i.dragUp();
		i.dragDown();
		i.onClick();
	}

}
