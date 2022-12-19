package grupo7.tbd.repositories;

import grupo7.tbd.models.Division;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "division", path = "division")
public interface DivisionRepository extends MongoRepository<Division, String> {
    @Query("{'properties.COD_REGI':?0}")
    Division findCODREG(int codRegi);
}
