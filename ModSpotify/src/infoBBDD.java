/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class infoBBDD {

    private String titulo;
    private String descripcion;
    private String cantantes;

    public infoBBDD(String titulo, String descripcion, String cantantes) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.cantantes = cantantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCantantes() {
        return cantantes;
    }
}
