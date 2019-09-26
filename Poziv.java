package telefon;

public class Poziv extends Usluga {
	private int trajanjeUSekundama;
	private int cenaPoziva;

	public Poziv(BrojTelefona inicijator, BrojTelefona pozivani, int trajanjeUSekundama) {
		super(inicijator, pozivani);
		this.trajanjeUSekundama = trajanjeUSekundama;
		if (this.trajanjeUSekundama != 0) {
			if (inicijator.istaDrzava(pozivani)) {
				this.cenaPoziva = this.getCena() + ((this.trajanjeUSekundama / 60 + 1) * 10);
			} else {
				this.cenaPoziva = this.getCena() + ((this.trajanjeUSekundama / 60 + 1) * 50);
			}
		} else {
			this.cenaPoziva = 0;
		}
	}

	public int getCenaPoziva() {
		return cenaPoziva;
	}

	public String toString() {
		String ispis = "";
		ispis += super.toString() + " (" + trajanjeUSekundama / 60 + ":" + trajanjeUSekundama % 60 + ")";
		return ispis;
	}
}
