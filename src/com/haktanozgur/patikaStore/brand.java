package com.haktanozgur.patikaStore;

import java.util.ArrayList;
import java.util.Arrays;

// Kullanılan brand enum'ı sistemde mevcut markaların isimlerini ve numaralarını tutyor ve kullanıcının filtreleme seçeneği bu enum içerisinde değişkenler ile yapılıyor.
public enum brand  {  

	SAMSUNG("Samsung",1000),
	LENOVA("Lenova", 1001),
	APPLE("Apple", 1002),
	HUAWEI("Huawei", 1003),
	CASPER("Casper", 1004),
	ASUS("Asus", 1005),
	HP("Hp",1006),
	XIAOMI("Xiaomi",1007),
	MONSTER("Monster" , 1008);
	
	// Bu Arraylist tüm markaları içerisinde barındırıyor.
	public static ArrayList<brand> brandList = new ArrayList<>(Arrays.asList(brand.values()));
	private String value;
	private int deger;
	
	brand(String value, int deger) {
      this.value=value;
      this.deger=deger;
	}
	
	// Bu method markanın string değerini döndürmek için kullanılıyor.
	public String getValueString() {  
		return value;
	}
	// Bu method markanın id değerini döndürmek için kullanılıyor
	public int getDeger() { 
		return deger;
	}

	// Bu method sistemde bulunan tüm markaların, oluşturulan arraylist üzerinden listesini döndürüyor.
	public static ArrayList<brand> getBrandList() { 
		
		return brandList;
	}



}
