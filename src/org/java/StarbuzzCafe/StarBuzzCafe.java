/**
 * 
 */
package org.java.StarbuzzCafe;

import org.java.Beverages.Beverage;
import org.java.Condiments.DecoratorCondiments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SUSHMARAVI
 *
 */
public class StarBuzzCafe {
	
	public static void main(String[] args) {
	/*	Beverage beverage = new Espresso();
		beverage = new Milk(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription()+" $"+beverage.cost());*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Beverage bev = (Beverage) context.getBean("darkroast","medium");
		bev = (DecoratorCondiments) context.getBean("milk",bev);
		bev = (DecoratorCondiments) context.getBean("whip",bev);
		System.out.println(bev.getDescription()+" ,"+bev.getSize()+" $"+bev.cost());
	}

}
