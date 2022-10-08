/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelos.boletos.service;
import vuelos.boleto.projection.AvionProjection;
import vuelos.boleto.repository.AvionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author borra
 */
@Service
@Transactional
public class AvionService {
    @Autowired
    AvionRepository repository;

    @Transactional(readOnly = true)
    public List<AvionProjection> IdNombreAvion() {
        return repository.IdNombreAvion();
    }

}
