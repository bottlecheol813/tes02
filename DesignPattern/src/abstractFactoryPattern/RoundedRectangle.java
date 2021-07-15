package abstractFactoryPattern;

public class RoundedRectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("inside RoundedRectangle::draw() method.");
	}

}
