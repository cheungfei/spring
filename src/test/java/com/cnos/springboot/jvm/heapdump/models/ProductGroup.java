/**
 *
 */
package com.cnos.springboot.jvm.heapdump.models;

import com.cnos.springboot.jvm.heapdump.AbstractProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pratik Das
 *
 */
public class ProductGroup {

	private List<AbstractProduct> products = new ArrayList<AbstractProduct>();

	public void add(AbstractProduct product) {
		products.add(product);
	}
}
