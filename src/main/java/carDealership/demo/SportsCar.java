package carDealership.demo;

public class SportsCar implements Car {

	public String ownerName;
	public Tyre tyre;
	
	public SportsCar(Tyre tyre) {
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
		return "This is a Sports car " + tyre.getTyreInfo();
	}

}
