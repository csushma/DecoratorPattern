/**
 * 
 */
package org.java.Beverages;

/**
 * @author SUSHMARAVI
 *
 */
public abstract class Beverage {
	
	String description = "Unknown Beverage";
	protected String size;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription(){
		return description;
	}
	
	public abstract double cost();

}
