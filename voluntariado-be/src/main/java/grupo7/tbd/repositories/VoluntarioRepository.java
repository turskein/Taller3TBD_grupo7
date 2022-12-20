package grupo7.tbd.repositories;

import grupo7.tbd.models.geometry;
import grupo7.tbd.models.voluntario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "voluntario", path = "voluntario")
public interface VoluntarioRepository extends MongoRepository<voluntario, String> {
    @Query("{}")
    List<voluntario> findAll();

    @Query(value="{'location':{$geoWithin:{$geometry:?0}}}")
    public List<voluntario> findNearRegion(geometry geometry);
}
