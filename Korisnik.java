package telefon;

public class Korisnik {
	private BrojTelefona brTel;
	private Usluga[] usluga;
	private static int brUsluga;
	private static int ukupnaCena = 0;

	public Korisnik(BrojTelefona brTel) {
		this.brTel = brTel;
		usluga = new Usluga[10];
	}

	public int poziv(BrojTelefona br, int trajanje) {
		Poziv poziv = new Poziv(brTel, br, trajanje);
		if (brUsluga < usluga.length) {
			usluga[brUsluga++] = poziv;
		}
		int cenaPoziva = poziv.getCenaPoziva();
		ukupnaCena += cenaPoziva;
		return cenaPoziva;
	}

	public int poruka(BrojTelefona br, String tekst) {
		Poruka poruka = new Poruka(brTel, br, tekst);
		if (brUsluga < usluga.length) {
			usluga[brUsluga++] = poruka;
		}
		int cenaPoruka = poruka.getCenaPoruke();
		ukupnaCena += cenaPoruka;
		return cenaPoruka;
	}

	public int getUkupnaCena() {
		return ukupnaCena;
	}

	public String toString() {
		String ispis = "";
		ispis += brTel.toString() + "\n";
		for (int i = 0; i < brUsluga; i++) {
			ispis += usluga[i].toString() + "\n";
		}
		return ispis;
	}
}
