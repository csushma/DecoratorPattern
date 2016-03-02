/**
 * 
 */
package org.java.Condiments;

import org.java.Beverages.Beverage;

/**
 * @author SUSHMARAVI
 *
 */
public class Milk extends DecoratorCondiments{
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if(super.getSize()=="small") return beverage.cost()+0.10+0.05;
		else if (super.getSize()=="medium") return beverage.cost()+0.10+0.10;
		else return beverage.cost()+0.10+0.15;
	}
}
