package karma;
import java.util.*;

public class Karma {
	public int N;
	public LinkedList<Dugum>[] bl;
	
	//yapılandırıcı:
	public Karma(int N) {
		this.N = N;
		
		bl = new LinkedList[N];
		
		for(int i=0;i<N;i++) {
			bl[i] = new LinkedList();     // her elemanı bağlı liste yaptım
		}
	}
	
	//hash fonk:
	public int karmaFonk(int i) {
		return i%N;
	}
	
	
	//Eleman Ekleme:
	public void elemanEkle(Dugum e) {
		int adres = karmaFonk(e.id);
		
		bl[adres].add(e);
	}
	
	//Eleman Silme:
	public void elemanSil(Dugum e) {
		//1. adres bul:
		int adres = karmaFonk(e.id);
		//2. adresi tamamen sil
		bl[adres].remove(adres);
	}
	
	//Eleman Aramak:
	public void elemanAra(Dugum e) {
		//1. önce adres bul
		int adres = karmaFonk(e.id);
		
		for(int i=0;i<bl[adres].size();i++) {
			Dugum d = bl[adres].get(i);
			if(d.id == e.id) {
				System.out.println("aradığın değer: " + adres + " hanesinin " + i + " elemanıdır");
			}
		}
	}
	
	//hash table yazdırmak:
	public void tableYazir() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<bl[i].size();j++) {
				Dugum d2 = bl[i].get(j);
				System.out.println(i + " hanesi elemanın " + j + " indexindeki eleman:" + d2.id);
			}
		}
	}
	

}


