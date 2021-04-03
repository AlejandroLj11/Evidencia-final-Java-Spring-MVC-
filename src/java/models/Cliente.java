
package models;

/**
 *
 * @author usuario
 */
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String correo;
    private String telefono;
    private double salario;

    /**
     *
     * @return
     */
    public double getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     *
     */
    public Cliente() {
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }  
}
