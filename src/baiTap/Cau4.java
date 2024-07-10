package baiTap;

import java.util.Scanner;

public class Cau4 {

	public static void main(String[] args) {
		
		//B1: Nhập tọa độ trường
		Scanner scan = new Scanner(System.in);
		int toaDoTruong = scan.nextInt();
		scan.nextLine();			
		
		//B2: Nhập tên, tọa độ nhà 3 sinh viên
		String[] ten = new String[3];
		int[] toaDo = new int[3];
		System.out.println("Xin vui lòng nhập tên và tọa độ nhà 3 sinh viên: ");
		System.out.println("********************************************************");
		for (int i = 0; i < 3; i++) {
			System.out.println("Tên và tọa độ sinh viên thứ " + (i+1) + ": ");
			System.out.print("Họ và tên: ");
			ten[i] = scan.nextLine();
			
			System.out.print("Tọa độ: ");
			toaDo[i] = scan.nextInt();
			
			scan.nextLine();			
		}

		//B2:
	}
}
