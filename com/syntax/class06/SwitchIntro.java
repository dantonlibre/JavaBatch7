package com.syntax.class06;

public class SwitchIntro {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		//}else if (day == 5) {
		//    dayName="Friday";
	    //}else if (day == 6) {
		 //   dayName="Sturday";
	    //}else if (day == 7) {
	    //	dayName="Sunday";
		//}else {
		//	dayName="Involid";
			
		switch(day)	{
		
		case 1:
			dayName  = "Monday";
			break;
		case 2:
			dayName  = "Thuesday";
			break;
		case 3:
			dayName  = "Wednsday";
			break;
		case 4:
			dayName  = "Thursday";
			break;
		case 5:
			dayName  = "Friday";
			break;
		case 6:
			dayName  = "Suturday";
			break;
		case 7:
			dayName  = "Monday";
		break;
		default:
			dayName  = "Invalid";
			break;
		}
		System.out.println("Today is" +dayName);
		System.out.println("------Using Switch Case-----");
		
		
		}
		}
	}
