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
		 * O Consumer é uma nova Interface do Java8 do pacote
		 * java.util.function.Consumer
		 * 
		 * A Interface consumer tem um único métedo void
		 * chamado accept , ele recebe um Objeto do tipo T,
		 * ou seja , pode ser qualquer Objeto, e é resposável
		 * por consumi-lo , ou seja , executar uma ação
		 * com esse Objeto.
		 * 
		 * */
				
		
		/*
		 * Usando uma classe anônima
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
	 * A interface List também recebe um método default forEach
	 * .Um método concreto , assim podemos criar um Consumer
	 * como parâmetro dentro do forEach e deixar ainda mais
	 * enxuto nosso código
	 * 
	 * */
	
     
	  usuarios.forEach(new Consumer<Usuario>() {
		  
		  
		  public void accept(Usuario u ) {
			  
			  System.out.println(u.getNome());
		  }
		  
	  });
	
	
	
	/*
	 * 
	 * Uma Lambda é uma maneira simples de implementar uma interface que só
	 * tem um método.
	 * 
	 * 
	 * O compilador infere  que você está usando um Consumer<Usuario> e
	 * joda o método da Lambda para o único método da Interface Consumer
	 * .Não precisamos nem referenciar o método accept.
	 * 
	 * */
	
	usuarios.forEach(u-> System.out.println(u.getNome()));
      
	
	 /*Também podemos tornar todos os usuários Moderadores*/

	usuarios.forEach(u -> u.setModerador());

	
	
	
	
	
	}
}
