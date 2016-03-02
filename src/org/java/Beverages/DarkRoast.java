/**
 * 
 */
package org.java.Beverages;

/**
 * @author SUSHMARAVI
 *
 */
public class DarkRoast extends Beverage{
	
	public DarkRoast(String size) {
		this.size = size;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Dark Roast Coffee";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		if(super.getSize()=="small")
		return 0.99;
		else if (super.getSize()=="medium") return 1.25;
		else return 1.55;
	}
}
