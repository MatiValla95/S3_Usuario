public class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public void setUsername(String username) {
        if (username == null || username.isEmpty()){
            System.out.println("Este espacio no puede estar en blanco.");
        }else{
            this.username = username;

        }

    }

    public void setCorreo(String correo) {
        if (correo == null || correo.isEmpty()) {
            System.out.println("Este espacio no puede estar en blanco.");
        } else {
            this.correo = correo;
            System.out.println("Tu correo es: " + correo);

        }
    }

    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;

    }

    public void setNivel(int nivel) {
        if (nivel >= 0)
            this.nivel = nivel;

    }

    public String getUsername() {
        return username;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNivel() {
        return nivel;
    }

    public boolean isActivo() {
        return activo;
    }

}
