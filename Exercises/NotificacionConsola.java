package Exercises;

import java.util.List;

public class NotificacionConsola {

    public void enviarNotificaciones(List<Notificacion> notificaciones) {
        if (notificaciones != null) {
            for (Notificacion notificacion : notificaciones) {
                if (notificacion != null) {
                    // Si requiere un String, pásale un texto:
                    notificacion.enviar("Hola"); 
                }
            }
        }
    }
}