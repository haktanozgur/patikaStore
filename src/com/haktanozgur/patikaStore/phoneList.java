package com.haktanozgur.patikaStore;

import java.util.ArrayList;
import java.util.Arrays;

//Bu sınıf phone cinsinden nesnelerin liste olarak tanımlandığı sınıf
public class phoneList  {
	
	//Bu ArraysList mağazada bulunan telefon listesini içeriyor.
	public static ArrayList<phone> phoneArrayList = new ArrayList<>(Arrays.asList(
	         new phone("V40", brand.SAMSUNG, 12000, 10, 24),
	         new phone("V867", brand.HUAWEI, 8000, 15, 12),
	         new phone("iPhone13", brand.APPLE, 36000, 5, 8),
	         new phone("X68", brand.XIAOMI, 5500, 20, 17)));
	
	//Bu metod phoneArrayList içerisinde bulunan nesneleri formatlı bir şekilde ekrana yazdırıyor
	public static void getPhoneList() {
		int headerArea = 10;
		String formatterArea = "";
	
		for(int i= 0;i <=headerArea; i++ ) {
			formatterArea += "%-10s";
			
			if(i == headerArea) {
				formatterArea += '\n';
			}
		}		
		System.out.format(formatterArea, "Marka", "Kodu", "Modeli", "Rengi","\t"+"\t"+"Fiyatı","\t"+
		    "İndirim oranı","\t"+"Stok Sayısı","\t"+"Hafıza","\t"+"Pil Enerjisi","\t"+"Ram","\t"+"Ekran Boyutu");

		for(int i = 0; i <= phoneList.phoneArrayList.size()-1; i++){
			 String markaString = phoneList.phoneArrayList.get(i).brandName.getValueString();
			 String code = phoneList.phoneArrayList.get(i).uniqueID;
			 String modalName = phoneList.phoneArrayList.get(i).name;
			 Double priceDouble = phoneList.phoneArrayList.get(i).price;
			 int discount = phoneList.phoneArrayList.get(i).discountRate;
			 int stock = phoneList.phoneArrayList.get(i).stock;
			 int energy = phone.energy;
			 int ram = phone.ram;
			 float screenSize = phone.screenSize;
			 
			 System.out.format(formatterArea, markaString, code, modalName, Arrays.toString(phone.colorList),"\t"+priceDouble,
					"\t"+discount,"\t"+stock,"\t"+Arrays.toString(phone.memoryList),"\t"+energy,"\t"+ram,"\t"+screenSize );
         }
	}
}
