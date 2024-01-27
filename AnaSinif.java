package karma;

public class AnaSinif {

	public AnaSinif() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main (String [] args) {
		
		Karma k1 = new Karma(4);
		
		Dugum e1 = new Dugum(12);
		Dugum e2 = new Dugum(13);
		Dugum e3 = new Dugum(14);
		Dugum e4 = new Dugum(15);
		Dugum e5 = new Dugum(16);
		Dugum e6 = new Dugum(17);
		
		k1.elemanEkle(e1);
		k1.elemanEkle(e2);
		k1.elemanEkle(e3);
		k1.elemanEkle(e4);
		k1.elemanEkle(e5);
		k1.elemanEkle(e6);
		
		k1.tableYazir();
		
		
	}

}
