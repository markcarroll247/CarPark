
import java.util.ArrayList;

public class VendingMachine {
	private ArrayList<ProteinBar> myVendiingMachine;
	private boolean machineFaultStatus = false;
	private double moneyInserted = 0;

	VendingMachine() {
		myVendiingMachine = new ArrayList<ProteinBar>();
	}

	public int checkNumProteinBars() {
		return myVendiingMachine.size();
	}

	public void addProteinBar(ProteinBar proteinbar) {
		myVendiingMachine.add(proteinbar);
	}

	public void removeProteinBar(ProteinBar proteinbar) {
		myVendiingMachine.remove(proteinbar);
	}

	public void addMoney(double amount) {
		moneyInserted = amount;
	}

	public String dispenseBar(String flavour) {
		for (ProteinBar proteinBar : myVendiingMachine) {
			if (!proteinBar.getFlavour().equalsIgnoreCase(flavour)) {
			} else if (proteinBar.getPriceInEuro() > moneyInserted) {
				return "INSERT MONEY";
			} else if (machineFaultStatus == true) {
				return "MACHINE FAULTY";
			} else {
				return "TAKE YOUR BAR";
			}
		}
		return "FLAVOUR NOT AVAILABLE";
	}

	public double getMoneyInserted() {
		return moneyInserted;
	}

	public void setMachineFaultStatus(boolean status) {
		machineFaultStatus = status;
	}

	public int getTotalSugarAllBarsInMachine() {
		int totalSugar = 0;
		for (ProteinBar proteinBar : myVendiingMachine) {
			int sugar = proteinBar.getGramsOfSugar();
			totalSugar = totalSugar + sugar;
		}
		return totalSugar;
	}

	
}
