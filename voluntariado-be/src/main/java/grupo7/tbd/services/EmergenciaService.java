package grupo7.tbd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupo7.tbd.models.Emergencia;
import grupo7.tbd.repositories.EmergenciaRepository;

@CrossOrigin
@RestController
@RequestMapping("/emergencia")
public class EmergenciaService {
    
    @Autowired
    EmergenciaRepository emergenciaRepository;

    @GetMapping() List<Emergencia> getAllEmergencias(){
        return emergenciaRepository.findAll();
    }

    
}
