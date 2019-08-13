/**
 * Copyright (c) 2019.
 * This program and the accompanying materials are made available
 * under my granted permission provided that this note is kept intact, unmodified and unchanged.
 * @ Author: Baraa Ali -  API and implementation.
 * All rights reserved.
*/

package co.grandcircus.DONUT_API.entity;

import java.util.List;

public class DonutResponse {
	private Integer count;
	private List<Donut> results;

	public DonutResponse() {
		super();
	}

	public DonutResponse(Integer count, List<Donut> results) {
		super();
		this.count = count;
		this.results = results;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Donut> getResults() {
		return results;
	}

	public void setResults(List<Donut> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "DonutResponse [count=" + count + ", results=" + results + "]";
	}

}
