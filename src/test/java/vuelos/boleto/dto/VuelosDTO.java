/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelos.boleto.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author borra
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VuelosDTO {
        private Integer idavion;
    private String nombre;
    private String asientos;
    private Integer idestadoavion;
    private Integer idmodelo;
    private String usuariocreacion;
    private Date fechacreacion;
    private String usuariomodificacion;
    private Date fechamodificacion;
    private Integer idestadoresitrotabla;
    private Integer idAerolinea;
}
