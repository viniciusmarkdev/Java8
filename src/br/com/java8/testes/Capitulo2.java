package br.com.java8.testes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.java8.Usuario;

public class Capitulo2 {

	
	public static void main(String[] args) {
		
		/*
		 * Maneira classica de percorrer uma ArrayList
		 * de Usuarios e imprimir seu usuario 
	  	 * */
		
		Usuario user1 = new Usuario("Marcos Vinicius" , 20);
		Usuario user2 = new Usuario("Francielle Vieira" , 10);
		Usuario user3 = new Usuario("Lionel messi" , 400);
		
		List <Usuario> usuarios = Arrays.asList(user1 , user2 , user3);
		
		for(Usuario u : usuarios) {
			System.out.println(u.getNome());
			
		}
	 
		
		/*
		 * 
		 * O Consumer � uma nova Interface do Java8 do pacote
		 * java.util.function.Consumer
		 * 
		 * A Interface consumer tem um �nico m�tedo void
		 * chamado accept , ele recebe um Objeto do tipo T,
		 * ou seja , pode ser qualquer Objeto, e � respos�vel
		 * por consumi-lo , ou seja , executar uma a��o
		 * com esse Objeto.
		 * 
		 * */
				
		
		/*
		 * Usando uma classe an�nima
		 * */
	   Consumer<Usuario> mostrador = new Consumer<Usuario>(){
		   
		   
		   public void accept(Usuario u) {
			   
			  System.out.println(u.getNome());
			   
		   }
	   
			
	
	};
	
	usuarios.forEach(mostrador);
	
	
	
	/*
	 * 
	 * 
	 * A interface List tamb�m recebe um m�todo default forEach
	 * .Um m�todo concreto , assim podemos criar um Consumer
	 * como par�metro dentro do forEach e deixar ainda mais
	 * enxuto nosso c�digo
	 * 
	 * */
	
     
	  usuarios.forEach(new Consumer<Usuario>() {
		  
		  
		  public void accept(Usuario u ) {
			  
			  System.out.println(u.getNome());
		  }
		  
	  });
	
	
	
	/*
	 * 
	 * Uma Lambda � uma maneira simples de implementar uma interface que s�
	 * tem um m�todo.
	 * 
	 * 
	 * O compilador infere  que voc� est� usando um Consumer<Usuario> e
	 * joda o m�todo da Lambda para o �nico m�todo da Interface Consumer
	 * .N�o precisamos nem referenciar o m�todo accept.
	 * 
	 * */
	
	usuarios.forEach(u-> System.out.println(u.getNome()));
      
	
	 /*Tamb�m podemos tornar todos os usu�rios Moderadores*/

	usuarios.forEach(u -> u.setModerador());

	
	
	
	
	
	}
}
