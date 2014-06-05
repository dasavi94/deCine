/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decine;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoseDaniel
 */
public class Premio {
    private String categoriaPremio;
    int anio;
    
    
 public Premio(FestivalPremio premio, String categoria, int anio)
 {
     this.categoriaPremio=categoria;
     this.anio=anio;
 }
 public ArrayList obtenerDatos()
 {
     ArrayList array=new ArrayList();
     return array;
 }
}
