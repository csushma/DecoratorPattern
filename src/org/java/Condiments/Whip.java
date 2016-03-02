/**
 * 
 */
package org.java.Condiments;

import org.java.Beverages.Beverage;

/**
 * @author SUSHMARAVI
 *
 */
public class Whip extends DecoratorCondiments{
		
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if(super.getSize()=="small") return beverage.cost()+0.10+0.05;
		else if (super.getSize()=="medium") return beverage.cost()+0.10+0.10;
		else return beverage.cost()+0.10+0.15;
	}

	@Override
	public void setSize(String size) {
		// TODO Auto-generated method stub
		super.setSize(size);
	}


}
