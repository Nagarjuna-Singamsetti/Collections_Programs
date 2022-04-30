package com.Collections;

import java.util.*;
import java.io.*;

public class P_PropertiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "75");
		FileOutputStream fos = new FileOutputStream("config.properties");
		p.store(fos, "Updated by Nagarjuna");
	}
}
