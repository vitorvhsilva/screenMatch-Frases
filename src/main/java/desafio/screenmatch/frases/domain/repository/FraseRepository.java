package desafio.screenmatch.frases.domain.repository;

import desafio.screenmatch.frases.domain.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY function('RANDOM') LIMIT 1 ")
    Frase buscarFraseAleatoria();
}
