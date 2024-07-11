package baiTap;

import java.util.Scanner;

/**
 * Câu 1: Nhập tên và năm sinh 3 sinh viên.
 * Hãy viết chương trình xuaatts ra tên và năm sinh của sinh viên trẻ nhất
 */
public class Cau1 {

	public static void main (String[] args) {
		//B1: Nhập tên và năm sinh 3 sinh viên
		Scanner scan = new Scanner(System.in);
		String[] hoTen = new String[3];
		int[] namSinh = new int[3];
		System.out.println("Xin vui lòng nhập thông tin các sinh viên: ");
		System.out.println("*****************************************************");
		for (int i = 0; i < 3; i++) {
			System.out.print("Họ tên sinh viên " + (i + 1) + ": "); //Sinh viên thứ i
			hoTen[i] = scan.nextLine();
			
			System.out.print("Năm sinh của sinh viên " + (i + 1) + ": ");
			namSinh[i] = scan.nextInt();

			scan.nextLine();
			
			//B2: Kiểm tra tên và năm sinh
			if (hoTen[i] == "") {
				System.out.println("Họ tên sinh viên không được để trống!");
				return;
			}
			if (namSinh[i] <= 0 || namSinh[i] >= 2024) {
				System.out.println("Năm sinh nhập vào không hợp lệ!");
				return;
			}
		}
		
		//B3: So sánh năm sinh
		int min = namSinh[0];
		for (int i = 1; i < 3; i++) {
			if (min < namSinh[i]) {
				min = namSinh[i];
			}
		}
		
		//B4: In kết quả ra màn hình
		System.out.println("*****************************************************");
		System.out.println("Sinh viên trẻ nhất là:");
		for (int i = 0; i < 3; i++) {
			if (namSinh[i] == min) {
				System.out.println(hoTen[i] + " - " + min);
			}
		}
	}
	
}
