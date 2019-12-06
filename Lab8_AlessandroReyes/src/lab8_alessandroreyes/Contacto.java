package lab8_alessandroreyes;

public class Contacto {
    private String nombre;
    private int edad;
    private int numero;
    private String correo;
    private String direccion;

    public Contacto(String nombre, int edad, int numero, String correo, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        if(numero>= 10000000 && numero <= 99999999)
            this.numero = numero;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero>= 10000000 && numero <= 99999999)
            this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + ", #" + numero;
    }
    
    
}
