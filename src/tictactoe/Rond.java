package tictactoe;

public class Rond extends Case {

	public Rond(Positions pos) {
		super(pos);
	}
	
	@Override
	public String toString() {
		return "| O ";
	}
}
