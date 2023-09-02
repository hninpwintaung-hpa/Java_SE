package lecture9;

import java.util.ArrayList;

public class ArrayListsExercise {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);

		int result = caculateSumOfEvenNumber(numbers);
		System.out.println("Sum of even numbers: " + result);
	}

	public static int caculateSumOfEvenNumber(ArrayList<Integer> numbers) {

		int sum = 0;

		for (int num : numbers) {
			if (num % 2 == 0) {
				sum += num;
			}
		}

		return sum;
	}
}
