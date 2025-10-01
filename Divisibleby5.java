package com.numbers;

import java.util.Arrays;

public class Divisibleby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] numbers = {1,4,5,20,30,6};
        Arrays.stream(numbers).filter(n-> n% 5==0) .forEach(System.out::println);
	}

}
