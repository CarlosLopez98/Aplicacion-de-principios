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
public class TipoHelados {

    public TipoHelados() {
        DeclararTipos();
    }
    
    ArrayList<String> tipos = new ArrayList<>();
    Lector L = new Lector();
    public void DeclararTipos(){
        tipos.add("paleta de agua");
        tipos.add("helado de yogurt");
    }
   
    public int listartipos(){
        
            for (int i = 0; i < tipos.size(); i++) {
                System.out.println(i+". "+tipos.get(i));
            }
       return L.leerint("digite el numero correspondiente a la desicion");
    }
}
