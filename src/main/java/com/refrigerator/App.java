package com.refrigerator;

import com.refrigerator.model.Refrigerator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(123);
		
		Refrigerator r = Refrigerator.builder().id(1).build();
		System.out.println(r);
		

	}

}
