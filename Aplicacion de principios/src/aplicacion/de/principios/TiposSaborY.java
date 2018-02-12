/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.de.principios;

import java.util.ArrayList;

/**
 *
 * @author Juancho
 */
public class TiposSaborY {

    public TiposSaborY() {
    DeclararTiposyogurt();
    }
    
    
    
    ArrayList<String> tipos = new ArrayList<>();
    Lector L = new Lector();
    public void DeclararTiposyogurt(){
        tipos.add("mora");
        tipos.add("chocolate");
        tipos.add("fresa");
        tipos.add("vainilla");
        tipos.add("coco");
        tipos.add("chicle");
        tipos.add("brownie");
        tipos.add("piña");
        tipos.add("menta");
        tipos.add("limon");
    }
   
    public int listartipos(){
        
            for (int i = 0; i < tipos.size(); i++) {
                System.out.println(i+". "+tipos.get(i));
            }
       return L.leerint("digite el numero correspondiente a la desicion");
    }
    public String devolversabor(int n){
        return tipos.get(n);
    }
}
