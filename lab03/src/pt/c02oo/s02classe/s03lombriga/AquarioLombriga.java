package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	char aquarioLombriga[] = new char[15];
	int AA, LL, PP;
	int esq;
	
	AquarioLombriga(int AA, int LL, int PP) {
		for (int i = 0; i < 15; i++)
			aquarioLombriga[i] = '#';
		esq = 1;
		this.AA = AA;
		if (LL > AA)
			this.LL = AA;
		else
			this.LL = LL;
		if (PP > AA)
			this.PP = 1;
		else
			this.PP = PP;
		int aux = PP - 1;
		if (esq == 1)
			for (int j = aux; j < LL; j++)
				aquarioLombriga[j] = '@';
		else
			for (int j = aux; j > aux - LL; j--)
				aquarioLombriga[j] = '@';
		aquarioLombriga[PP - 1] = 'o';
		// ficara a seu criterio como tratar outras
		// possibilidades de valores invalidos
			
	}

	void crescer() {
		int aux = 0;
		if (esq == 1) {
			aux = PP - 1 + LL;
			if (aux < AA)
				aquarioLombriga[aux] = '@';
		}
		else {
			aux = PP - 1 - LL;
			if (aux < AA)
				aquarioLombriga[aux] = '@';
		}
	} // aumenta no lado contrario a cabeca, se no room, do nothing

	void mover() {
		int aux = 0;
		if (esq == 1) {
			aux = PP - 2;
			if (aux > -1) {
				aquarioLombriga[aux + LL] = '#';
				aquarioLombriga[aux + 1] = '@';
				aquarioLombriga[aux] = 'o';
			}
		}
		else {
			aux = PP;
			if (aux < AA) {
				aquarioLombriga[aux - LL] = '#';
				aquarioLombriga[aux - 1] = '@';
				aquarioLombriga[aux] = 'o';
			}
		}
	}
	 // se esq, anda p esq, senao, o contrario, se nao tem mais espaco, virar lombriga

	void virar() {
		aquarioLombriga[PP - 1] = '#';
		if (esq == 1)
			PP = PP + LL - 1;
		else
			PP = PP - LL + 1;
		aquarioLombriga[PP - 1] = 'o';
	} // troca a cabeca de lado

	String apresenta() {
		return String.valueOf(aquarioLombriga);
	} // mostra lombriga no aquario
}