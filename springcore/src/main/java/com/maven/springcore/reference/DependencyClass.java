package com.maven.springcore.reference;

public class DependencyClass {
	private int x;
	private DependentObjectClass object;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public DependentObjectClass getObject() {
		return object;
	}
	public void setObject(DependentObjectClass object) {
		this.object = object;
	}
	@Override
	public String toString() {
		return "DependencyClass [x=" + x + ", object=" + object + "]";
	}
	public DependencyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
}
