package Models;

public class DatosInvalidos {
    String usuario;
    String clave;

    public DatosInvalidos(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
