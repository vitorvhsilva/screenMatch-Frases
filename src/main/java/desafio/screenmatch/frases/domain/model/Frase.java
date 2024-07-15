package desafio.screenmatch.frases.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "frases")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String frase;

    public String personagem;

    public String titulo;

    public String poster;
}
