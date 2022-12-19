package grupo7.tbd.services;

import java.util.ArrayList;
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
import grupo7.tbd.models.voluntario;
import grupo7.tbd.repositories.DivisionRepository;
import grupo7.tbd.repositories.VoluntarioRepository;

@CrossOrigin
@RestController
@RequestMapping("/voluntario")
public class VoluntarioService {
    
    @Autowired
    VoluntarioRepository voluntarioRepository;

    @Autowired
    DivisionRepository divisionRepository;

    @GetMapping()
    List<voluntario> getAllvoluntarios(){
        return voluntarioRepository.findAll();
    }

    @PutMapping()
    voluntario updateVoluntario(@RequestBody voluntario voluntario){
        return voluntarioRepository.save(voluntario);
    }

    @PostMapping()
    voluntario postOVoluntarios(@RequestBody voluntario voluntario){
        return voluntarioRepository.insert(voluntario);
    }

    @DeleteMapping
    void deleteAll(){
        voluntarioRepository.deleteAll();
    }

    @GetMapping("/habilidades")
    List<voluntario> getvoluntariosNearOf(@RequestParam int codRegi){
        Division divisionSelected = divisionRepository.findCODREG(codRegi);
        List<voluntario> retorno = voluntarioRepository.findNearRegion(divisionSelected.getGeometry());
        return retorno;
    }

    @GetMapping("/division")
    Division asdasdasd(@RequestParam int codRegi){
        Division divisionSelected = divisionRepository.findCODREG(codRegi);
        return divisionSelected;
    }
}
