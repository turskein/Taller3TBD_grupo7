package grupo7.tbd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupo7.tbd.models.Tarea;
import grupo7.tbd.repositories.TareaRepository;

@CrossOrigin
@RestController
@RequestMapping("/tarea")
public class TareaService {
    @Autowired
    TareaRepository tareaRepository;

    @GetMapping()
    public List<Tarea> getEveryTarea(){
        return tareaRepository.findAll();
    }

    @PutMapping()
    public Tarea updateTarea(@RequestBody Tarea tarea){
        return tareaRepository.save(tarea);
    }

    @PostMapping()
    Tarea postOVoluntarios(@RequestBody Tarea tarea){
        return tareaRepository.insert(tarea);
    }

    @DeleteMapping
    void deleteTareas(){
        tareaRepository.deleteAll();
    }
}
