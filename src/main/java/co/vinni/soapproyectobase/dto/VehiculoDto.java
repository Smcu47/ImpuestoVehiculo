package co.vinni.soapproyectobase.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class VehiculoDto implements Serializable {

    private long id;
    //private long serial;
    @NotBlank(message = "La placa es obligatorio")
    private String placa;
    @NotBlank(message = "La Marca es obligatorio")
    private String marca;
    @NotBlank(message = "El Modelo es obligatorio")
    private long modelo;
    @NotBlank(message = "El Cilindraje es obligatorio")
    private long cilindradaCC;
    @NotBlank(message = "El Tipo de Combustible es obligatorio")
    private String combustible;
    @NotBlank(message = "El Valor Comercial es obligatorio")
    private long valorComercial;
    @NotBlank(message = "El Nombre del propietario es obligatorio")
    private String propietario;
    @NotBlank(message = "No Identificación es obligatorio")
    private long numIdentificacion;


}