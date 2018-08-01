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
public class Clinica {
    
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private String paginaWeb;
    private Clinica primero;
    private CentralEmpleados central;
    

    public Clinica(String codigo, String nombre, String direccion, String telefono, String paginaWeb, Clinica primero, CentralEmpleados central) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.primero = primero;
        this.central = central;
    }

    /**
     * @return el nombre de la clinica
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nuevo nombre a asignarle
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la direccion de la clinica
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion la nueva direccion a asignar
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return el telefono de la clinica
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono nuevo numero de telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the paginaWeb
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * @param paginaWeb the paginaWeb to set
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

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
    
}
