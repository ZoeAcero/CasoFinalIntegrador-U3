package Gestion_Usuarios_Simulaciones.Autenticacion;

public class Autenticacion {
    private String usuarioAlmacenado = "usuario autorizado";
    private String contrasenaAlmacenada = "contrasena segura";
    private int intentosFallidos = 0;
    private long tiempoBloqueo = 0;

    public boolean autenticarUsuario(String usuario, String contraseña) {
        long tiempoActual = System.currentTimeMillis();
        if (tiempoActual < tiempoBloqueo) {
            System.out.println("El sistema está bloqueado. Intente más tarde.");
            return false;
        }

        if (usuario.equals(usuarioAlmacenado) && contraseña.equals(contrasenaAlmacenada)) {
            intentosFallidos = 0;
            return true;
        } else {
            intentosFallidos++;
            if (intentosFallidos >= 3) {
                tiempoBloqueo = tiempoActual + 300000;
                System.out.println("Ha excedido el número de intentos permitidos. El sistema se bloqueará por 5 minutos.");
            }
            return false;
        }
    }
}
