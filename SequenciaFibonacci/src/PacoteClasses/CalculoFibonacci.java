package PacoteClasses;

import java.awt.List;
import java.util.ArrayList;

public class CalculoFibonacci {
	// Atributos
	
	ArrayList<Integer> sequenciaCompleta = new ArrayList<Integer>();
	

	// Métodos
	public void completaLista(int termo)
	{
		if(termo == 0)
			sequenciaCompleta.add(funcaoFibonacci(termo));
		else
		{
			for(int i = 0; i < termo; i++)
			{
				sequenciaCompleta.add(funcaoFibonacci(i));
			}
		}
	}
	public int funcaoFibonacci(int termos)
	{
		
		if(termos > 1)
		{
			
			return(funcaoFibonacci(termos-1)+(funcaoFibonacci(termos-2)));
		}
		else
			return 1;
	}
}
