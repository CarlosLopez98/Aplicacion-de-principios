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
        tipos.add("paleta de agua $1000");
        tipos.add("helado de yogurt $2000 + 1000 por cada bola extra");
    }
   
    public int listartipos(){
        
            for (int i = 0; i < tipos.size(); i++) {
                System.out.println(i+". "+tipos.get(i));
            }
       return L.leerint("digite el numero correspondiente a la desicion");
    }
}
