package sec02.exam03;

public class KumhoTire extends Tire{
	public KumhoTire ( ) {
		
	}

	public void KumhoTire(String location, int maxRotation) {
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
