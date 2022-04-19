package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {
	int estado;
	// se estado = 0, nao ha posicao
	// se = 1, tem peca,
	// se = 2, peca capturada
	
	Peca() {
		estado = 1;
	}
	
	int existir() {
		return estado;
	}
	
	void sumir() {
		estado = 2;
	}
	
	void aparecer() {
		estado = 1;
	}
	
}