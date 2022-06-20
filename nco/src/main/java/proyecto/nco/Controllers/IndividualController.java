package proyecto.nco.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.nco.Models.Individual;
import proyecto.nco.Services.IndividualServiceImpl;

@RestController
@RequestMapping("/individuos")
public class IndividualController {

  private IndividualServiceImpl individualServiceImpl;

  public IndividualController() {
  }

  @Autowired
  public IndividualController(IndividualServiceImpl individualServiceImpl) {
    this.individualServiceImpl = individualServiceImpl;
  }

  // anda bien
  @GetMapping("/lista")
  List<Individual> findAll() {
    return individualServiceImpl.findAll();
  }

  // esto también anda
  @PostMapping("/nuevo")
  Individual newIndividual(@RequestBody Individual newIndividual) {
    return individualServiceImpl.newIndividual(newIndividual);
  }

  // anda bien
  @GetMapping("/buscar/{id}")
  Individual one(@PathVariable Long id) {
    return individualServiceImpl.one(id);
  }

  // si servía
  @PutMapping("/reemplazar/{id}")
  Individual replaceIndividual(@RequestBody Individual newIndividual, @PathVariable Long id) {
return individualServiceImpl.replaceIndividual(newIndividual, id);
  }

  // una maravilla
  @DeleteMapping("/borrar/{id}")
  void deleteEmployee(@PathVariable Long id) {
    individualServiceImpl.deleteEmployee(id);
  }
}