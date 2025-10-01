package question2a;

public class streamfilter {

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
}
	public class DivisibleByFive {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 30, 6));

	        list.stream()
	            .filter(n -> n % 5 == 0)
	            .forEach(System.out::println);
	    }
	

	}


