package telefon;

public class Poruka extends Usluga {
	private String tekstPoruke;
	private boolean poslata;
	private int cenaPoruke;

	public Poruka(BrojTelefona inicijator, BrojTelefona pozivani, String tekstPoruke) {
		super(inicijator, pozivani);
		this.tekstPoruke = tekstPoruke;
		if (inicijator.isFiksni() || pozivani.isFiksni()) {
			this.poslata = false;
			System.out.println("Fiksni");
			this.cenaPoruke = 0;
		} else if (inicijator.istaDrzava(pozivani)) {
			this.cenaPoruke = 3;
		} else {
			this.cenaPoruke = 20;
		}
	}

	public int getCenaPoruke() {
		return cenaPoruke;
	}

	public String toString() {
		String ispis = "";
		ispis += super.toString() + " \"" + tekstPoruke + "\"";
		return ispis;
	}
}
