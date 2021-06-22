/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncpu;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author urickcucho
 */
public class ComposicionCpu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor m1=new Monitor("Asus", "VG27VH1B", 27);
        Mouse m2=new Mouse("Razer", "RZ01-0137", "Alambrico");
        Teclado t1=new Teclado("Razer", "RZ03-0176", 104, 6);
        Cpu c1=new Cpu("Aorus", "C300", 4);
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(t1);
        System.out.println(c1);
    }
    
}
