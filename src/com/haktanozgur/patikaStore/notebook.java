package com.haktanozgur.patikaStore;

import java.util.UUID;

public class notebook implements products {
	
	// Benzersiz ürün id'si, uuid formatında random oluşturuluyor. Listeleme sırasında kolaylık olması açısından,id'nin boyutu 5 elemana düşürülmüştür.
    String uniqueID = UUID.randomUUID().toString().replace("","").substring(27, 32);
	public String name;
	public brand brandName;
	public double price;
	public int discountRate;
	public int stock;
	public static final int ram = 8;
	public static final int storage = 512;
	public static final float screenSize = 14;
	
	// Sistem tarafından eklenen ürünün constructor yapısı
	public notebook(String name, brand brandName, double price, int discountRate, int stock) { 
		super();
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.discountRate = discountRate;
		this.stock = stock;
	}
	// Kullanıcı tarafından sepete eklenen ürünün constructor yapısı
    public notebook(String id) {  
		super();
		this.uniqueID = id;
	}

    //Kullanıcının sepetine notebook cinsinden ürünü eklemesini sağlayan metod
    @Override
	public void addProduct(String id, products notebook) {
    	for (int i = 0; i <= notebookList.notebookArrayList.size()-1; i++) {
	     if (id.equals(notebookList.notebookArrayList.get(i).uniqueID)) {
		  notebook = notebookList.notebookArrayList.get(i);	 
		  basket.notebookBasketList.add((notebook) notebook);
		  System.out.println("Ürün Eklenmiştir.");
	     }
       }
    }
    
    //Kullanıcının sepetindeki notebook cinsinden ürünü silmesini sağlayan metod
	@Override
	public void deleteProduct(String id, products notebook){
	  for (int i = 0; i <= basket.notebookBasketList.size()-1; i++) {
		if (id.equals(basket.notebookBasketList.get(i).uniqueID)) {
		    notebook = basket.notebookBasketList.get(i);
			basket.notebookBasketList.remove((notebook) notebook);
			System.out.println("Ürün silinmiştir...");
		}	
	  
		else {
			System.out.println("Girilen ürün kodu sepenizde bulunamadı...");
		}
	  }	
	}

    //Kullanıcının ürün arama menüsünden notebook cinsinden ürünleri arayarak listelemesini sağlayan metod
	@Override
	public void filterSearch(String word , products notebook) {
		
		for(int i =0; i<=notebookList.notebookArrayList.size()-1; i++) {
			if (word.equalsIgnoreCase(notebookList.notebookArrayList.get(i).brandName.getValueString().toLowerCase())) {
				notebook = notebookList.notebookArrayList.get(i);
				filterSearch.notebookFilterList.add((notebook)notebook);
				int filterSearchCount = filterSearch.notebookFilterList.size();
				System.out.println("Mağaza aramasında toplam "+filterSearchCount+" notebook ürünü bulundu");
				System.out.println("***Notebook Listesi***");
				filterSearch.getNotebookFilterList();
				filterSearch.notebookFilterList.clear();
			}
     	}
	}
}
