
import java.util.ArrayList;

public class CarPark {
	private ArrayList<CarParkSpace> myCarPark;

	public CarPark() {
		myCarPark = new ArrayList<>();
	}

	public int getNumberOfVIPSpacesFree() {
		int numVIPSpaces = 0;
		for (CarParkSpace carParkSpace : myCarPark) {
			if (carParkSpace.isPriorityParking() && !carParkSpace.isOccupied()) {

					numVIPSpaces++;
				
			}
		}
		return numVIPSpaces;
	}

	public int getNumberOfNormalSpacesFree() {
		int numNormalSpaces = 0;
		for (CarParkSpace carParkSpace : myCarPark) {
			if (!carParkSpace.isPriorityParking() && !carParkSpace.isOccupied()) {
					numNormalSpaces++;
				}

		}
		return numNormalSpaces;
	}

	public void addParkingSpace(CarParkSpace carParkSpace) {
		myCarPark.add(carParkSpace);
	}

	public String bookVIPSpace(String registration) {
		String result = "NOT AVAILABLE";
		for (CarParkSpace carParkSpace : myCarPark) {
			if (carParkSpace.isPriorityParking() && !carParkSpace.isOccupied()) {
					carParkSpace.setRegistration(registration);
					carParkSpace.setOccupied(true);
					result = "OK";
					break;
				
			}
		}
		return result;
	}

	public String bookNormalSpace(String registration) {
		String result = "NOT AVAILABLE";
		for (CarParkSpace carParkSpace : myCarPark) {
			if (!carParkSpace.isPriorityParking() && !carParkSpace.isOccupied()) {
					carParkSpace.setRegistration(registration);
					carParkSpace.setOccupied(true);
					result = "OK";
					break;
				}
			}
		return result;
	}

	public void vacateParkingSpace(String registration) {
		for (CarParkSpace carParkSpace : myCarPark) {
			if (registration.equals(carParkSpace.getRegistration())) {
				carParkSpace.setOccupied(false);
				break;
			}
		}
	}

	public int findMyVehicle(String registration) {
		int spaceId = 0;
		for (CarParkSpace carParkSpace : myCarPark) {
			if (registration.equals(carParkSpace.getRegistration())) {
				spaceId = carParkSpace.getCarParkSpaceIdentifier();
				break;
			}
		}
		return spaceId;
	}

}
