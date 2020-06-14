package reviewclass4;

public class SimpleNestedIFStatement {
	public static void main(String[] args) {
		
		boolean haveMoney = true;
		
		boolean resturantIsNear = false;
		
		if(haveMoney) {
			System.out.println("I have money");
			if(resturantIsNear) {
				System.out.println("I go to the restourant");
			}
			
		}
		
	}

}
