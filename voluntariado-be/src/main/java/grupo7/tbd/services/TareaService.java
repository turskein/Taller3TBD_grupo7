package grupo7.tbd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    
}
