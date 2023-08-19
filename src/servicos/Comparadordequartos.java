package servicos;

import java.util.Comparator;

import Entidades.Quarto;


public class Comparadordequartos implements Comparator<Quarto>{
	public int compare(Quarto o1, Quarto o2) {
        if (o1.getNumero() < o2.getNumero()) {
        	return -1;
        }
        else {
        	if (o1.getNumero() > o2.getNumero()) {
        		return +1;
        	}
            else return 0;
        }	
    }
}
