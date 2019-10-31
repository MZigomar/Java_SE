package tictactoe;

public enum Positions {

	NO(0, 0, '7'), N(1, 0, '8'), NE(2, 0, '9'), 
	O(0, 1, '4'), C(1, 1, '5'), E(2, 1, '6'), 
	SO(0, 2, '1'), S(1, 2, '2'), SE(2, 2, '3');

	private int x, y;
	private char p;

	Positions(int x, int y, char p) {
		this.setX(x);
		this.setY(y);
		this.setP(p);
	}

	private void setP(char p) {
		this.p = p;
	}

	public char getP() {
		return p;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static Positions get(char c) {
		for (Positions pos : values()) {
			if (pos.p == c) {
				return pos;
			}
		}
		return null;
	}
}
