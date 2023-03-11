package br.gama.itau.hospital.DTO;

import br.gama.itau.hospital.Model.Paciente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDTO {
    private String nome;
    private String CPF;
    private String fone;

    public PacienteDTO(Paciente paciente) {
        this.nome = paciente.getNome();
        this.CPF = paciente.getCPF();
        this.fone = paciente.getFone();
    }
}
