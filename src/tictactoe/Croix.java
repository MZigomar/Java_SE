package tictactoe;

public class Croix extends Case {

	public Croix(Positions pos) {
		super(pos);
	}
	
	@Override
	public String toString() {
		return "| X ";
	}
}
