package novara_xpug.MineSweeperKataFixture;


import org.junit.Assert;
import org.junit.Test;

public class MineSweeperKataFixture {

	@Test
	public void prova(){
		String[][] configurazione={ {"*","","",""},
									{"","","",""},
									{"","*","",""},
									{"","","",""}
			};
		
		Campo campo = new Campo(configurazione);
		
		String[][] soluzione = campo.getSoluzione();
		Assert.assertEquals(Cella.SIMBOLO_BOMBA, soluzione[0][0]);
		Assert.assertEquals("1", soluzione[0][1]);
		Assert.assertEquals("0", soluzione[0][2]);
		Assert.assertEquals("0", soluzione[0][3]);
		
		Assert.assertEquals("2", soluzione[1][0]);
		Assert.assertEquals("2", soluzione[1][1]);
		Assert.assertEquals("1", soluzione[1][2]);
		Assert.assertEquals("0", soluzione[1][3]);

		Assert.assertEquals("1", soluzione[2][0]);
		Assert.assertEquals(Cella.SIMBOLO_BOMBA, soluzione[2][1]);
		Assert.assertEquals("1", soluzione[2][2]);
		Assert.assertEquals("0", soluzione[2][3]);
		
		Assert.assertEquals("1", soluzione[3][0]);
		Assert.assertEquals("1", soluzione[3][1]);
		Assert.assertEquals("1", soluzione[3][2]);
		Assert.assertEquals("0", soluzione[3][3]);
		
	}
	
}
