/**
 *
 */
package com.cnos.springboot.jvm.heapdump.models;


import com.cnos.springboot.jvm.heapdump.AbstractProduct;

/**
 * @author Pratik Das
 *
 */
public class ElectronicGood extends AbstractProduct {

	private Manufacturer manufacturer;



	public ElectronicGood() {
		super();
		this.manufacturer = new Manufacturer();
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

}
