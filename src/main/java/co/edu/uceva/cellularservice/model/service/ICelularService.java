package co.edu.uceva.cellularservice.model.service;

import co.edu.uceva.cellularservice.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listCelular(); // Lista la tabla celular
    void deleteCelular(Celular celular); // Elimina un Celular
    Celular saveCelular(Celular celular); // Guarda un Celular y retorna un objeto tipo Celular
    Celular findCelularById(Long id); // Busca un Celular por id
    Celular updateCelular(Celular celular); // Actualiza un Celular y retorna un objeto tipo Celular
}
