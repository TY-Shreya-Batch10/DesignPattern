package com.tyss.designPattern;

public class GetPlanFactory {

	public Plan getPlan(String planType)
	{
		if(planType==null)
		{
			return null;
		}
		
		else if(planType.equalsIgnoreCase("DomesticPlan"))
			
		{
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("CommercialPlan"))
		{
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("InstitutionalPlan"))
		{
			return new InstitutionalPlan();
		}
		return null;
		
	}
}
