package br.com.java8;

public class Usuario {
	
	
	private String nome;
	private int pontos;
	
	
	
	private boolean moderador;
	
	
	
	
	
	public Usuario(String nome, int pontos) {
		super();
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public boolean isModerador() {
		return moderador;
	}
	public void setModerador() {
		this.moderador = true;
	}
	
	
	

}
