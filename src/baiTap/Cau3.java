package baiTap;

import java.util.Scanner;

/**
 * Câu 3: Cho biết tên, năm sinh, giới tính 3 cán bộ.
 * Hãy viết chương trình tìm và in tên cán bộ Nam trẻ nhất.
 */
public class Cau3 {

	public static void main(String[] args) {
		
		//B1: Nhập tên, năm sinh, giới tính 3 cán bộ
		Scanner scan = new Scanner(System.in);
		System.out.println("Xin vui lòng nhập thông tin về 3 cán bộ:");
		System.out.println("**********************************************");
		String[] ten = new String[3];
		int[] namSinh = new int[3];
		int[] gioiTinh = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Cán bộ thứ " + (i+1) + ": ");
			System.out.print("Họ tên: "); //Họ tên
			ten[i] = scan.nextLine();
			//B2: Kiểm tra input đầu vào
			if (ten[i] == "") {
				System.out.println("Tên nhập vào không được trống!");
				return;
			}

			System.out.print("Năm sinh: "); //Năm sinh
			namSinh[i] = scan.nextInt();
			//B2: Kiểm tra input đầu vào
			if (namSinh[i] <= 0 || namSinh[i] >= 2024) {
				System.out.println("Năm sinh không hợp lệ!");
				return;
			}

			System.out.print("Giới tính (Nam nhập 0//Nữ nhập 1): "); //Giới tính
			gioiTinh[i] = scan.nextInt();
			//B2: Kiểm tra input đầu vào
			if (gioiTinh[i] != 0 && gioiTinh[i] != 1) {
				System.out.println("Giới tính không hợp lệ!");
				return;
			}
			
			System.out.println("---------------------------------------");
			scan.nextLine();
		}
				
		//B3: Tìm cán bộ Nam trẻ nhất
		int min = 2024;
		for (int i = 0; i < 3; i++) {
			if (gioiTinh[i] == 0) { //Cán bộ nam có giới tính là 0
				if (min > namSinh[i]) min = namSinh[i];
			}
		}
		
		//B4: In kết quả ra màn hình
		//TH1: Không có cán bộ nam
		if (min == 2024) {
			System.out.println("Không có cán bộ Nam!");
			return;
		}
		//TH2: Có cán bộ nam
		System.out.println("Cán bộ Nam trẻ nhất là:");
		for (int i = 0; i < 3; i++) {
			if (gioiTinh[i] == 0) { //Cán bộ nam có giới tính là 0
				if (min == namSinh[i]) {
					System.out.println(ten[i] + " - " + namSinh[i]);
				}
			}
		} 
	}
	
}
