package proyecto.nco.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyecto.nco.Models.Individual;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, Long>{
    
}
