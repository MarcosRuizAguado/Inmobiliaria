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
public class Chalet extends Vivienda {
    
    private int mJardin;
    private boolean piscina;

    public Chalet(int metros, int habita, String direccion, Propietarios p) {
        super(metros, habita, direccion, p);
    }

    public Chalet(int mJardin, boolean piscina, int metros, int habita, String direccion, Propietarios p) {
        super(metros, habita, direccion, p);
        this.mJardin = mJardin;
        this.piscina = piscina;
        setNumVivi(getNumVivi()+1);
    }
    
    public float precioFinal(){
       float pf=0;
       pf = getPrecio() * getMetros();
       if (isPiscina())
           pf+=3000;
       if(getmJardin()>0)
           pf+=getMetros()*300;
       
       return pf;
    
    } 

    public int getmJardin() {
        return mJardin;
    }

    public void setmJardin(int mJardin) {
        this.mJardin = mJardin;
    }

    private boolean isPiscina() {
       return piscina;
    }

    @Override
    public String toString() {
        return "Chalet{" + "mJardin=" + mJardin + ", piscina=" + piscina + '}';
    }

    
    
    
}
