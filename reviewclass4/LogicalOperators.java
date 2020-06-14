package reviewclass4;

public class LogicalOperators {
public static void main(String[] args) {
	
    // && known as and operator in java
	//To work with operator, both conditions should be true
	boolean haveMoney = true;
	boolean restuarantIsNear=true;
	
	if(haveMoney && restuarantIsNear) {
		System.out.println("I will eat outside");
	
   }else {
	 System.out.println("Borh condition were not true"); 
  }
	
	System.out.println("_____________________________");
	
	// || know as Pipes in keyboard and OR operators in java
	// one condition
	
	boolean atmIsOpen = false;
	boolean cashiarIsOpen=false;
	
	if(atmIsOpen || cashiarIsOpen ) {
		System.out.println("I can get cash");
	}else {
		System.out.println("Neither one was true");
		
		System.out.println("---------------------");
		
		int num1=4;
		int num2=5;
		
		//String statement = "The total of Num1 and Num2 is:";
		System.out.println("The Sum is: " +num1+num2);
		
	}	
  }
}