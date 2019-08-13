/**
 * Copyright (c) 2019.
 * This program and the accompanying materials are made available
 * under my granted permission provided that this note is kept intact, unmodified and unchanged.
 * @ Author: Baraa Ali -  API and implementation.
 * All rights reserved.
*/
/**
 * 
 */
package co.grandcircus.DONUT_API.entity;

public class Donut {
	private Integer id;
	private String ref;
	private String name;

	public Donut() {
		super();
	}

	public Donut(Integer id, String ref, String name) {
		super();
		this.id = id;
		this.ref = ref;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Donut [id=" + id + ", ref=" + ref + ", name=" + name + "]";
	}

}
