package ar.edu.unahur.obj2.rocola;

import java.util.ArrayList;
import java.util.List;

public class Cancion implements Comparable<Cancion>, Reproducible {
    private String titulo;
    private String autor;
    private int duracion;
    private List<Disco> discos;

    private int cantidadReproducciones = 0;

    public Cancion(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.discos = new ArrayList<>();
    }

    public void play() {
        System.out.println("Reproduciendo cancion: " + titulo);
        cantidadReproducciones++;
    }

    public void agregarDisco(Disco disco) {
        discos.add(disco);
    }

    @Override
    public int compareTo(Cancion o) {
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cancion cancion = (Cancion) o;

        if (this.duracion != cancion.duracion) return false;
        return this.titulo.equals(cancion.titulo);

    }

    @Override
    public int hashCode() {
        int result = titulo.hashCode();
        result = 31 * result + duracion;
        return result;
    }
}
