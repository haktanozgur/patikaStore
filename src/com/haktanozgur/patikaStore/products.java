package com.haktanozgur.patikaStore;

public interface products {
	
	//addProduct metodu kullanıcın sepetine ürün eklemesini sağlayan metod
	public void addProduct(String id , products product);
	//deleteProduct metodu kullanıcının sepetindeki ürünü silmesini sağlayan metod
	public void deleteProduct(String id , products product);
	//filterSearch metodu kullanıcının mağa listesinde bulunan ürünleri marka ismine göre aramasını ve listelemesini sağlayan metod
	public void filterSearch(String word , products product);
}
