package day04;
/*
 * Java语言基础(方法概述和格式说明)
* A:为什么要有方法
	* 提高代码的复用性 
* B:什么是方法
	* 完成特定功能的代码块。 
* C:方法的格式
* 
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值; 
		} 
* D:方法的格式说明
	* 修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。
	* 返回值类型：就是功能结果的数据类型。
	* 方法名：符合命名规则即可。方便我们的调用。
	* 参数：
		* 实际参数：就是实际参与运算的。
		* 形式参数；就是方法定义上的，用于接收实际参数的。
	* 参数类型：就是参数的数据类型
	* 参数名：就是变量名
	* 方法体语句：就是完成功能的代码。
	* return：结束方法的。
	* 返回值：就是功能的结果，由return带给调用者。 
 */


public class Day04_Methond_Demo1 {
	public static void main(String[] args) {
		int sum = add(10,20);
		System.out.println(sum);
	}
	
	/*
	 * 练习：写一个求两个整数的和的方法
	 */
	public static int add(int a, int b) {
		int sum =  a + b;
		return sum;
	}
}
