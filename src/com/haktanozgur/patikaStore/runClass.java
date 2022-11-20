package com.haktanozgur.patikaStore;

import java.util.Scanner;

public class runClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstClick;
		int listClick;
		int addClick;
		String addIdClick;
		String colorClick;
		int memoryClick;
		int backClick;
		int deleteClick;
		String filterClick;
		phone phone1;
		notebook notebook1;
	
	  do {
		// Program ilk açıldığında çalışan arayüz kısmı
	    System.out.println("Hoşgeldiniz...\n"
				+ "*******************\n\n"
				+"Ürün Listesi için lütfen 1'e basınız\n"
				+ "Sepetinizi görüntülemek için 2'ye basınız\n"
				+ "Marka ismine göre arama yapmak için 3'e basınız...\n"
				+ "Çıkmak için 9'a basınız\n\n"
				+ "********************");                              
        firstClick = scanner.nextInt();	
		// Kullanıcı listelemeyi seçerse çalışacak olsan kısım 
		
        if(firstClick == 1) {
			System.out.println("Lütfen ürün grubu seçiniz...\n"
					+ "Telefon listesi için 1'e basınız..\n"
					+ "Notebook listesi için 2'e basınız..");           
		    listClick = scanner.nextInt();  
		  //Kullanıcı listeleme bölümünden telefonu seçerse çalışacak olsan telefon listesi ve işlemler bölümü 
		    
		  if(listClick == 1) {                                           
				phoneList.getPhoneList();
				System.out.println("********************\n"
						+ "Listeden ürün eklemek için Lütfen 1'e basınız");
				addClick = scanner.nextInt();
				
			 //Kullanıcının sepetine ürün eklediği bölüm	
			 if(addClick == 1) {
		        System.out.println("Eklemek istediğiniz ürünün ürün kodunuz yazınız...");  
			    addIdClick = scanner.next();
			    System.out.println("Seçmek istediğiniz rengi büyük harflerle yazınız...");
			    colorClick = scanner.next();
			    System.out.println("Seçmek istediğiniz hafıza seçeneğiniz yazınız...");
			    memoryClick = scanner.nextInt();
		        phone1 = new phone(addIdClick , colorClick , memoryClick);
		        phone1.addProduct(addIdClick, phone1);
                   
                System.out.println("********************\n"
                		+ "Ana Menüye dönmek için 0'a basınız");
		        backClick = scanner.nextInt();
		        if(backClick == 0) {
		            continue;
		        }
		                
		      }
		  }
		  //Kullanıcı listeleme bölümünden notebook seçerse çalışacak olsan notebook listesi ve işlemler bölümü
		  else if(listClick == 2) {                                         
                notebookList.getNotebookList();
                System.out.println("********************\n"
                		+ "Listeden ürün eklemek için Lütfen 1'e basınız ");
				addClick = scanner.nextInt();
		     if(addClick == 1) {
				System.out.println("Eklemek istediğiniz ürünün ürün kodunuz yazınız...");
				addIdClick = scanner.next();
                notebook1 = new notebook(addIdClick);
                notebook1.addProduct(addIdClick, notebook1);
                
                System.out.println("********************\n"
                		+ "Ana Menüye dönmek için lütfen 0'a basınız...");
                backClick = scanner.nextInt();
                if(backClick == 0) {
                	continue;
                }
             }
		   }
	    }
        //Kullanıcı Filtreleme kullanarak marka araması yapmak istediği zaman çalışacak bölüm
        else if (firstClick == 3) {
        	System.out.println("Marka Listesi...");
        	System.out.println(brand.getBrandList());
        	System.out.println("Arama yapmak istediğiniz markanın ismini yazınız...");
        	filterClick = scanner.next();
        	notebook notebookFilter = new notebook(filterClick);
        	phone phoneFilter = new phone(filterClick);
        	notebookFilter.filterSearch(filterClick , notebookFilter);
        	phoneFilter.filterSearch(filterClick, phoneFilter);
        	System.out.println("********************\n"
             		+ "Ana Menüye dönmek için lütfen 0'a basınız...");
            backClick = scanner.nextInt();
            if(backClick == 0) {
             	continue;
            }	
        }
        // Kullanıcı sepetimi görüntüle seçeneğini seçerse çalışacak olsan sepet listeleme bölümü
        else if(firstClick == 2) {                                          
        	if(basket.notebookBasketList.isEmpty() == true && basket.phoneBasketList.isEmpty() == true) {
        	   System.out.println("Sepenizde Ürün Bulunmamaktadır...");
        	   System.out.println("Ana Menüye Yönlendiriliyorsunuz....");
        	   System.out.println("*************");
        	   continue;
            }
             else if (basket.notebookBasketList.isEmpty() == true && basket.phoneBasketList.isEmpty() == false) {
        	   basket.phoneBsketList();
               System.out.println("********************\n"
              		+ "Sepenizden ürün silmek için 1'e basınız...\n"
               		+ "Ana Menüye dönmek için lütfen 0'a basınız...");
         	   deleteClick = scanner.nextInt();
               if(deleteClick == 1) {
             	  System.out.println("Sileceğiniz ürünün kodunuz yazınız...");
             	  addIdClick = scanner.next();
             	  phone1 = new phone(addIdClick);
             	  phone1.deleteProduct(addIdClick, phone1);
         	   }
               else if (deleteClick == 0) {
             	 continue;
               } 
            }
            else if(basket.notebookBasketList.isEmpty() == false && basket.phoneBasketList.isEmpty() == true) {
        	  basket.getNotebookBasketList();
              System.out.println("********************\n"
             		+ "Sepenizden ürün silmek için 1'e basınız...\n"
              		+ "Ana Menüye dönmek için lütfen 0'a basınız...");
        	  deleteClick = scanner.nextInt();
              if(deleteClick == 1) {
            	 System.out.println("Sileceğiniz ürünün kodunuz yazınız...");
            	 addIdClick = scanner.next();
            	 notebook1 = new notebook(addIdClick);
            	 notebook1.deleteProduct(addIdClick, notebook1);
        	  }
              else if (deleteClick == 0) {
            	 continue;
              }	 
           }
           else {
        	  basket.phoneBsketList();
        	  System.out.println();
              basket.getNotebookBasketList();
           }
         System.out.println("********************\n"
         		+ "Ana Menüye dönmek için lütfen 0'a basınız...");
         backClick = scanner.nextInt();
         if(backClick == 0) {
         	continue;
         }	
      }
      //Kullanıcın işlemleri bittikten sonra programda çıkmasını sağlayan bölüm
      else if (firstClick == 9) {
        System.out.println("Sistemden Çıkış Yapılıyor...");
        scanner.close();
      }
	  else {
		System.out.println("Lütfen geçerli bir sayı giriniz...");
	  }
      
	}while(firstClick != 9); // oluşturulan do-while döngüsün bittiği koşul
  }
}


	
	
	


		
		
			
		
	
	
        	
        
	

