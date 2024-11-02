import java.util.Scanner ;

public class IT24103862Lab3Q1B {
	public static void main (String...args) {

	Scanner sc = new Scanner (System.in) ;
	
	System.out.println ("Enter the Price of 1kg rice : ") ;
	double price = sc.nextDouble () ;

	System.out.println ("Enter how many kilos you want : ") ;
	double quantity = sc.nextDouble ();

	double totalamount = price * quantity;
	double discountforamount = totalamount * 10/100 ;
	double totalamountwithdiscount = totalamount -  discountforamount ;

	System.out.println ("The total amount with 10% discount is : " +totalamountwithdiscount) ;

	}
}