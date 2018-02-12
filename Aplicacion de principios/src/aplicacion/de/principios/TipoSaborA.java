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
public class TipoSaborA {

    public TipoSaborA() {
        DeclararTiposAgua();
    }
    
    
    ArrayList<String> tipos = new ArrayList<>();
    Lector L = new Lector();
    public void DeclararTiposAgua(){
        tipos.add("mora");
        tipos.add("chocolate");
        tipos.add("fresa");
        tipos.add("banano");
        tipos.add("coco");
        tipos.add("chicle");
        tipos.add("naranja");
        tipos.add("piña");
    }
   
    public int listartipos(){
        
            for (int i = 0; i < tipos.size(); i++) {
                System.out.println(i+". "+tipos.get(i));
            }
       return L.leerint("digite el numero correspondiente a la desicion");
    }
}
