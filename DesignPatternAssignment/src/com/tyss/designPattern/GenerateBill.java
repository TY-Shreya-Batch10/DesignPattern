package com.tyss.designPattern;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		
		GetPlanFactory planFactory=new GetPlanFactory();
		
		System.out.println("enter the plan");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String planName=br.readLine();
		System.out.println("enter the number ");
		int units=Integer.parseInt(br.readLine());
		
		Plan p=planFactory.getPlan(planName);
		
		System.out.println("its plan"+planName+"its bill"+units);
		p.getRate();
		p.calculateBill(units);
	}

}
