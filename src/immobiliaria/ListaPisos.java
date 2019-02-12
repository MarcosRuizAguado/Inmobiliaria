/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobiliaria;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marcos
 */
public class ListaPisos {

    private ArrayList<Piso> listaP;

    public ListaPisos() {
        this.listaP = new ArrayList();
    }

    public ListaPisos(ArrayList<Piso> listaP) {
        this.listaP = listaP;
    }

    public boolean anyadirPiso(Piso p) {
        boolean insertado = false;

        insertado = listaP.add(p);

        return insertado;
    }

    public void mostrarPisos() {
        for (Piso piso : listaP) {
            System.out.println(piso.toString());
        }
    }

    public Piso buscaPiso(String d) {
        Piso p = null, enc = null;
        boolean salir = false;
        Iterator<Piso> iterator = listaP.iterator();

        while (salir == false && iterator.hasNext()) {
            p = iterator.next();
            if (p.getDireccion().equalsIgnoreCase(d)) {
                salir = true;
                enc = p;

            }
        }
        return enc;
    }

}
