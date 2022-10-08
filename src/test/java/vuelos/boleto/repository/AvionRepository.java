/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vuelos.boleto.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vuelos.boleto.model.AvionModel;
import vuelos.boleto.projection.AvionProjection;

/**
 *
 * @author borra
 */
public interface AvionRepository extends CrudRepository<AvionModel, Integer> {

    @Override
    public List<AvionModel> findAll();

    @Override
    public long count();

    @Query(value = "select idavion, nombre, asientos, idestadoavion from avion", nativeQuery = true)
    public List<AvionProjection> IdNombreAvion();
    
}
