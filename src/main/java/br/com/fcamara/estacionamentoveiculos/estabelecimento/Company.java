package br.com.fcamara.estacionamentoveiculos.estabelecimento;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Company")
@Table(name = "companies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Company {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String phoneNumber;
    private Integer motoSpaces;
    private Integer carSpaces;
    private Boolean status;
}
