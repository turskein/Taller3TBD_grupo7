package grupo7.tbd.repositories;

import grupo7.tbd.models.Emergencia;
import grupo7.tbd.models.geometry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "emergencia", path = "emergencia")
public interface EmergenciaRepository extends MongoRepository<Emergencia, String> {
    @Query("{}")
    public List<Emergencia> findAll();
}
