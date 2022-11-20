package com.haktanozgur.patikaStore;

import java.util.UUID;

public class phone implements products {

	// Benzersiz ürün id'si, uuid formatında random oluşturuluyor. Listeleme sırasında kolaylık olması açısından,id'nin boyutu 5 elemana düşürülmüştür.
    String uniqueID = UUID.randomUUID().toString().replace("","").substring(27, 32);
	public int id;
	public String name;
	public String color;
	public brand brandName;
	public double price;
	public int discountRate;
	public int stock;
	public int memory;
	public static int energy = 4000;
	public static int ram = 6;
	public static float screenSize = (float) 6.1;
	public static String memoryList[] = {"64","128"};
	public static String colorList[] = {"Siyah" , "Kırmızı" , "Mavi"};
	

	// Sistem tarafından eklenen ürünün constroctor
	public phone(String name,brand brandName, double price, int discountRate, int stock) { 
		super();
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.discountRate = discountRate;
		this.stock = stock;
	}	
	// Kullanıcın sepetine ürün eklerken oluşacak nesnenin constructor yapısı
	public phone(String id , String color , int memory) {  
		super();
		this.uniqueID = id;
		this.color = color;
		this.memory = memory;
	}
	//Kullanıcın ürün kodu ile filtreleme yapması için oluşturulan nesnenin costructor yapısı
	public phone (String id) {
		super();
		this.uniqueID = id;
	}
	

	//Kullanıcının sepetine phone cinsinden ürünü eklemesini sağlayan metod
    @Override
	public void addProduct( String id, products phone) {
       for (int i = 0; i <= phoneList.phoneArrayList.size()-1; i++) {
   	     if (id.equals(phoneList.phoneArrayList.get(i).uniqueID)) {
   		  phone = phoneList.phoneArrayList.get(i);
   		  basket.phoneBasketList.add((phone) phone);
   		  System.out.println("Ürün Eklenmiştir.");
   	     }
       }
    }
    
    //Kullanıcının sepetindeki notebook cinsinden ürünü silmesini sağlayan metod
	@Override
	public void deleteProduct(String id, products phone){
	  for (int i = 0; i <= basket.phoneBasketList.size()-1; i++) {
		if (id.equals(basket.phoneBasketList.get(i).uniqueID)) {
		    phone = basket.phoneBasketList.get(i);
			basket.phoneBasketList.remove((phone) phone);
			System.out.println("Ürün silinmiştir...");
		}	
		else {
			System.out.println("Girilen ürün kodu sepenizde bulunamadı...");
		}
	  }	
	}

	//Kullanıcının ürün arama menüsünden notebook cinsinden ürünleri arayarak listelemesini sağlayan metod
	@Override
	public void filterSearch(String word , products phone) {
		
		for(int i =0; i<=phoneList.phoneArrayList.size()-1; i++) {
			if (word.equalsIgnoreCase(phoneList.phoneArrayList.get(i).brandName.getValueString().toLowerCase())){
				phone = phoneList.phoneArrayList.get(i);
				filterSearch.phoneFilterList.add((phone)phone);
				int filterSearchCount = filterSearch.phoneFilterList.size();
				System.out.println("Mağaza aramasında toplam "+filterSearchCount+" telefon ürünü bulundu");
				System.out.println("***Telefon Listesi***");
				filterSearch.phoneFilterList();
				filterSearch.notebookFilterList.clear();
			}
		}	
	}
}
