
import java.util.Scanner ;
	public class IT24103862Lab3Q2 {

		public static void main (String...args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println ("What is your monthly salary : " ) ;
		double monthlySalary = sc.nextDouble ();

		System.out.println ("Enter the number of OT hours : " ) ;
		double otHours = sc.nextDouble ();

		System.out.println ("Enter your OThourly rate in rupees : " ) ;
		double othourlyRate = sc.nextDouble () ;

		double totalotAmount = otHours * othourlyRate ;
		double totalmonthlySalary = monthlySalary + totalotAmount ;

		System.out.println ("Your total monthly salary with additional ot amount : " +totalmonthlySalary) ;

	}
}
 
		