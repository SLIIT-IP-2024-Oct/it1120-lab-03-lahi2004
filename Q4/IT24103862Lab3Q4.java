import java.util.Scanner ;

public class IT24103862Lab3Q4 {
	public static void main (String...args) {

	Scanner sc = new Scanner (System.in) ;
	
	System.out.println ("Enter a five digit number : ") ; 
	int digitnum = sc.nextInt () ;
	
	int seperate = digitnum / 10000 ;
	digitnum = digitnum - (seperate * 10000) ;
	
	int seperate1 = digitnum / 1000 ;
	digitnum = digitnum - (seperate1 * 1000) ;
	
	int seperate2 = digitnum / 100 ;
	digitnum = digitnum - (seperate2 * 100) ;

	int seperate3 = digitnum / 10 ;
	digitnum = digitnum - (seperate3 * 10);
	
	int seperate4 = digitnum / 1 ;
	digitnum = digitnum - (seperate4 * 1);

	System.out.print(+seperate + " " + seperate1 + " " + seperate2 + " " + seperate3 + " " + seperate4) ;
	

	}

}