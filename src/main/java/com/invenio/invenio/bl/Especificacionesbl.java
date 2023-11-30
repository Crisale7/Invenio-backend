package com.invenio.invenio.bl;

import com.invenio.invenio.dao.Especificaciones;
import com.invenio.invenio.dao.Repository.Especificacionesrepository;
import com.invenio.invenio.dto.Especificacionesdto;
import com.invenio.invenio.dto.ListaEspecificacionesdto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Especificacionesbl {
    private final Especificacionesrepository especificacionesrepository;
    private static final Logger LOG = LoggerFactory.getLogger(Especificacionesbl.class);

    @Autowired
    public Especificacionesbl(Especificacionesrepository especificacionesrepository) {
        this.especificacionesrepository = especificacionesrepository;
    }

    public Especificacionesdto CrearEspecificaciones(String serie, String marca, String estado, Integer eq, Integer dimension_alto, Integer dimension_ancho, String ram, String procesador, String memoria, String color, Integer Activo_activoo_id) {
        LOG.info("Creando especificaciones con serie: {}", serie);
        Especificaciones especificacionesEntity = new Especificaciones();
        especificacionesEntity.setSerie(serie != null && !serie.isEmpty() ? serie : null);
        especificacionesEntity.setMarca(marca != null && !marca.isEmpty() ? marca : null);
        especificacionesEntity.setEstado(estado != null && !estado.isEmpty() ? estado : null);
        especificacionesEntity.setEq(eq != null ? eq : 0);
        especificacionesEntity.setDimension_alto(dimension_alto != null ? dimension_alto : 0);
        especificacionesEntity.setDimension_ancho(dimension_ancho != null ? dimension_ancho : 0);
        especificacionesEntity.setRam(ram != null && !ram.isEmpty() ? ram : null);
        especificacionesEntity.setProcesador(procesador != null && !procesador.isEmpty() ? procesador : null);
        especificacionesEntity.setMemoria(memoria != null && !memoria.isEmpty() ? memoria : null);
        especificacionesEntity.setColor(color != null && !color.isEmpty() ? color : null);
        especificacionesEntity.setActivo_activo_id(Activo_activoo_id != null ? Activo_activoo_id : 0);
        especificacionesrepository.save(especificacionesEntity);
        return new Especificacionesdto(especificacionesEntity.getEspecificaciones_id(), Activo_activoo_id, serie, marca, estado, eq, dimension_alto, dimension_ancho, ram, procesador, memoria, color);
    }


    public ListaEspecificacionesdto obtenerEspecificacionesPorActivoId(int activoId) {
        LOG.info("Obteniendo especificaciones con Activo_activo_id: {}", activoId);
        List<Especificaciones> especificacionesEntities = especificacionesrepository.findByActivo_activo_id(activoId);
        if (!especificacionesEntities.isEmpty()) {
            Especificaciones especificacionesEntity = especificacionesEntities.get(0);
            ListaEspecificacionesdto listaEspecificacionesdto = new ListaEspecificacionesdto(
                    especificacionesEntity.getSerie() != null && !especificacionesEntity.getSerie().isEmpty() ? especificacionesEntity.getSerie() : "No posee",
                    especificacionesEntity.getMarca() != null && !especificacionesEntity.getMarca().isEmpty() ? especificacionesEntity.getMarca() : "No posee",
                    especificacionesEntity.getEstado() != null && !especificacionesEntity.getEstado().isEmpty() ? especificacionesEntity.getEstado() : "No posee",
                    especificacionesEntity.getEq() != 0 ? especificacionesEntity.getEq() : 0,
                    especificacionesEntity.getDimension_alto() != 0 ? especificacionesEntity.getDimension_alto() : 0,
                    especificacionesEntity.getDimension_ancho() != 0 ? especificacionesEntity.getDimension_ancho() : 0,
                    especificacionesEntity.getRam() != null && !especificacionesEntity.getRam().isEmpty() ? especificacionesEntity.getRam() : "No posee",
                    especificacionesEntity.getProcesador() != null && !especificacionesEntity.getProcesador().isEmpty() ? especificacionesEntity.getProcesador() : "No posee",
                    especificacionesEntity.getMemoria() != null && !especificacionesEntity.getMemoria().isEmpty() ? especificacionesEntity.getMemoria() : "No posee",
                    especificacionesEntity.getColor() != null && !especificacionesEntity.getColor().isEmpty() ? especificacionesEntity.getColor() : "No posee"
            );
            return listaEspecificacionesdto;
        } else {
            return null;
        }
    }

    public ListaEspecificacionesdto obtenerEspecificacionesPorSerie(String serie){
        LOG.info("Obteniendo especificaciones con serie: {}", serie);
        Especificaciones especificacionesEntity = especificacionesrepository.findBySerie(serie);
        if (especificacionesEntity != null) {
            ListaEspecificacionesdto listaEspecificacionesdto = new ListaEspecificacionesdto(
                    especificacionesEntity.getSerie(),
                    especificacionesEntity.getMarca(),
                    especificacionesEntity.getEstado(),
                    especificacionesEntity.getEq(),
                    especificacionesEntity.getDimension_alto(),
                    especificacionesEntity.getDimension_ancho(),
                    especificacionesEntity.getRam(),
                    especificacionesEntity.getProcesador(),
                    especificacionesEntity.getMemoria(),
                    especificacionesEntity.getColor()
            );
            return listaEspecificacionesdto;
        } else {
            return null;
        }
    }
}