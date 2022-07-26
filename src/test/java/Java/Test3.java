package Java;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Test3 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "B");
		map.put(2, "E");
		map.put(3, "N");
		Set<Integer> keySet=map.keySet();
		for(Integer i :keySet)
		{
			System.out.println(i+""+ map.get(i));
		}
	
		int[] a = {8,7,9,11,8,11,20,15,7};
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i<a.length;i++)
		{
		list.add(a[i]);

		}
		System.out.println("Cac phan tu cua list la:" +list);
		System.out.println("So phan tu trong list la:" +list.size());
		Map<String, Integer> diemcacmon = new HashMap<String, Integer>();
		diemcacmon.put("Hoa", 8);
		diemcacmon.put("Toan", 7);
		diemcacmon.put("Van", 5);
		diemcacmon.put("Ly", 6);
		int sum = 0;
		for (Map.Entry<String, Integer> diem:diemcacmon.entrySet())
		{
			sum +=diem.getValue();
		}
		System.out.println("Tong diem cac mon la:"+String.valueOf(sum));

	}

}
