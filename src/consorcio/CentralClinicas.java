/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consorcio;

/**
 *
 * @author s207e15
 */
public class CentralClinicas {
    ////////////////////////////
    ///     ATRIBUTOS    ///////
    ///////////////////////////
    
    private Clinica primero;
    
    
    ////////////////////////////
    ///       METODOS     /////
    ///////////////////////////
    
    

    /**
     * @return the primero
     */
    public Clinica getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Clinica primero) {
        this.primero = primero;
    }
    
   /**
    * Permite buscar una clinica dado un codigo unico
    * @param codigo codigo de la clinica a buscar
    * @return un objeto de tipo Clinica
    */
    public Clinica buscarClinica(String codigo){
        
    }
    
    public Clinica buscarUltimaClinica(){
        
    }
}
