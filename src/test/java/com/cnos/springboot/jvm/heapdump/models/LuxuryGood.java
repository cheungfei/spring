/**
 *
 */
package com.cnos.springboot.jvm.heapdump.models;


import com.cnos.springboot.jvm.heapdump.AbstractProduct;

/**
 * @author Pratik Das
 *
 */
public class LuxuryGood extends AbstractProduct {
	private String luxuryCategory;

	public String getLuxuryCategory() {
		return luxuryCategory;
	}

	public void setLuxuryCategory(String luxuryCategory) {
		this.luxuryCategory = luxuryCategory;
	}



}
