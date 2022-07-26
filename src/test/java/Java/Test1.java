package Java;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Myarray= {7,2,3,1};
		
		System.out.println(Arrays.toString(sort_function(Myarray)));
	}
		

public static int[] sort_function(int[] Array) {
	int MyarrayLenght=Array.length;
	for(int unsortedIndex=MyarrayLenght-1; unsortedIndex>0;unsortedIndex--)
	{
		for (int index=0;index<unsortedIndex;index++)
		{
			if(Array[index]>Array[index+1])
			{
//			int tmp=Myarray[index];
//			Myarray[index]=Myarray[index+1];
//			Myarray[index+1]=tmp;	
				Array[index]=Array[index]+Array[index+1];
				Array[index+1]=Array[index]-Array[index+1];
				Array[index]=Array[index]-Array[index+1];
			}
		}
	}
	return Array;
	
}
}
	

