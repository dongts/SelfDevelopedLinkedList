package com.dongtran.quiz;

public class SelfDevelopedNode {

	private SelfDevelopedNode next;
	private Integer value;

	public SelfDevelopedNode(SelfDevelopedNode next, Integer value) {
		super();
		this.next = next;
		this.value = value;
	}

	public SelfDevelopedNode(Integer value) {
		super();
		this.value = value;
	}

	public SelfDevelopedNode getNext() {
		return next;
	}

	public void setNext(SelfDevelopedNode next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public boolean hasNext() {
		return next != null;
	}

}
