package com.vektorel;

import java.util.List;

public interface ICRUD {
	
	//INTERFACE OLUSTURURKEN ISIMLERININ BASINA 'I' INTERFACE'N BAS HARFINI KOYUYORUZ.
	
	//intrefacelerde method tanimlarken suslu parantez kullanmak zorunda degiliz.
	//veri islemi yapan tum siniflar miras alacagi icin burada sadece kalip olusturuyoruz.
	
	public void Kaydet(Object o);
	public void Sil(int id);
	public void Duzenle(Object o);
	public List<Object> listele();
	
	
	
}
