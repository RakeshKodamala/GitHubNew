//import java.util.Scanner;

public class InherStgName extends Home {

	public static void main(String[] args) {
	InherStgName inhr = new InherStgName();
		
	String std =inhr.stdnames("Rakesh");
	System.out.println(std);
	
	int marks = inhr.stdmarks(10, 44, 33, 66);
	System.out.print(marks);
	
	String spot =inhr.stdsports("Chess");
	System.out.println(spot);
	
	
		
	}
}
