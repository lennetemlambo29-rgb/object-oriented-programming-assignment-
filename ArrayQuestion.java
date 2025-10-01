package Question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayQuestion {
		
		  static class InvalidAgeException extends Exception {
		        public InvalidAgeException(String message) {
		            super(message);
		        }
		    }

		    public static void checkAge(int age) throws InvalidAgeException {
		        if (age < 18) {
		            throw new InvalidAgeException("Age must be 18 or above. You entered: " + age);
		        }
		        System.out.println("Valid age: " + age + ". Registration successful.");
		    }

		    public static void main(String[] args) {
		        
		        List<Integer> numbers = Arrays.asList(1, 4, 5, 20, 30, 6);

		        List<Integer> divisibleByFive = numbers.stream()
		                                               .filter(n -> n % 5 == 0)
		                                               .collect(Collectors.toList());

		        System.out.println("Numbers divisible by 5: " + divisibleByFive);

		        try {
		            checkAge(15); 
		        } catch (InvalidAgeException e) {
		            System.out.println("Caught exception: " + e.getMessage());
		        }

		        try {
		            checkAge(22);
		        } catch (InvalidAgeException e) {
		            System.out.println("Caught exception: " + e.getMessage());
		        }
		    }
		}


