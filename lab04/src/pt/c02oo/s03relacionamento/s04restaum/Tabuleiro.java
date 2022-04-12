package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	
	Peca tabuleiro[][]= new Peca[7][7];
	
	Tabuleiro() {
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				tabuleiro[i][j] = new Peca();
	}
	
	int verificar(int coluna, int linha) {
		if (tabuleiro[coluna][linha].existir() == 1)
			return 1;
		return 0;
		
	}
	
	void mover(String movimento) { // f4:d4
		int col1 =  movimento.charAt(0) - 26 - 1; // confirmar esse numero
		int lin1 =  Character.getNumericValue(movimento.charAt(1)) - 1;
		int colM = ;
		int linM = ;
		int col2 =  movimento.charAt(3) - 26 - 1; // confirmar esse numero
		int lin2 =  Character.getNumericValue(movimento.charAt(4)) - 1;
		
		if (this.verificar(col1, lin1) == 1) {
			if (this.verificar(colM, linM) == 1)
				if (this.verificar(col2, lin2) == 0);
					tabuleiro[colM][linM]
		}
	}
	
}