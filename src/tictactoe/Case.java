package tictactoe;

public abstract class Case {

	private String nom;

	public Case() {
	}

	public Case(Positions pos) {
		setNom(pos.getX(), pos.getY());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(int x, int y) {
		this.nom = "(" + x + ";" + y + ")";
	}

	@Override
	public String toString() {
		return "|   ";
	}
}
