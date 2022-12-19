package grupo7.tbd.repositories;

import grupo7.tbd.models.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tarea", path = "tarea")
public interface TareaRepository extends MongoRepository<Tarea, String>{
    @Query("{}")
    public List<Tarea> findAll();
    
}
