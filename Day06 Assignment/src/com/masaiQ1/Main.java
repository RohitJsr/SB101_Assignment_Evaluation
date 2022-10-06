package com.masaiQ1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static Map<String,Intr> shortedMap(Map<String,Intr>map){
		
		Comparator<Map.Entry<String,Intr>> sort=(s1,s2)->{
			return s1.getValue().getMarks()>s2.getValue().getMarks()?+1:-1;
		};
		
		Set<Map.Entry<String,Intr>> set= map.entrySet();
		Set<Map.Entry<String,Intr>>sortedset=new TreeSet<>(sort);
		sortedset.addAll(set);
	
		
		LinkedHashMap<String,Intr> finalset= new LinkedHashMap<>();
		
		for(Map.Entry<String, Intr>item:sortedset) {
			
			finalset.put(item.getKey(), item.getValue());
			
		}
		return finalset;
		
	}
	
	public static void main(String[] args) {
		
		Map<String,Intr> hm= new HashMap<>();
		
		hm.put("Jamshedpur",new Intr(11,"madhuri","madhuri@gmail",600));
		
		hm.put("Jamshedpur",new Intr(11,"madhuri","madhuri@gmail",600));

		hm.put("Jamshedpur",new Intr(11,"madhuri","madhuri@gmail",600));

		hm.put("Jamshedpur",new Intr(11,"madhuri","madhuri@gmail",600));

		hm.put("Jamshedpur",new Intr(11,"madhuri","madhuri@gmail",600));
		
		Map<String,Intr> sorted= shortedMap(hm);
		Set<Map.Entry<String, Intr>> etr= sorted.entrySet();
		
		for(Map.Entry<String, Intr> itm:etr) {
			System.out.println(itm.getValue());
		}

	}
}
