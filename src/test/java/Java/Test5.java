package Java;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testLinkedList();
		testHashSet();
	}

	public static void testLinkedList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("HCMUS");
		linkedList.add("UIT");
		linkedList.add("HCMUT");
		System.out.println("LinkedList ban dau:" + linkedList);
		System.out.println("Phan tu dau tien:" + linkedList.pollFirst());
		System.out.println("LinkedList sau pollFirst:" + linkedList);
	}
 
	public static void testHashSet() {
		HashSet<String> h = new HashSet<String>();
		h.add("xxx");
		h.add("yyy");
		h.add("zzz");
		HashSet<String> clone = (HashSet<String>) h.clone();
		clone.add("CLONE");
		System.out.println("HashSet ban dau:" + h);
		System.out.print("HashSet clone:" + clone);

	}
	
}
