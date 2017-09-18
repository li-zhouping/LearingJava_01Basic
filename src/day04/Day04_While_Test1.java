package day04;

public class Day04_While_Test1 {
	public static void main(String[] args) {
		int count = 0;
		
		int i = 100;
		while (i <= 999) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			if (ge * ge * ge + shi * shi * shi + bai * bai *bai == i) {
			count ++ ;
			}
			i ++;
		}
		System.out.println("count= " + count);
	}

}
