package co.edu.uceva.cellularservice.controller;

import co.edu.uceva.cellularservice.model.entities.Celular;
import co.edu.uceva.cellularservice.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta  clase es el controlador de la entidad Celular y se mapea con la url api/v1/cellular-service
 * y expone los servicios rest de la entidad Celular para realizar las operaciones CRUD de la entidad
 * Celular. Se encarga de recibir peticiones http y retornar las respuestas http.
 */

@RestController
@RequestMapping("/api/v1/cellular-service")
public class CellularRestController {

    @Autowired
    private CelularServiceImpl celularService; // Servicio de la entidad Celular para realizar las operaciones CRUD

    /**
     * Este metodo se encarga de retornar una lista de todos los celulares
     * @return una lista de todos los celulares
     */
    @GetMapping("/celulares")
    public List<Celular> listCelular(){
        return this.celularService.listCelular();
    }

    /**
     * Este metodo guarda un celular y retorna un el objeto tipo Celular ya guardado con su id asignado
     * @param celular es el objeto de tipo Celular a guardar (sin el id)
     * @return el objeto de tipo Celular guardado con su id asignado
     */
    @PostMapping("/celular")
    public Celular saveCelular(@RequestBody Celular celular){
        return this.celularService.saveCelular(celular);
    }

    /**
     * Este metodo busca un celular por su id, retorna un celular y lo mapea con la url /celulares/{id}
     * @param id es el id del pais a buscar
     * @return un pais por su id
     */
    @GetMapping("/celulares/{id}")
    public Celular findCelularById(@PathVariable Long id){
        return this.celularService.findCelularById(id);
    }

    /**
     * Este metodo actualiza un celular y retorna el obejeto de tipo Celular ya actualizado
     * @param celular es el objeto de tipo Celular a actualizar (con el id)
     * @return el objeto tipo Celular actualizado
     */
    @PutMapping("/celular")
    public Celular updateCelular(@RequestBody Celular celular){
        return this.celularService.updateCelular(celular);
    }

    /**
     * Este metodo se encarga de buscar por id y luego elemina el celular con ese id
     * @param id es el id a eliminar
     */
    @DeleteMapping("/celulares/{id}")
    public void deleteCelular(@PathVariable Long id){
        Celular celular = this.celularService.findCelularById(id);
        this.celularService.deleteCelular(celular);
    }





}
