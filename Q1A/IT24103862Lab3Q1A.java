import java.util.Scanner ;

	public class IT24103862Lab3Q1A {
	
		public static void main (String...args) {

		Scanner sc = new Scanner (System.in) ;
		
		System.out.println ("Enter the price of one kilo rice : " );
		double price = sc.nextDouble ();

		System.out.println ("Enter how many kilos you want : " );
		double quantity = sc.nextDouble ();
		
		double priceofRice = price * quantity ;
		System.out.println ("Your amount is : " +priceofRice ) ;

		

	}
}