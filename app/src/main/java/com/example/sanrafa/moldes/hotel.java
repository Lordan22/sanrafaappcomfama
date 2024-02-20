package com.example.sanrafa.moldes;

public class hotel {
    private String nombre;
    private String precio;

    private String descripcion;

    private String telefono;

    private String direccion;

    private Integer calificacion;

    private Integer fotoGrafia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public hotel(String nombre, String precio, String descripcion, String telefono, String direccion, Integer calificacion, Integer fotoGrafia) {
        this.nombre = nombre;
        this.calificacion= calificacion;
        this.descripcion= descripcion;
        this.fotoGrafia =fotoGrafia;
        this.precio=precio;

    }
}
