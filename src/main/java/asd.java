import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class asd {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("pen");
		list.add("Eraser");
		list.add("Note Book");
		list.add("pen");
		list.add("Pencil");
		list.add("Stapler");
		list.add("Note Book");
		list.add("Pencil");

		Map<String, Long> fmap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
//		fmap.forEach((key, value) -> System.out.println(key + " : " + value));
		
		System.out.println(fmap);
		
	}
}
