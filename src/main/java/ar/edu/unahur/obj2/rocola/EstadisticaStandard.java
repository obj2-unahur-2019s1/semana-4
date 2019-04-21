package ar.edu.unahur.obj2.rocola;

public class EstadisticaStandard implements Estadistica {

    private int cantidad = 0;

    public void  incrementar() {
        cantidad++;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EstadisticaStandard{");
        sb.append("cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }
}
