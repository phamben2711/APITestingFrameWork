package Java;

public class Test4 {

	public static void main(String[] args) {
	int count =0;
	String name1 = "con cho con";
	String name2= "con ga con";
	for (int i=0;i<name1.length()-1;i++)
	{
		if(name1.charAt(i)=='c')
		{
			
			count++;
			System.out.println("So lan chu c xuat hien:" + String.valueOf(count) );
		}
	}
	 String largest = Integer.valueOf(name1.length())>Integer.valueOf(name1.length())?name1:name2;
	 System.out.print("Chuoi lon nhat la: " + largest);
	}

}
