import java.util.Scanner ;

public class IT24103862Lab3Q3 {

	public static void main (String...args) {

	Scanner sc = new Scanner (System.in) ;

	int amount = 2754 ;
	int nooffivethousandNotes = amount / 5000 ;
	amount = amount - (nooffivethousandNotes * 5000) ;

	int noofthousandNotes = amount / 1000 ;
	amount = amount - (noofthousandNotes * 1000) ;
	
	int nooffivehundredNotes = amount / 500 ;
	amount = amount - (nooffivehundredNotes * 500);

	int nooftwohundredNotes = amount / 200 ;
	amount = amount - (nooftwohundredNotes * 200) ;

	int noofhundredNotes = amount / 100 ;
	amount = amount - (noofhundredNotes * 100) ;
	
	int nooffiftyNotes = amount / 50 ;
	amount = amount - (nooffiftyNotes * 50) ;

	int  nooftwentyNotes = amount / 20 ;
	amount = amount - (nooftwentyNotes * 20) ;
	
	int nooftenCoins = amount / 10 ;
	amount = amount - (nooftenCoins * 10) ;
		
	int nooffiveCoins = amount / 5 ;
	amount = amount - (nooffiveCoins * 5) ;
	
	int nooftwoCoins = amount / 2 ;
	amount = amount - (nooftwoCoins * 2) ;

	int noofoneCoins = amount / 1 ;
	amount = amount - (noofoneCoins * 1);

	System.out.println ("5000 notes : " +nooffivethousandNotes) ;
	System.out.println ("1000 notes : " +noofthousandNotes) ;
	System.out.println ("500 notes : " +nooffivehundredNotes) ;
	System.out.println ("200 notes : " +nooftwohundredNotes) ;
	System.out.println ("100 notes : " +noofhundredNotes) ;
	System.out.println ("50 notes : " +nooffiftyNotes) ;
	System.out.println ("20 notes : " +nooftwentyNotes) ;
	System.out.println ("10 coins : " +nooftenCoins) ;
	System.out.println ("5 coins : " +nooftenCoins) ;
	System.out.println ("2 coins : " +nooftwoCoins) ;
	System.out.println ("1 coins : " +noofoneCoins) ;

	}

}
	