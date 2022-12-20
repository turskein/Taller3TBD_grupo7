package grupo7.tbd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import grupo7.tbd.models.Division;
import grupo7.tbd.models.Emergencia;
import grupo7.tbd.repositories.DivisionRepository;
import grupo7.tbd.repositories.EmergenciaRepository;

@CrossOrigin
@RestController
@RequestMapping("/emergencia")
public class EmergenciaService {
    
    @Autowired
    EmergenciaRepository emergenciaRepository;



    @GetMapping()
    List<Emergencia> getAllEmergencias(){
        return emergenciaRepository.findAll();
    }

    @PutMapping
    Emergencia updatEmergencia(@RequestBody Emergencia emergencia){
        return emergenciaRepository.save(emergencia);
    }

    @PostMapping()
    Emergencia postEmergencia(@RequestBody Emergencia emergencia){
        return emergenciaRepository.insert(emergencia);
    }

    @DeleteMapping
    void deleteEmergencia(){
        emergenciaRepository.deleteAll();
    }

    @GetMapping("/activos")
    List<Emergencia> getActiveTasks(){
        return emergenciaRepository.activeEstate();
    }

}
