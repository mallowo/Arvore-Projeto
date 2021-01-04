import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner; 

public class Principal
{

	public static void main(String[] args) throws Exception 
	{
		Scanner teclado = new Scanner (System.in);
	
		NoArvore abb = new NoArvore(); 
		
		File arq = new File("arvore.txt");	
		
		BufferedReader br = new BufferedReader(new FileReader(arq)); 
		PrintWriter writer = new PrintWriter(new FileWriter(arq, true));
			 
		writer.println("6\n8\n4\n5\n2\n3\n1\n9\n7");
		writer.close();
		/*
		 * writer.println("8"); writer.println("4"); writer.println("5");
		 * writer.println("2"); writer.println("3"); writer.println("1");
		 * writer.println("7"); writer.println("9");
		 */
		  
	    String st; 
	    
	    while ((st = br.readLine()) != null)
	    {
	    
		    int n = Integer.parseInt(st);
		    abb.insere(abb, n);
		
	    }
	    
	    br.close();
	    
		int opcao = 0;
	    
	    do 
	    {
	    
			 System.out.println("\n    ### MENU DE INTERAÇÃO ###");
		     System.out.println("\n ===========================");
		     System.out.println(" |    1 - Inserir Número    |");
		     System.out.println(" |    2 - Procurar Número   |");
		     System.out.println(" |    3 - Remover Número    |");
		     System.out.println(" |    4 - Mostrar Árvore    |");
		     System.out.println(" |    0 - Sair              |");
		     System.out.println(" ===========================\n");
		     
		     System.out.print("Opção -> ");
		     opcao = teclado.nextInt();
		
		     switch(opcao)
		     {
		         case 1:
		        	 
		        	 System.out.println("\nOpção 'INSERIR NÚMERO' escolhida!\n");
	        		 System.out.print("Digite um número pra inserir na árvore: ");
	        		 int num = teclado.nextInt();
	        		 
	        		 abb.insere(abb, num);
	        		 
	        		 System.out.println("\nNúmero inserido!");
	        		 	        		
	            	 writer.println(num);
	            	 writer.close();
	        		 
	        		 System.out.println("\nGostaria de visualizar a árvore? S/N");
	        		 char res = teclado.next().charAt(0); 
	        		 
	        		 if (res == 'S')
	        		 {
	        			 abb.imprime(abb);
	        		 }
	        		 
	        		 else if (res == 'N') 
	        		 {
	        			 continue;
	        		 }
		        	 
	        		 
		             break;
		         
		         case 2:
		        	 
		        	System.out.println("\nOpção 'PROCURAR NÚMERO' escolhida!\n");
		        	
	     			System.out.println("Digite o número que deseja procurar na árvore: ");
	     			int bus = teclado.nextInt();
		 
	     			NoArvore resultado = abb.busca(abb, bus);
		     		
		     		if(resultado == null)
		     			System.out.println("Não encontrei o no " + bus + "!");
		     		else
		     			System.out.println("Encontrei o nó: "+bus);
		     		
		     		System.out.println("\nGostaria de visualizar a árvore? S/N");
	        		 res = teclado.next().charAt(0); 
	        		 
	        		 if (res == 'S')
	        		 {
	        			 abb.imprime(abb);
	        		 }
	        		 
	        		 else if (res == 'N') 
	        		 {
	        			 continue;
	        		 }
	        		 
		     		break;
		     		
		         case 3:
		        	 
		        	System.out.println("\nOpção 'REMOVER NúMERO' escolhida!\n");
		        	System.out.println("Digite o número que deseja remover da árvore:");
		     		int rem = teclado.nextInt();
		     		
		     		resultado = abb.remove(abb, rem);
		     		
		     		if(resultado == null)
		     			System.out.println("Não encontrei o no " + rem + "!");
		     		else
		     			System.out.println("Encontrei o nó: "+rem);
		     		
		     		System.out.println("\nNó " +rem+ " removido!");
		     		System.out.println("\nGostaria de visualizar a árvore? S/N");
	        		 res = teclado.next().charAt(0); 
	        		 
	        		 if (res == 'S')
	        		 {
	        			 abb.imprime(abb);
	        		 }
	        		 
	        		 else if (res == 'N') 
	        		 {
	        			 continue;
	        		 }
		     			 		 		             
		     		break;
		     	
		         case 4:
		        	 
		        	 System.out.println("\nOpção 'MOSTRAR ÁRVORE' escolhida!\n");
		        	 
		        	 abb.imprime(abb);
		     		
		         case 0:
		        	 break;
		        	 
		         default:
		             System.out.println("Opção Inválida!");
		             break;
		     }
		     
	    }while (opcao != 0);
	    
		teclado.close();
	}
}


