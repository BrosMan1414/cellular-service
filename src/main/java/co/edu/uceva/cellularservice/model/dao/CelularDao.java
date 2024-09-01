package co.edu.uceva.cellularservice.model.dao;

import co.edu.uceva.cellularservice.model.entities.Celular;
import org.springframework.data.repository.CrudRepository;

/**
 * Esta interfaz hereda de CrudRepository y se realiza las operaciones CRUD de la entidad Celular
 */

public interface CelularDao extends CrudRepository<Celular, Long> { }
