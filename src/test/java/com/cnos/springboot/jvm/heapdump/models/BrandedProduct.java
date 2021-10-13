/**
 *
 */
package com.cnos.springboot.jvm.heapdump.models;

import com.cnos.springboot.jvm.heapdump.AbstractProduct;
import com.cnos.springboot.jvm.heapdump.JavaAgent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pratik Das
 *
 */
public class BrandedProduct extends AbstractProduct {
	private String brandName;
	private Price mrp;



	public BrandedProduct() {
		super();
		mrp = new Price();

	}

	public Price getMrp() {
		return mrp;
	}

	public void setMrp(Price mrp) {
		this.mrp = mrp;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getSize() {
		return JavaAgent.getObjectSize(this) + JavaAgent.getObjectSize(brandName);
	}

}
