
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VendingMachineTest {
	private VendingMachine myVendingMachine;

	@BeforeEach
	public void setUp() {
		myVendingMachine = new VendingMachine();
	}

	@Test
	// User Story 1, Test 1-1

	public void testNoBarsInMachine() {
		assertEquals(0, myVendingMachine.checkNumProteinBars());

	}

	@Test
	// User Story 2, Test 2-1
	public void testAddOneBarToMachine() {
		ProteinBar Pbar1 = new ProteinBar("Mango", 2.5, 2, 1);
		myVendingMachine.addProteinBar(Pbar1);
		assertEquals(1, myVendingMachine.checkNumProteinBars());
	}

	@Test
	// User Story 2, Test 2-2
	public void testAddTwoBarToMachine() {
		ProteinBar Pbar1 = new ProteinBar("Mango", 2.5, 2, 1);
		ProteinBar Pbar2 = new ProteinBar("Orange", 3.2, 1, 1);
		myVendingMachine.addProteinBar(Pbar1);
		myVendingMachine.addProteinBar(Pbar2);
		assertEquals(2, myVendingMachine.checkNumProteinBars());

	}

	@Test
	// User Story 3, Test 3-1
	public void testRemoveBarFromMachine() {
		ProteinBar Pbar1 = new ProteinBar("Mango", 2.5, 2, 1);
		ProteinBar Pbar2 = new ProteinBar("Orange", 3.2, 1, 1);
		myVendingMachine.addProteinBar(Pbar1);
		myVendingMachine.addProteinBar(Pbar2);
		myVendingMachine.removeProteinBar(Pbar1);

	}

	@Test
	// User Story 4, Test 4-1
	public void testBarNotAvailable() {
		ProteinBar Pbar1 = new ProteinBar("Mint", 2.5, 2, 1);
		ProteinBar Pbar2 = new ProteinBar("Caramel", 3.2, 1, 1);
		myVendingMachine.addProteinBar(Pbar1);
		myVendingMachine.addProteinBar(Pbar2);
		myVendingMachine.addMoney(4.0);
		assertEquals("FLAVOUR NOT AVAILABLE", myVendingMachine.dispenseBar("Mango"));
		assertEquals(2, myVendingMachine.checkNumProteinBars());
		assertEquals(4.0, myVendingMachine.getMoneyInserted());

	}

	@Test
	// User Story 4, Test 4-2
	public void testMoneyNotInserted() {
		ProteinBar Pbar1 = new ProteinBar("Mint", 2.5, 2, 1);
		ProteinBar Pbar2 = new ProteinBar("Caramel", 3.2, 1, 1);
		myVendingMachine.addProteinBar(Pbar1);
		myVendingMachine.addProteinBar(Pbar2);
		assertEquals("INSERT MONEY", myVendingMachine.dispenseBar("Mint"));
		assertEquals(2, myVendingMachine.checkNumProteinBars());
		assertEquals(0, myVendingMachine.getMoneyInserted());

	}

	@Test
	// User Story 4, Test 4-3
	public void testMachineFaulty() {
		ProteinBar Pbar1 = new ProteinBar("Mint", 2.5, 2, 1);
		ProteinBar Pbar2 = new ProteinBar("Caramel", 3.2, 1, 1);
		myVendingMachine.addProteinBar(Pbar1);
		myVendingMachine.addProteinBar(Pbar2);
		myVendingMachine.addMoney(4.0);
		myVendingMachine.setMachineFaultStatus(true);
		assertEquals("MACHINE FAULTY", myVendingMachine.dispenseBar("Mint"));
		assertEquals(2, myVendingMachine.checkNumProteinBars());
		assertEquals(4.0, myVendingMachine.getMoneyInserted());

	}

	@Test
	// User Story 4, Test 4-4
	public void testDispenseBarOK() {
		ProteinBar Pbar1 = new ProteinBar("Mint", 2.5, 2, 1);
		ProteinBar Pbar2 = new ProteinBar("Caramel", 3.2, 1, 1);
		myVendingMachine.addProteinBar(Pbar1);
		myVendingMachine.addProteinBar(Pbar2);
		myVendingMachine.addMoney(4.0);
		assertEquals("TAKE YOUR BAR", myVendingMachine.dispenseBar("Mint"));

	}

	@Test
	// User Story 6, Test 6-1

	public void testGetTotalSugarConten() {
		ProteinBar Pbar1 = new ProteinBar("Mint", 2.5, 4, 21);
		ProteinBar Pbar2 = new ProteinBar("Caramel", 3.2, 3, 18);
		ProteinBar Pbar3 = new ProteinBar("Mango", 3.2, 3, 15);
		myVendingMachine.addProteinBar(Pbar1);
		myVendingMachine.addProteinBar(Pbar2);
		myVendingMachine.addProteinBar(Pbar3);
		assertEquals(10, myVendingMachine.getTotalSugarAllBarsInMachine());

	}

}
