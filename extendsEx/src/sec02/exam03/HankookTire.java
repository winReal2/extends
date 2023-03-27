package sec02.exam03;

public class HankookTire extends Tire {
	
	public HankookTire() {
		
	}
	public void HankookTire(String location, int maxRotation) {
		super.location = location;
		super.maxRotation = maxRotation;
		super.rotation = rotation;
	}
	public boolean roll() {
		rotation++;
		if(rotation < maxRotation) {
			return false;
		}
		return false;
	}
}
