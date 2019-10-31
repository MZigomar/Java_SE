package tictactoe;

public class Plateau {

	private int nbColonne, nbLigne;
	private Case[][] caseTab = { {} };
	private boolean j1 = true;

	public Plateau(int c, int l) {
		this.nbColonne = c;
		this.nbLigne = l;
		caseTab = new Case[c][l];
		for (int i = 0; i < c; i++)
			for (int j = 0; j < l; j++)
				caseTab[i][j] = new Libre();
	}

	@Override
	public String toString() {
		String res = new String();
		for (int i = 0; i < nbLigne; i++) {
			for (int j = 0; j < nbColonne; j++)
				res += "+---";
			res += "+\n";
			for (int j = 0; j < nbColonne; j++)
				res += caseTab[j][i];
			res += "|\n";
		}
		for (int i = 0; i < nbColonne; i++)
			res += "+---";
		return res + "+";
	}

	public void jouerCroix(Positions pos) {
		int x = pos.getX(), y = pos.getY();
		if (setCaseTab(new Croix(pos), x, y))
			setJ1(false);
	}

	public void jouerRond(Positions pos) {
		int x = pos.getX(), y = pos.getY();
		if (setCaseTab(new Rond(pos), x, y))
			setJ1(true);
	}

	public Case getCase(char c) {
		return caseTab[Positions.get(c).getX()][Positions.get(c).getY()];
	}

	public Case[][] getCaseTab() {
		return caseTab;
	}

	public boolean isJ1Turn() {
		return j1;
	}

	public void setJ1(boolean j1) {
		this.j1 = j1;
	}

	public void setCaseTab(Case[][] caseTab) {
		this.caseTab = caseTab;
	}

	public boolean setCaseTab(Case c, int x, int y) {
		if (!(caseTab[x][y] instanceof Libre))
			return false;
		caseTab[x][y] = c;
		return true;
	}

	public boolean fini() {
		if (this.victoire())
			return true;
		for (Case[] cases : caseTab)
			for (Case case1 : cases)
				if (case1 instanceof Libre)
					return false;
		return true;
	}

	public boolean victoire() {
		
		if(!(getCase('1') instanceof Libre) && getCase('1').getClass().equals(getCase('2').getClass()) && getCase('1').getClass().equals(getCase('3').getClass()) ||
				!(getCase('4') instanceof Libre) && getCase('4').getClass().equals(getCase('5').getClass()) && getCase('4').getClass().equals(getCase('6').getClass()) ||
				!(getCase('7') instanceof Libre) && getCase('7').getClass().equals(getCase('8').getClass()) && getCase('7').getClass().equals(getCase('9').getClass()) ||
				!(getCase('1') instanceof Libre) && getCase('1').getClass().equals(getCase('4').getClass()) && getCase('1').getClass().equals(getCase('7').getClass()) ||
				!(getCase('2') instanceof Libre) && getCase('2').getClass().equals(getCase('5').getClass()) && getCase('2').getClass().equals(getCase('8').getClass()) ||
				!(getCase('3') instanceof Libre) && getCase('3').getClass().equals(getCase('6').getClass()) && getCase('3').getClass().equals(getCase('9').getClass()) ||
				!(getCase('1') instanceof Libre) && getCase('1').getClass().equals(getCase('5').getClass()) && getCase('1').getClass().equals(getCase('9').getClass()) ||
				!(getCase('3') instanceof Libre) && getCase('3').getClass().equals(getCase('5').getClass()) && getCase('3').getClass().equals(getCase('7').getClass()))
			return true;
		
		return false;
	}

}
