package bai6;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {
	private String lop, khoaHoc, kyHoc;
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(String khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	public String getKyHoc() {
		return kyHoc;
	}
	public void setKyHoc(String kyHoc) {
		this.kyHoc = kyHoc;
	}
	public HSHocSinh() {
		// TODO Auto-generated constructor stub
	}
	public HSHocSinh(String khoaHoc, String kyHoc, String lop) {
		this.khoaHoc = khoaHoc;
		this.kyHoc = kyHoc;
		this.lop = lop;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.printf("Nhập lớp: ");
		lop = sc.nextLine();
		System.out.printf("Khóa học: ");
		khoaHoc = sc.nextLine();
		System.out.printf("Kỳ học: ");
		kyHoc = sc.nextLine();
	}
	void xuat() {
		super.xuat();
		System.out.println("Lớp: " + getLop());
		System.out.println("Khóa học: "+getKhoaHoc());
		System.out.println("Kỳ học: " + getKyHoc());
	}
	boolean n85() {
		if (getNamSinh() == 1985) {
			return true;
		} else return false;
	}
	static void qNA(HSHocSinh arr[], int n) {
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i].getQue().equals("Nghệ An") && arr[i].getNamSinh() == 1985) {
				dem++;
			}
		}
		System.out.println("Số học sinh quê Nghệ An và sinh năm 1985 là: " + dem);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhập số hs: ");
		int n; n = Integer.parseInt(sc.nextLine());
		HSHocSinh [] hshs = new HSHocSinh[n];
		for (int i = 0; i < n; i++) {
			hshs[i] = new HSHocSinh();
			hshs[i].nhap();
		}
		qNA(hshs, n);
		for (int i = 0; i < n; i++) {
			if (hshs[i].n85()) hshs[i].xuat();
		}
	}
}
