package novara_xpug.MineSweeperKataFixture;

import java.util.List;

public class Cella {
	public static final String SIMBOLO_BOMBA = "*";
	private boolean bomba=false;
	private Campo campo;
	private List<Cella> vicini;
	private int x;
	private int y;
	
	public Cella(String string, int x, int y, Campo campo) {
		this.setBomba(string.equals(SIMBOLO_BOMBA));
		this.x = x;
		this.y = y;
		this.campo = campo;
	}

	public void setBomba(boolean bomba) {
		this.bomba = bomba;
	}

	public boolean isBomba() {
		return bomba;
	}

	public String getSoluzione() {
		int bombe = 0;
		if (isBomba()) {
			return SIMBOLO_BOMBA;
		}
		vicini = campo.getVicini(this);
		for (Cella vicino : vicini) {
			if (vicino.isBomba()) {
				bombe++;
			}
		}
		return Integer.toString(bombe);
	}

	public int getY() {
		return this.y;
	}

	public int getX() {
		return this.x;
	}

}
