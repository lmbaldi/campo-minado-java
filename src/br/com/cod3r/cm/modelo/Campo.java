package br.com.cod3r.cm.modelo;

import java.util.List;
import java.util.ArrayList;

public class Campo {
	
	private boolean minado;
	private boolean aberto;
	private boolean marcado;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	private final int coluna;
	private final int linha;
	
	public Campo(int coluna, int linha) {
		this.coluna = coluna;
		this.linha = linha;
	}
	
	

}
