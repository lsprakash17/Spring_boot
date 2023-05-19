package sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Tester2MainBeanFactory 
{
public static void main(String[] args) {
	ClassPathResource resource = new ClassPathResource("sample/MyConfi.xml");
	BeanFactory b = new XmlBeanFactory(resource);
	Car car = (Car) b.getBean("car");
	System.out.println(car);
	Bike bike = (Bike) b.getBean("bike");
	System.out.println(bike);
}
}
