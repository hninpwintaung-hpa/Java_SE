package lecture9;

public class ArrayExercise {
	public static void main(String[] args) {
		ArrayExercise ex = new ArrayExercise();
		ex.array(9);
	}

	public void array(int index) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		try {
			System.out.println(arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
}
