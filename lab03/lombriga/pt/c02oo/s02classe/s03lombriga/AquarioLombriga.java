package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	char aquario_lombriga[] = new char[15];
	int AA, LL, PP;
	
	AquarioLombriga(int AA, int LL, int PP) { // professor atualizou alguma coisa, baixe o lombriga.zip novo
		this.AA = AA;
		if (LL > AA)
			this.LL = AA;
		else
			this.LL = LL;
		if (PP > AA)
			this.PP = 1;
		else
			this.PP = PP;
		
			
	}
}