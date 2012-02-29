package novara_xpug.MineSweeperKataFixture;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private Cella[][] celle;

	public Campo(String[][] configurazione) {
		celle= new Cella[configurazione.length][configurazione[0].length];		
		for (int i=0;i<configurazione.length;i++){
			for (int j=0;j<configurazione[i].length;j++){
				celle[i][j]=new Cella(configurazione[i][j],i, j, this);
			}
		}
	}

	public String[][] getSoluzione() {
		String[][] soluzione = new String[celle.length][celle[0].length];
		for (int i=0;i<celle.length;i++){
			for (int j=0;j<celle[i].length;j++){
				soluzione[i][j] = celle[i][j].getSoluzione();
			}
		}
		return soluzione;
	}

	public List<Cella> getVicini(Cella cella) {
		int x = cella.getX();
		int y = cella.getY();
		int startX = getStartX(cella.getX());
		int endX = getEndX(cella.getX());
		int startY = getStartX(cella.getY());
		int endY = getEndX(cella.getY());
		
		List<Cella> vicini = new ArrayList<Cella>();
		for (int i=startX; i<=endX; i++) {
			for (int j=startY; j<=endY; j++) {
				vicini.add(celle[x+i][y+j]);
			}
		}
		return vicini;
	}

	private int getEndX(int x) {
		return x == celle.length-1 ? 0 : 1;
	}

	private int getStartX(int x) {
		return x == 0 ? 0 : -1;
	}

}
