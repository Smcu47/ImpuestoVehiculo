package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Vehiculo")
@Table(name = "VEHICULOS")
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VEHICULOS")
    @SequenceGenerator(name = "SEQ_VEHICULOS", sequenceName = "SEQ_VEHICULOS", allocationSize = 1)

    @Column(name = "ID_VEHICULO", nullable = false)
    private long id;

    @Column(name = "PLACA", nullable = false)
    private String placa;

    @Column(name = "MARCA", nullable = false)
    private String marca;
    @Column(name = "MODELO", nullable = false)
    private long modelo;
    @Column(name = "CILINDRADA_CC", nullable = false)
    private long cilindradaCC;

    @Column(name = "COMBUSTIBLE", nullable = false)
    private String combustible;

    @Column(name = "VALOR_COMERCIAL", nullable = false)
    private long valorComercial;

    @Column(name = "PROPIETARIO", nullable = false)
    private String propietario;
    @Column(name = "NUM_IDENTIFICACION", nullable = false)
    private long numIdentificacion;

}