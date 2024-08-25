package carDealership.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
//		Car familyCar = (Car) context.getBean("familyCar");
//		Car sportsCar = (Car) context.getBean("sportsCar");
//		Car truck     = (Car) context.getBean("truck");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name!");
		String name = sc.nextLine();
		System.out.println("Please select from given choice for your lovable car!");
		System.out.println("1. familyCar \n 2. sportsCar \n 3. truck");
		int carChoice = sc.nextInt();
		Car car = null;
		switch (carChoice) {
		case 1: {
			System.out.println("Please select type of tyre you want. \n 1. Sports Tyre \n 2. Normal Tyre");
			int tyreType = sc.nextInt();
			switch (tyreType) {
			case 1: {
				car = (Car)context.getBean("familyCarSportsTyre");
				break;
			}
			case 2:{
				car = (Car)context.getBean("familyCarNormalTyre");
				break;
			}default:
				System.out.println("Invalid input!");
			}
			break;
			
		}
		case 2: {
			car = (Car)context.getBean("sportsCar");
			break;
		}
		case 3: {
			car = (Car)context.getBean("truck");
			break;
		}
		default:
			System.out.println("Wrong input!");
		}
		car.setOwnerName(name);
		System.out.println(car.getOwnerName());
		System.out.println(car.carInfo());
		
	}

}
