
import org.junit.Test;

public class JabutiTDD {

	@Test
	public void frases() {
		Jabuti jabuti = new Jabuti();

		Control control = new Control();

		jabuti.setFrase("O rato roeu a roupa do rei de roma");
		
		jabuti.setColunas(20);
		
		control.setJabuti(jabuti);
		

		control.frase();
	}

}
