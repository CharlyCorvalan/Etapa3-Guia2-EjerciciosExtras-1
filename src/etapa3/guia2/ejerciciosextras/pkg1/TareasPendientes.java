/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapa3.guia2.ejerciciosextras.pkg1;

/**
 *
 * @author charl
 */
public class TareasPendientes {
    private boolean estado;
    private String descripcion;
    private String cate;

    public TareasPendientes(boolean estado, String descripcion, String cate) {
        this.estado = estado;
        this.descripcion = descripcion;
        this.cate = cate;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }
    
    
}
