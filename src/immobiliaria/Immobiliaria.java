/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobiliaria;

/**
 *
 * @author Marcos
 */
public class Immobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Piso piso;
        Chalet chale;
        String direc;
        Propietarios pp;
        
        ListaPisos miListaP = new ListaPisos();
        pp = new Propietarios("123456", "Calle Pepa");
        
        for (int i = 0; i < 10; i++) {
            piso = new Piso(i, true, i*10, i+5, "Desconocida"+i, pp);
            miListaP.anyadirPiso(piso);
        }
        
        System.out.println("Lista de pisos: ");
        miListaP.mostrarPisos();
        
        direc = "Desconocida5";
        
        piso = miListaP.buscaPiso(direc);
        if (piso!=null){
            System.out.println(piso.toString()+" ENCONTRADO");
        }else{
            System.out.println("No hemos podido encontrar el piso");
        }
        
    }
    
}
