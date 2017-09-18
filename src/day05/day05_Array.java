package day05;

public class day05_Array {
	public static void main(String[] args) {
		
		//数据类型[] 数组名 = new 数据类型[数组的长度]
		int[] arr1 = new int[5];
		//几个中括号代表几维数组
		
		/*1>数组的初始化
		 * 动态初始化：int[] arr =  new int[5];  //在内存开辟5块连续的空间
		 * 整型默认值0，浮点型默认值0.0，布尔类型默认false,字符类型默认值'\u0000'
		 * char在内存中占两个字节，是16个二进制位
		 * \u0000:每一个0其实代表的是16进制的0，四个0代表16个二进制位
		 * [I@15db9742 [代表数组，几个代表几维；I代表int类型；15db9742代表16进制的地址值
		 * 
		 * 静态初始化：int[] arr = new int[这里不写数字]{元素1，元素2，...};可以写成两行
		 *		简写：int[] arr = {元素1,元素2,...};简写形式必行写成一行
		 *
		 */
		System.out.println(arr1);
		System.out.println("-------------------");
		
		int [] arr2 = {11,22,77,44,55};

		//遍历数组
		System.out.println(arr2.length);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("-------------");
		//寻找数组中的最大值
		int max = getMax(arr2);
		System.out.println(max);
		
		//数组元素反转
		System.out.println("--------------");
		reverseArray(arr2);
		printArray(arr2);
		
	}
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) { //从i=1开始，因为i=1已经是max了
			if (arr[i] > max){
			max = arr[i];
			}
		}
		return max;
	}
	public static void reverseArray(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {
			//交换arr[0]和arr[arr.length-1-0]
			//交换arr[1]和arr[arr.length-1-1]
			//交换arr[2]和arr[arr.length-1-2]
			//交换arr[i]和arr[arr.length-1-i]
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
