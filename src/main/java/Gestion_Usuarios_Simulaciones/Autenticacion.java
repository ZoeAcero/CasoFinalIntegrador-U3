package Gestion_Usuarios_Simulaciones;

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

        
    }
}
