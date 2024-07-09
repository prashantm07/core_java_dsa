package collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMap {
public static void main(String[] args) {
	ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<String, Integer>();
	cmap.put("A", 1);
	cmap.put("B", 2);
	cmap.put("C", 3);
	cmap.put("D", 4);
	cmap.put("E", null);
	System.out.println(cmap);
}
}
