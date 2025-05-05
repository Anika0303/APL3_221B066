/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Offering offering= new Coffee();
	    offering= new Rum(offering);
	    
		System.out.println(offering.getName() + " " + offering.getprice());
		
		Offering offering1= new Tea();
	    offering1= new Milk(offering1);
	    
		System.out.println(offering1.getName() + " " + offering1.getprice());
		
		Offering offering2= new Icecream();
	    offering2= new Gin(offering2);
	    
		System.out.println(offering2.getName() + " " + offering2.getprice());
	}
}
