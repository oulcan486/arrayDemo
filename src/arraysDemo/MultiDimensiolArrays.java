package arraysDemo;

import java.util.Iterator;

public class MultiDimensiolArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] urunler=new String[3][3];
		String urunAdi="";
		urunler[0][0]="Asus";
		urunler[0][1]="Toshiba";
		urunler[0][2]="Lenovo";
		urunler[1][0]="Samsung";
		urunler[1][1]="Apple";
		urunler[1][2]="Huawei";
		urunler[2][0]="Vorcom";
		urunler[2][1]="Arcatel";
		urunler[2][2]="NPO";
		
		for (int i=0;i<=2;i++) {
			if(i==0) {
				urunAdi="Bilgisayar";
			}else if(i==1) {
				urunAdi="Telefon";
			}else {
				urunAdi="Tablet";
			}
			
			System.out.println((i+1)+". Kategori: "+urunAdi);
			System.out.println("----------------------");
			
		   for(int j=0;j<=2;j++) {
			   System.out.println(urunler[i][j]);
		   }
			
		}

	}

}
