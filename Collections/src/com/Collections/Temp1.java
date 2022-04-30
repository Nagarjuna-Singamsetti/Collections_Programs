package com.Collections;

public class Temp1 {
	int i;

	Temp1(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i%9;
	}

	@Override
	public String toString() {
		return i + "";
	}

}
