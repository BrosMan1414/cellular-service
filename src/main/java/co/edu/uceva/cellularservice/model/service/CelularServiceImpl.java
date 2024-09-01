package co.edu.uceva.cellularservice.model.service;

import co.edu.uceva.cellularservice.model.dao.CelularDao;
import co.edu.uceva.cellularservice.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta clase implementa los metodos de la interfaz ICelular y realiza
 * las operaciones CRUD de la entidad Celular
 */

@Service
public class CelularServiceImpl implements ICelularService{

    @Autowired
    CelularDao celularDao;

    /**
     * Este metodo lista los celulares
     * @return una lista de celulares
     */
    @Override
    public List<Celular> listCelular() {
        return (List<Celular>) celularDao.findAll();
    }

    /**
     * Este metodo elimina un celular
     * @param celular a eliminar
     */
    @Override
    public void deleteCelular(Celular celular) {
        celularDao.delete(celular);
    }

    /**
     * Este metodo guarda un celular
     * @param celular a guadar
     * @return el objeto tipo Celular guardado (incluye el id)
     */
    @Override
    public Celular saveCelular(Celular celular) {
        return celularDao.save(celular);
    }

    /**
     * Este metodo busca un celular por id
     * @param id del celular a buscar
     * @return el objeto tipo Celular encontrado
     */
    @Override
    public Celular findCelularById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    /**
     * Este metodo actualiza los datos de un celular
     * @param celular a actualizar
     * @return un celular por su id
     */
    @Override
    public Celular updateCelular(Celular celular) {
        return celularDao.save(celular);
    }
}
