/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelos.boleto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vuelos.boleto.projection.AvionProjection;
import vuelos.boletos.service.AvionService;

/**
 *
 * @author borra
 */
@RestController
public class AvionController {

    @Autowired
    AvionService avionService;

    @GetMapping("api/rol/IdNombreAvion")
    public List<AvionProjection> IdNombreAvion() {
        return avionService.IdNombreAvion();
    }
    
}
