package proyecto.nco.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import proyecto.nco.Exceptions.IndividualnotFoundException;
import proyecto.nco.Models.Individual;
import proyecto.nco.Repository.IndividualRepository;
@Service
public class IndividualServiceImpl {

    private IndividualRepository repo;

    public IndividualServiceImpl() {
    }

    public IndividualServiceImpl(IndividualRepository repo) {
        this.repo = repo;
        
    }

    public List<Individual> findAll() {
        return repo.findAll();
    }

    public Individual newIndividual(@RequestBody Individual newIndividual) {
        return repo.save(newIndividual);
    }

    public Individual one(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new IndividualnotFoundException(id));
    }

    public Individual replaceIndividual(@RequestBody Individual newIndividual, @PathVariable Long id) {
        return repo.findById(id)
                .map(individual -> {
                    individual.setName(newIndividual.getName());
                    return repo.save(individual);
                })
                .orElseGet(() -> {
                    newIndividual.setId(id);
                    return repo.save(newIndividual);
                });
    }

    public void deleteEmployee(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
