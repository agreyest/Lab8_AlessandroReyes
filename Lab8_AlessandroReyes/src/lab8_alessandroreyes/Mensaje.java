package lab8_alessandroreyes;

import java.util.Date;

public class Mensaje {
    private String emisor;
    private String receptor;
    private Date fecha;
    private String contenido;

    public Mensaje(String emisor, String receptor, Date fecha, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensaje: " + "de " + receptor  + "\n contenido=" + contenido + "\n" + ", fecha=" + fecha;
    }
    
    
}
