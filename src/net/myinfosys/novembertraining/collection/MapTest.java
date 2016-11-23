package net.myinfosys.novembertraining.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		String kalimat = "if it is to be it is up to me to delegate";
		String words[] = kalimat.split(" ");
		for(String word : words){
			//System.out.println(word + map.get(word));
			Integer freq = map.get(word);
			map.put(word,(freq==null) ? 1 : freq+1);
		}
		System.out.println("linked hash map");
		System.out.println(map);
		//System.out.println(map.get("it"));
		
		// using treeMap
		Map<String,Integer> tree = new TreeMap<String,Integer>();
		for(String word : words){
			Integer freg = tree.get(word);
			tree.put(word, (freg==null)?1:freg+1);
		}
		
		System.out.println(tree);
	}
	
	

}
