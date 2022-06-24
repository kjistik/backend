package proyecto.nco.Services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import proyecto.nco.Models.Individual;

public interface IndividualService {
    public List<Individual> findAll();

    public Individual newIndividual(@RequestBody Individual newIndividual);

    public Individual one(@PathVariable Long id);

    public Individual replaceIndividual(@RequestBody Individual newIndividual, @PathVariable Long id);

    public void deleteEmployee(@PathVariable Long id);
}