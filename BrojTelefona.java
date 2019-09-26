package telefon;

public class BrojTelefona {
	private String kodDrzave;
	private String pozivni;
	private String broj;
	private boolean fiksni;

	public BrojTelefona(String kodDrzave, String pozivni, String broj, boolean fiksni) {
		this.kodDrzave = kodDrzave;
		this.pozivni = pozivni;
		this.broj = broj;
		this.fiksni = fiksni;
	}

	public boolean istaDrzava(BrojTelefona br) {
		if (this.kodDrzave.equals(br.kodDrzave)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFiksni() {
		return fiksni;
	}

	public String toString() {
		String ispis = "";
		ispis += "+" + kodDrzave + " " + pozivni + " " + broj;
		return ispis;
	}
}
