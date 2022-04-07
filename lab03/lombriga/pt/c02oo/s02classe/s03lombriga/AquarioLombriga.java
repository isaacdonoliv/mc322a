package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	char aquarioLombriga[] = new char[15];
	int AA, LL, PP;
	int esq;
	
	AquarioLombriga(int AA, int LL, int PP) {
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
		// ficara a seu criterio como tratar outras
		// possibilidades de valores invalidos
			
	}

	void crescer() {
		int aux = 0;
		if (esq == 1) {
			aux = PP - 1 + LL;
			if (aux < AA)
				aquarioLombriga[aux] = '#';
		}
		else {
			aux = PP - 1 - LL;
			if (aux < AA)
				aquarioLombriga[PP - 1 - LL] = '#';
		}
	} // aumenta no lado contrario a cabeca, se no room, do nothing

	void mover() {}; // se esq, anda p esq, senao, o contrario

	void virar() {
		aquarioLombriga[PP - 1] = '#';
		if (esq == 1)
			PP = PP + LL - 1;
		else
			PP = PP - LL + 1;
		aquarioLombriga[PP - 1] = 'o';
	} // troca a cabeca de lado

	void apresenta() {}; // mostra lombriga no aquario
}