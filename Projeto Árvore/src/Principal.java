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
	    
			 System.out.println("\n    ### MENU DE INTERA��O ###");
		     System.out.println("\n ===========================");
		     System.out.println(" |    1 - Inserir N�mero    |");
		     System.out.println(" |    2 - Procurar N�mero   |");
		     System.out.println(" |    3 - Remover N�mero    |");
		     System.out.println(" |    4 - Mostrar �rvore    |");
		     System.out.println(" |    0 - Sair              |");
		     System.out.println(" ===========================\n");
		     
		     System.out.print("Op��o -> ");
		     opcao = teclado.nextInt();
		
		     switch(opcao)
		     {
		         case 1:
		        	 
		        	 System.out.println("\nOp��o 'INSERIR N�MERO' escolhida!\n");
	        		 System.out.print("Digite um n�mero pra inserir na �rvore: ");
	        		 int num = teclado.nextInt();
	        		 
	        		 abb.insere(abb, num);
	        		 
	        		 System.out.println("\nN�mero inserido!");
	        		 	        		
	            	 writer.println(num);
	            	 writer.close();
	        		 
	        		 System.out.println("\nGostaria de visualizar a �rvore? S/N");
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
		        	 
		        	System.out.println("\nOp��o 'PROCURAR N�MERO' escolhida!\n");
		        	
	     			System.out.println("Digite o n�mero que deseja procurar na �rvore: ");
	     			int bus = teclado.nextInt();
		 
	     			NoArvore resultado = abb.busca(abb, bus);
		     		
		     		if(resultado == null)
		     			System.out.println("N�o encontrei o no " + bus + "!");
		     		else
		     			System.out.println("Encontrei o n�: "+bus);
		     		
		     		System.out.println("\nGostaria de visualizar a �rvore? S/N");
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
		        	 
		        	System.out.println("\nOp��o 'REMOVER N�MERO' escolhida!\n");
		        	System.out.println("Digite o n�mero que deseja remover da �rvore:");
		     		int rem = teclado.nextInt();
		     		
		     		resultado = abb.remove(abb, rem);
		     		
		     		if(resultado == null)
		     			System.out.println("N�o encontrei o no " + rem + "!");
		     		else
		     			System.out.println("Encontrei o n�: "+rem);
		     		
		     		System.out.println("\nN� " +rem+ " removido!");
		     		System.out.println("\nGostaria de visualizar a �rvore? S/N");
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
		        	 
		        	 System.out.println("\nOp��o 'MOSTRAR �RVORE' escolhida!\n");
		        	 
		        	 abb.imprime(abb);
		     		
		         case 0:
		        	 break;
		        	 
		         default:
		             System.out.println("Op��o Inv�lida!");
		             break;
		     }
		     
	    }while (opcao != 0);
	    
		teclado.close();
	}
}


