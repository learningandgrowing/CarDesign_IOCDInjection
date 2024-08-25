package carDealership.demo;

public class Truck implements Car {

	public String ownerName;
	Tyre tyre;
	
	public Truck(Tyre tyre) {
		this.tyre = tyre;
	}
	@Override
	public void setOwnerName(String name) {
		// TODO Auto-generated method stub
		this.ownerName = name;

	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return this.ownerName;
	}

	@Override
	public String carInfo() {
		// TODO Auto-generated method stub
		return "It is a Truck" + tyre.getTyreInfo();
	}

}
