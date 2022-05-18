package ejemplo1;
import java.util.Date;

public class Cliente extends Persona { //agregamos extends persona para que herede de persona

    private int idCliente;
    private Date fechaRegistro;

   // public Cliente(int idCliente){//se modifica el constructor al agregar el extends y se agregan los parametros
    //que tiene la clase padre en este caso persona

   public Cliente(int idPersona, String nombre, String apellido, int edadPersona, int idCliente){
        super(idPersona, nombre, apellido, edadPersona);
        this.idCliente = idCliente; //aca se pasa un valor por eso no lleva new
        fechaRegistro = new Date();//tipo de dato de un objeto en especifico, valor es objeto
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }

}
