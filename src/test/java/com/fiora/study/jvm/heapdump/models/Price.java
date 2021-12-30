/**
 *
 */
package com.fiora.study.jvm.heapdump.models;

import com.fiora.study.jvm.heapdump.JavaAgent;

import java.util.Date;


/**
 * @author Pratik Das
 *
 */
public final class Price {

	private Double value;
	private Date lastUpdated;


	public Price() {
		super();
		value = 48.0;
		lastUpdated = new Date();

	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public long getSize() {
		return JavaAgent.getObjectSize(this)
				+ JavaAgent.getObjectSize(value)
				+ JavaAgent.getObjectSize(lastUpdated.toString());
	}

}
