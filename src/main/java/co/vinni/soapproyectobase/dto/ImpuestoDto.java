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
public class ImpuestoDto implements Serializable {

    private long id;
    @NotBlank(message = "La placa es obligatorio")
    private String placa;
    @NotBlank(message = "El modelo es obligatorio")
    private long modelo;
    @NotBlank(message = "el año de liquiddación es obligatorio")
    private long anioLiquidado;
    @NotBlank(message = "La fecha de pago es obligatorio")
    private String fechaPago;
    @NotBlank(message = "El Estado es obligatorio")
    private String estado;
    @NotBlank(message = "El Valor es obligatorio")
    private double valor;

}
