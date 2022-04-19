package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	
	Peca tabuleiro[][]= new Peca[7][7];
	char board[][] = new char[7][7];
	
	Tabuleiro(char board[][]) {
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				tabuleiro[i][j] = new Peca();
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++) { 
				// foi escolhido mudar diretamente o atributo pois
				// a inexistencia da posicao tem a ver com o 
				// formato do tabuleiro e nao com a peca
				tabuleiro[i][j].estado = 0;
				tabuleiro[i][6 - j].estado = 0;
				tabuleiro[6 - i][j].estado = 0;
				tabuleiro[6 - i][6 - j].estado = 0;
			}
		tabuleiro[3][3].sumir();
		
		this.board = board;
	}
	
	int verificar(int coluna, int linha) {
		if (tabuleiro[coluna][linha].existir() == 1) // se tem peca
			return 1;
		else if (tabuleiro[coluna][linha].existir() == 2) // se tem lugar vazio
			return 2;
		return 0; // se nao ha posicao
		
	}
	
	void mover(String source, String target) {
		String colunas = "abcdefg";
		
		int col1 =  colunas.indexOf(source.charAt(0));
		int lin1 =  Character.getNumericValue(source.charAt(1)) - 1;
		
		int col2 =  colunas.indexOf(target.charAt(0));
		int lin2 =  Character.getNumericValue(target.charAt(1)) - 1;
		
		int colM = (col2 - col1) != 0 ? (col1 + col2)/2 : col1;
		int linM = (lin2 - lin1) != 0 ? (lin1 + lin2)/2 : lin1;
		
		if (this.verificar(lin1, col1) == 1) {
			if (this.verificar(linM, colM) == 1)
				if (this.verificar(lin2, col2) == 2) {
					tabuleiro[lin1][col1].sumir();
					board[lin1][col1] = '-';
					tabuleiro[linM][colM].sumir();
					board[linM][colM] = '-';
					tabuleiro[lin2][col2].aparecer();
					board[lin2][col2] = 'P';
				}
					
		}
	}
	
}