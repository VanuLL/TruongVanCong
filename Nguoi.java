package bai6;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Nguoi {
	private String hoTen, que;
	private int tuoi, namSinh;
	Nguoi(String hoTen, String que, int tuoi, int namSinh) {
		this.hoTen = hoTen;
		this.que = que;
		this.tuoi = tuoi;
		this.namSinh = namSinh;
	}
	Nguoi(){
	}
	void nhap() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.printf("Nhập họ và tên: ");
		hoTen = sc1.nextLine();
		System.out.printf("Nhập quê: ");
		que = sc1.nextLine();
		System.out.printf("Nhập năm sinh: ");
		namSinh = Integer.parseInt(sc2.nextLine());
	}
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public int getTuoi() {
        LocalDateTime localDate = LocalDateTime.now();
        int year = localDate.getYear();
        tuoi = year - getNamSinh();
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	void xuat() {
		System.out.println("\nHọ và tên: " + getHoTen());
		System.out.println("Quê: " + getQue());
		System.out.println("Tuổi: " + getTuoi());
		System.out.println("Năm sinh: " + getNamSinh());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.printf("Nhập số hs: ");
		n = Integer.parseInt(sc.nextLine());
		Nguoi [] ng = new Nguoi[n];
		for (int i = 0; i < n; i++) {
			ng[i] = new Nguoi();
			ng[i].nhap();
		}
		for (int i = 0; i < n; i++) {
			ng[i].xuat();
		}
	}
}
