package ar.edu.unahur.obj2.rocola;

public class Estadistica10 implements Estadistica {

    private int count=0;

    @Override
    public void incrementar() {
        count+=10;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Estadistica10{");
        sb.append("count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
