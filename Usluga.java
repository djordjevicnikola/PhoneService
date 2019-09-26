package telefon;

public class Usluga {
	private BrojTelefona inicijator;
	private BrojTelefona pozivani;
	private int cena;

	public Usluga(BrojTelefona inicijator, BrojTelefona pozivani) {
		this.inicijator = inicijator;
		this.pozivani = pozivani;
		if (inicijator.istaDrzava(pozivani)) {
			this.cena = 0;
		} else {
			this.cena = 30;
		}
	}

	public void setInicijator(BrojTelefona inicijator) {
		this.inicijator = inicijator;
	}

	public int getCena() {
		return cena;
	}

	public String toString() {
		String ispis = "";
		ispis += inicijator.toString() + " -> " + pozivani.toString();
		return ispis;
	}
}
