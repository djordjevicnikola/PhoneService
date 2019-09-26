package telefon;

import telefon.BrojTelefona;
import telefon.Korisnik;
import telefon.Poruka;
import telefon.Poziv;

public class Main2 {

	public static void main(String[] args) {
		BrojTelefona b1 = new BrojTelefona("381", "64", "0000000", false);
		BrojTelefona b2 = new BrojTelefona("381", "11", "0000000", true);
		BrojTelefona b3 = new BrojTelefona("454", "59", "0000000", false);
		Poziv poziv = new Poziv(b1, b3, 253);
		Poruka poruka = new Poruka(b1, b3, "Dobar dan");
		System.out.println(poziv);
		System.out.println(poruka);
		System.out.println();
		Korisnik k = new Korisnik(b1);
		k.poruka(b3, "Zdravo");
		k.poruka(b3, "Cao");
		k.poziv(b2, 74);
		System.out.println(k);
		System.out.println("Ukupna cena: " + k.getUkupnaCena());
	}
}
