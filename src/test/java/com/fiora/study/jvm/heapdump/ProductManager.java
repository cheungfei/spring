/**
 *
 */
package com.fiora.study.jvm.heapdump;

import com.fiora.study.jvm.heapdump.models.BrandedProduct;
import com.fiora.study.jvm.heapdump.models.ElectronicGood;
import com.fiora.study.jvm.heapdump.models.GroceryProduct;
import com.fiora.study.jvm.heapdump.models.LuxuryGood;
import com.fiora.study.jvm.heapdump.models.ProductGroup;

/**
 * @author Pratik Das
 *
 */
public class ProductManager {
	private ProductGroup regularItems = new ProductGroup();

	private ProductGroup discountedItems = new ProductGroup();

	public void populateProducts() {
		int dummyArraySize = 1;
		for (int loop = 0; loop < 10; loop++) {
			if(loop % 2 == 0) {
			  createObjects(regularItems, dummyArraySize);
			}else {
			  createObjects(discountedItems, dummyArraySize);
			}
			System.out.println("Memory Consumed till now: " + loop + "::" + regularItems + " " + discountedItems );
			dummyArraySize *= dummyArraySize * 2;
		}
	}

	private void createObjects(ProductGroup productGroup, int dummyArraySize) {
		for (int i = 0; i < dummyArraySize; ) {
			productGroup.add(createProduct());
		}
 	}

	private AbstractProduct createProduct() {
        int randomIndex = (int) Math.round(Math.random() * 10);
        switch (randomIndex) {
		case 0:
			return  new ElectronicGood();
		case 1:
			return	new BrandedProduct();
		case 2:
			return new GroceryProduct();
		case 3:
			return new LuxuryGood();
		default:
			return	new BrandedProduct();
		}
	}

}
