package day06070809;

public class Day07_ArrayTool_Test {
	public static void main(String[] args) {
		int[] arr = {33,11,22,66,55,44};
		
		int max = ArrayTool.getMax(arr);
		System.out.println(max);
		
		System.out.println("-------------");
		
		ArrayTool.print(arr);
		
		System.out.println("--------------");
		
		ArrayTool.reverse(arr);
		ArrayTool.print(arr);
	}
}
