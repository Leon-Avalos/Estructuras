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
class Empleado {
    private Empleado siguiente;
    private String codigo;
    private String nombre;
    private String especialidad;
    private char genero;

    public Empleado(Empleado siguiente, String codigo, String nombre, String especialidad, char genero) {
        this.siguiente = siguiente;
        this.codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.genero = genero;
    }

    
    /**
     * @return the siguiente
     */
    public Empleado getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Empleado siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
   
    
    
}
