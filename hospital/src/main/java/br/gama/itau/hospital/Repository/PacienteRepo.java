package br.gama.itau.hospital.Repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.hospital.Model.Paciente;

public interface PacienteRepo extends CrudRepository(Paciente, Long){
    
}
