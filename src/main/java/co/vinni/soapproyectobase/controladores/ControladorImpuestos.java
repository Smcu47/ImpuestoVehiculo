package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.dto.ImpuestoDto;
import co.vinni.soapproyectobase.servicios.ServicioImpuestos;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@Controller
public class ControladorImpuestos {

    private static final Logger logger = LogManager.getLogger(ControladorImpuestos.class);

    @Autowired
    ServicioImpuestos servicioImpuestos;

    @GetMapping({  "/impuestos"})
    public String listarImpuestos(Model model){
        logger.info("Verificando lista impuestos ");
        model.addAttribute("impuestos",servicioImpuestos.obtenerImpuestos());
        return "impuestos";
    }
    @GetMapping("/impuestos/nuevo")
    public String mostrarFormularioImpuestos(Model model){
        ImpuestoDto impuestoDto = new ImpuestoDto();
        model.addAttribute("impuesto", impuestoDto);
        return "crear_impuesto";
    }
    @PostMapping("/impuestos")
    public String registrarImpuesto(@ModelAttribute("impuesto") ImpuestoDto impuesto) {
        servicioImpuestos.registrar(impuesto);
        return "redirect:/impuestos";
    }


    @GetMapping("/impuestos/modificar/{serial}")
    public String mostrarFormularioEditarImpuesto(@PathVariable long serial, Model model){
        ImpuestoDto impuestoDto = new ImpuestoDto();
        model.addAttribute("impuesto", servicioImpuestos.obtenerImpuesto(serial));
        return "editar_impuesto";
    }


    @PostMapping("/impuestos/{serial}")
    public String modificarImpuesto(@PathVariable long serial,@ModelAttribute( "impuesto") ImpuestoDto impuestoDto, Model model){


        model.addAttribute("impuesto", servicioImpuestos.actualizarVehiculo(impuestoDto));
        return "redirect:/impuestos";
    }
    @GetMapping("/impuestos/{serial}")
    public String eliminarImpuesto(@PathVariable long serial){

        servicioImpuestos.eliminarImpuesto(serial);

        return "redirect:/impuestos";
    }
}

