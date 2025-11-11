package co.edu.uniquindio.poo.service;

import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.EstadoEnvio;
import co.edu.uniquindio.poo.model.patrones.builder.EnvioBuilder;
import java.util.List;

public interface IEnvioService {
    /**
     * Crea un envío usando el patrón Builder
     * @param builder El builder con toda la información
     * @return 
     */
    Envio crearEnvio(EnvioBuilder builder);
    
    /**
     * Cancela un envío 
     * @param idEnvio ID del envío
     * @return true si se pudo cancelar (solo si estaba en SOLICITADO)
     */
    boolean cancelarEnvio(String idEnvio);

    /**
     * Actualiza el estado de un envío 
     * @param idEnvio ID del envío
     * @param nuevoEstado El nuevo estado (ASIGNADO, EN_RUTA, ENTREGADO, etc.)
     */
    void actualizarEstadoEnvio(String idEnvio, EstadoEnvio nuevoEstado);

    Envio buscarEnvio(String idEnvio);
    List<Envio> listarEnviosPorUsuario(String idUsuario);
    List<Envio> listarEnviosPorEstado(EstadoEnvio estado);
}