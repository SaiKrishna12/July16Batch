package day12;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Hashset1 {
	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Selenium");
		s.add("qtp");
		s.add("LR");
		s.add("Jmeter");
		System.out.println(s.size());
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

