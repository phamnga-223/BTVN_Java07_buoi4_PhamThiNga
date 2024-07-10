package baiTap;

import java.util.Scanner;

/**
 * Câu 2: Cho 3 số nguyên. Viết chương trình xuất ra có bn số lẻ và bn số chẵn
 */
public class Cau2 {

	public static void main(String[] args) {
		
		//B1: Nhập 3 số nguyên
		System.out.println("Xin vui lòng nhập 3 số nguyên:");
		Scanner scan = new Scanner(System.in);
		int le = 0; int chan = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("Số thứ " + (i + 1) + ": ");
			int a = scan.nextInt();
			
			//B2: Kiểm tra là số chắn hay lẻ?
			if (a % 2 == 0) {
				chan++;
			} else {
				le++;
			}
		}
				
		//B3: In kết quả ra màn hình
		System.out.println("*******************************************");
		System.out.println("Input nhập vào có: " + chan + " số chẵn và " + le + " số lẻ.");
	}
	
}
