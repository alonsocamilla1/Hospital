package br.gama.itau.hospital.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 200)
    private String nome;

    @Column(length = 15)
    private String CPF;

    @Column(length = 10)
    private String fone;
}
