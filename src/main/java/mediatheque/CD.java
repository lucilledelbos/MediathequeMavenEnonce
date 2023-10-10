package mediatheque;

public class CD extends Item {
	private int numberOfTracks;

	public CD(int numberOfTracks, String title) {
		super(title);
		this.numberOfTracks = numberOfTracks;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	public void print() {
		System.out.println(this);
	}
	public void accept(ItemVisitor iv){
		iv.visitCD(this);
	}

	@Override
	public String toString() {
		return "CD {" + super.toString() + ", nombre de pistes : " + numberOfTracks + '}';
	}
	
}
