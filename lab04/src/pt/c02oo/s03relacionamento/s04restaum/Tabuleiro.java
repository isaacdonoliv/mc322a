package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	
	Peca tabuleiro[][]= new Peca[7][7];
	
	Tabuleiro() {
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				tabuleiro[i][j] = new Peca();
	}
	
	void mover(String movimento) {
		
	}
	
	int verificar(int coluna, int linha) {
		if (tabuleiro[coluna][linha].existir() == 1)
			return 1;
		return 0;
			
	}
}