package com.haktanozgur.patikaStore;

import java.util.ArrayList;

//Kullanıcının ürün listesinden ürün ekleyebilmesi için oluşturulan "Ürün Sepeti" sınıfı
public class basket  {
	
	//Kullanıcının listeden eklediği ürünü yeni bir nesne oluşturarak, nesneyi eklediği ArrayListler
	public static ArrayList<notebook> notebookBasketList = new ArrayList<>();
	public static ArrayList<phone> phoneBasketList = new ArrayList<>();
	
	//Bu metod notebookBasketList içerisinde bulunan nesneleri formatlı bir şekilde ekrana yazdırıyor
    public static void getNotebookBasketList() {
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
	
	  for(int i = 0; i <= basket.notebookBasketList.size()-1; i++){
		   String markaString = basket.notebookBasketList.get(i).brandName.getValueString();
		   String kod = basket.notebookBasketList.get(i).uniqueID;
		   String modalName = basket.notebookBasketList.get(i).name;
		   Double priceDouble = basket.notebookBasketList.get(i).price;
		   int discount = basket.notebookBasketList.get(i).discountRate;
		   int storage = notebook.storage;
		   int ram = notebook.ram;
		   float screenSize = notebook.screenSize;
		 
		   System.out.format(formatterArea, markaString, kod, modalName,"\t"+priceDouble,
				  "\t"+discount,"\t"+storage,"\t"+ram,"\t"+screenSize );
	  }  
    }
    
    //Bu metod phoneBasketList içerisinde bulunan nesneleri formatlı bir şekilde ekrana yazdırıyor
	public static void phoneBsketList() {
	  int headerArea = 9;
      String formatterArea = "";
	
	  for(int i= 0;i <=headerArea; i++ ) {
		  formatterArea += "%-12s";
			
		  if(i == headerArea) {
				formatterArea += '\n';
		  }
	  }		
	  System.out.format(formatterArea, "Marka", "Kodu", "Modeli", "Rengi","Fiyatı",
	  "İndirim %","Hafıza","Pil Ömrü","Ram","Ekran Boyutu");

	  for(int i = 0; i <= basket.phoneBasketList.size()-1; i++){
	   	    String markaString = basket.phoneBasketList.get(i).brandName.getValueString();
			String kod = basket.phoneBasketList.get(i).uniqueID;
			String modalName = basket.phoneBasketList.get(i).name;
			String color = basket.phoneBasketList.get(i).color;
			Double priceDouble = basket.phoneBasketList.get(i).price;
			int discount = basket.phoneBasketList.get(i).discountRate;
			int memory = basket.phoneBasketList.get(i).memory;
			int energy = phone.energy;
			int ram = phone.ram;
			float screenSize = phone.screenSize;
 	 
   		    System.out.format(formatterArea, markaString, kod, modalName, color,priceDouble,
					+discount,+memory,+energy,ram,screenSize );
       }
	}
}
