package strategyPattern;

public class Main {

	public static void main(String[] args) {
		System.out.println("====Java Strategy Pattern===");
		
		Car car1 = new Car(new UpBehavior());
		car1.move();
		
		Car car2 = new Car(new DownBehavior());
		car2.move();
		
		car2 = new Car(new LeftBehavior());
		car2.move();
		
		car2 = new Car(new RightBehavior());
		car2.move();

	}

}
