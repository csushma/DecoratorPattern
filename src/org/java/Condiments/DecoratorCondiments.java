/**
 * 
 */
package org.java.Condiments;

import org.java.Beverages.Beverage;

/**
 * @author SUSHMARAVI
 *
 */
public abstract class DecoratorCondiments extends Beverage{
	public Beverage beverage;
	
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

	public abstract String getDescription();
}
