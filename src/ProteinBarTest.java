
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProteinBarTest {
	private ProteinBar myProteinBar;
	

	@BeforeEach
	public void setUp() {
		myProteinBar=new ProteinBar("venila",4.0,1,2) ;
		
		}
	@Test
	public void testProteinBarConstructor(){
		assertEquals("venila", myProteinBar.getFlavour());
		assertEquals(4.0, myProteinBar.getPriceInEuro());
		assertEquals(1, myProteinBar.getGramsOfSugar());
		assertEquals(2, myProteinBar.getGramsOfProtein());
		
	}
}
		
	

