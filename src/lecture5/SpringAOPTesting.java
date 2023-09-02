package lecture5;

public class SpringAOPTesting {
	public static void main(String[] args) {
		
		try {
			SpringAOPTesting test = new SpringAOPTesting();
			System.out.println(test.division(4,3));

			
		}catch(Exception e) {
			e.printStackTrace();

		}
		
	}
	public void beforeMethodCall() {
		System.out.println("Before method call");
	}
	public void afterMethodCall() {
		System.out.println("After method call");
	}
	public int division(int num1, int num2) {
		return num1/num2;
	}
 
}
