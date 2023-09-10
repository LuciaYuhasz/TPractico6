/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpractico6;

/**
 *
 * @author Usuario
 */
public class Producto implements Comparable <Producto>{
    private int codigo;
    private String descripcion;
    private double precio;
    private int stoock;
    private String rubro;

    public Producto(int codigo, String descripcion, double precio, int stoock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stoock = stoock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStoock() {
        return stoock;
    }

    public void setStoock(int stoock) {
        this.stoock = stoock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto o) {
        if (this.codigo==o.codigo){
            return 0;
        }
        else if (this.codigo<o.codigo)
                {
            return -1;
        }else { 
            return 1;
        }
        
    }
    
}
