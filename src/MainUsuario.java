public class MainUsuario {
    static void main() {
        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();
        user1.setUsername("Bawser");
        user2.setUsername("Aj073");
        user1.setCorreo("");
        user2.setCorreo("armanditolandia5@gmail.com");
        user1.setNivel(1);
        user2.setNivel(2);
        user1.activar();
        user2.activar();
        user1.desactivar();
        System.out.println("Su nombre de usuario es: "+ user1.getUsername()+ ", su correo es: "+ user1.getCorreo()+ "su nivel es: "+ user1.getNivel()+ "esta: "+ user1.isActivo());
        System.out.println("Su nombre de usuario es: "+ user2.getUsername()+ ", su correo es: "+ user2.getCorreo()+ "su nivel es: "+ user2.getNivel()+ "esta"+ user2.isActivo());
    }
}
