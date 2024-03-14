package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Impuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RepositorioImpuesto extends JpaRepository<Impuesto,Long> {
    Impuesto findByPlaca(String placa);
}
