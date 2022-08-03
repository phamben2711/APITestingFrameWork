package Java;

import java.util.Scanner;

public class Interfaces {
abstract class HinhDang{
	private final float PI=3.14F;
	public float getPi() {
		return PI;
	}
	abstract void tinhtoan(float giaiTri);
}
class HinhTron extends HinhDang{
	float dienTich;
	@Override
	void tinhtoan(float banKinh) {
		// TODO Auto-generated method stub
		dienTich=getPi()*banKinh*banKinh;
		System.out.println("Dien tich cua Hinh Tron:"+dienTich);
		
	}
	
}
class ChuNhat extends HinhDang{
	float chuVi;
	float chieuDai;
	@Override
	void tinhtoan(float chieuRong) {
		// TODO Auto-generated method stub
		chuVi=2*(chieuRong+chieuDai);
		System.out.println("Chu vi hình chữ nhật là :" + chuVi);
		
	}
	
}
public static class MayTinh{
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("null")
	public static void main (String[] arg)
	{
	HinhDang objHinhDang;
	String hinhDang = null;
	System.out.println("Mời bạn nhập chiều rộng:");
	float rong =sc.nextFloat();
	switch (hinhDang) {
	case "hinhtron":
		objHinhDang= new HinhTron();
		objHinhDang.tinhtoan(rong);
		
		break;
	case "chunhat":
		objHinhDang = new ChuNhat();
		objHinhDang.tinhtoan(rong);
		break;
		
	default:
		System.out.println("Bạn chỉ nhập được HinhTron hoặc Chữ Nhật");
	}
	
	}
}
	}



