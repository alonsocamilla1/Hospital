package br.gama.itau.hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gama.itau.hospital.DTO.PacienteDTO;
import br.gama.itau.hospital.Repository.PacienteRepo;
@Service
public class PacienteService {
    @Autowired
    private PacienteRepo repo;

    public List<PacienteDTO> getAll() {
        return (List<PacienteDTO>) repo.findAll();
    }
}    
    

