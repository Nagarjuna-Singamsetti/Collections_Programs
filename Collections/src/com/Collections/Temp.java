package com.Collections;

public class Temp {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("Finalize Method Called");
	}

}
