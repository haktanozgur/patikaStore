package com.haktanozgur.patikaStore;

import java.util.ArrayList;
import java.util.Arrays;

//filterSearch sınıfı kullanıcın filtrelemeli aramasını yaptıktan sonra çalışan sınıf
public class filterSearch {
	
    //Kullanıcının filtrelediği ürünü, yeni bir nesne oluşturarak nesneyi eklediği ArrayListler
	public static ArrayList<notebook> notebookFilterList = new ArrayList<>();
	public static ArrayList<phone> phoneFilterList = new ArrayList<>();
	
    //Kullanıcının filtrelediği notebook ürünlerinin listesini formatlı bir şekilde ekrana yazdıran metod
    public static void getNotebookFilterList() {
	  int headerArea = 7;
	  String formatterArea = "";

	  for(int i= 0;i <=headerArea; i++ ) {
		  formatterArea += "%-10s";
		
		  if(i == headerArea) {
			formatterArea += '\n';
		  }
	  }
	  System.out.format(formatterArea, "Marka", "Kodu", "Modeli","\t"+"Fiyatı","\t"+
	  "İndirim oranı","\t"+"Depolama","\t"+"Ram","\t"+"Ekran Boyutu");
	
	  for(int i = 0; i <= filterSearch.notebookFilterList.size()-1; i++){
		   String markaString = filterSearch.notebookFilterList.get(i).brandName.getValueString();
		   String kod = filterSearch.notebookFilterList.get(i).uniqueID;
		   String modalName = filterSearch.notebookFilterList.get(i).name;
		   Double priceDouble = filterSearch.notebookFilterList.get(i).price;
		   int discount = filterSearch.notebookFilterList.get(i).discountRate;
		   int storage = notebook.storage;
		   int ram = notebook.ram;
		   float screenSize = notebook.screenSize;
		 
		   System.out.format(formatterArea, markaString, kod, modalName,"\t"+priceDouble,
				  "\t"+discount,"\t"+storage,"\t"+ram,"\t"+screenSize );	
	  }  
    }
    
    //Kullanıcının filtrelediği notebook ürünlerinin listesini formatlı bir şekilde ekrana yazdıran metod
	public static void phoneFilterList() {
	  int headerArea = 9;
      String formatterArea = "";
	
	  for(int i= 0;i <=headerArea; i++ ) {
		  formatterArea += "%-12s";
			
		  if(i == headerArea) {
				formatterArea += '\n';
		  }
	  }		
	  System.out.format(formatterArea, "Marka", "Kodu", "Modeli", "Rengi","\t"+"\t"+"Fiyatı","\t"+
		  "İndirim oranı","\t"+"Stok Sayısı","\t"+"Hafıza","\t"+"Pil Enerjisi","\t"+"Ram","\t"+"Ekran Boyutu");

	  for(int i = 0; i <= filterSearch.phoneFilterList.size()-1; i++){
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
