package baiTap;

import java.util.Scanner;

public class Cau4 {

	public static void main(String[] args) {
		
		//B1: Nhập tọa độ trường
		Scanner scan = new Scanner(System.in);
		int[] x = new int[4];
		int[] y = new int[4];
		System.out.println("Xin vui lòng nhập tọa độ trường: ");
		System.out.print("x = ");
		x[0] = scan.nextInt();
		System.out.print("y = ");
		y[0] = scan.nextInt();
		
		scan.nextLine();			
		
		//B2: Nhập tên, tọa độ nhà 3 sinh viên
		String[] ten = new String[3];
		double[] khoangCach = new double[3];
		System.out.println("Xin vui lòng nhập tên và tọa độ nhà 3 sinh viên: ");
		System.out.println("********************************************************");
		for (int i = 1; i < 4; i++) {
			System.out.println("Tên và tọa độ sinh viên thứ " + i + ": ");
			System.out.print("Họ và tên: ");
			ten[i-1] = scan.nextLine();
			
			System.out.print("Tọa độ x = ");
			x[i] = scan.nextInt();
			System.out.print("Tọa độ y = ");
			y[i] = scan.nextInt();
			
			scan.nextLine();	
			
			//B3: Tính khoảng cách đến trường với 
			//công thức d = sqrt((x1 - x2)^2 + (y1 - y2)^2)
			khoangCach[i-1] = Math.sqrt(Math.pow(x[i] - x[0], 2) + Math.pow(y[i] - y[0], 2));
		}

		//B4: Tìm ra khoảng cách xa nhất
		double max = 0;
		for (double kc : khoangCach) {
			if (max < kc) {
				max = kc;
			}
		}
		
		//B5: In kết quả ra màn hình
		System.out.println("********************************************************");
		System.out.println("Tên sinh viên ở xa trường đại học nhất là: ");
		for (int i = 0; i < 3; i++) {
			if (max == khoangCach[i]) {
				System.out.println(ten[i] + " - " + khoangCach[i]);
			}
		}
	}
}
