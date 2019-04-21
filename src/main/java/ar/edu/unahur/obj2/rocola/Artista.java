package ar.edu.unahur.obj2.rocola;

import java.util.Set;

public class Artista implements Comparable<Artista>, Reproducible {

    private String nombre;
    private Set<Disco> discos;
    private Estadistica estadista;

    public Artista(String nombre, Set<Disco> discos) {
        this.nombre = nombre;
        this.discos = discos;
        this.discos.stream().forEach(d -> d.setArtista(this));
        this.estadista = new EstadisticaStandard();
    }

    public Artista(String nombre, Set<Disco> discos, Estadistica estadista) {
        this.nombre = nombre;
        this.discos = discos;
        this.estadista = estadista;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Disco> getDiscos() {
        return discos;
    }

    @Override
    public int compareTo(Artista o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public void play() {
        estadista.incrementar();
    }

    public Estadistica getEstadista() {
        return estadista;
    }
}
