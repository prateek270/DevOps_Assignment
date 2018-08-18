package com.assignment.nissan;

public class addcode {
	
	public String func(String a, String b)
	{
		double d2=0,d1=0;
		try  
		  {  
		    d1 = Double.parseDouble(a);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		    return "Invalid Input";  
		  }  
		  try  
		  {  
		     d2 = Double.parseDouble(b);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
			    return "Invalid Input";  
		  }  
		return d1+d2+"";
	}
	


}
