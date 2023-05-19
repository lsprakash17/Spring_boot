package sample;

public class Car {
	String brand;
	int speed;

	public Car()
	{
		System.out.println("I am car object");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", speed=" + speed + "]";
	}
	
}
