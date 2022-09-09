
public class Home  {
	
	/*
	 * public String stdname(String Name, int Number, int Numbers)
	 * 
	 * { String calc = Name.substring(Number,Numbers);
	 * 
	 * 
	 * System.out.println("Hello Students"); return calc; }
	 */
	public String stdnames(String Name)
	{
		String stdnames = Name;
		System.out.print("The Student Name is: ");
		return stdnames;
		}
	
		public static void main(String[] args) {
	}
	 
			
	public  int stdmarks(int eng, int math, int sci, int comp  ) {
		int stdmarks=eng+math+sci+comp;
		System.out.print("Total Student Total Marks is: ");
		return stdmarks;
	}
	
	public  String stdaddress(String cityname) {
	String 	stdaddress =cityname;
	System.out.print("Student City is " );
	return stdaddress;
	}
	
	public String stdsports(String sports) {
		String stdsports = sports;
		System.out.print("Sports is: ");
		return stdsports;
	}
}
