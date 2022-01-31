package finalExam;

public class Test {
	
	private String function(String temp, int data) {
		
		return ("GFG");
	}
	
	private String function(int data, String temp) {
		
		return("GeeksforGeeks");
	}
	public static void main(String[] args) {
		
		Test obj = new Test();
		System.out.println(obj.function(4, "GFG"));
	}
}