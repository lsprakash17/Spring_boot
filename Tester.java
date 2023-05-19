package sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
	public static void main(String[] args) {	
		ApplicationContext a=new ClassPathXmlApplicationContext("sample/MyConfi.xml");
		Car car1=(Car)a.getBean("car");
		System.out.println(car1
				);
	}
	
}