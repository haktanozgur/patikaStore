package com.haktanozgur.patikaStore;

import java.util.ArrayList;
import java.util.Arrays;


//Bu sınıf notebook cinsinden nesnelerin liste olarak tanımlandığı sınıf
public class notebookList {
	
	//Bu ArraysList mağazada bulunan notebook listesini içeriyor.
	public static ArrayList<notebook> notebookArrayList = new ArrayList<>(Arrays.asList(
			new notebook("XV560", brand.LENOVA, 28500, 15, 9),
			new notebook("P760", brand.CASPER, 32000, 10, 11),
			new notebook("TY760", brand.MONSTER, 75300, 15, 5),
			new notebook("SH890", brand.ASUS, 39700, 10, 13),
			new notebook("UG89", brand.HP, 17800, 20, 17),
			new notebook("Macbook Air", brand.APPLE, 43000, 25, 6)));
	
	
	//Bu metod notebookList içerisinde bulunan nesneleri formatlı bir şekilde ekrana yazdırıyor
	public static void getNotebookList() {

		int headerArea = 8;
		String formatterArea = "";
	
		for(int i= 0;i <=headerArea; i++ ) {
			formatterArea += "%-10s";
			
			if(i == headerArea) {
				formatterArea += '\n';
			}
		}
		
		System.out.format(formatterArea, "Marka", "Kodu", "Modeli","\t"+"Fiyatı","\t"+
		"İndirim oranı","\t"+"Stok Sayısı","\t"+"Depolama","\t"+"Ram","\t"+"Ekran Boyutu");
		
		for(int i = 0; i <= notebookList.notebookArrayList.size()-1; i++){
			 String markaString = notebookList.notebookArrayList.get(i).brandName.getValueString();
			 String code = notebookList.notebookArrayList.get(i).uniqueID;
			 String modalName = notebookList.notebookArrayList.get(i).name;
			 Double priceDouble = notebookList.notebookArrayList.get(i).price;
			 int discount = notebookList.notebookArrayList.get(i).discountRate;
			 int stock = notebookList.notebookArrayList.get(i).stock;
			 int storage = notebook.storage;
			 int ram = notebook.ram;
			 float screenSize = notebook.screenSize;
			 
			System.out.format(formatterArea, markaString, code, modalName,"\t"+priceDouble,
					"\t"+discount,"\t"+stock,"\t"+storage,"\t"+ram,"\t"+screenSize );
			
		}
		
	}
}
