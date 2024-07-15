package desafio.screenmatch.frases.domain.service;

import desafio.screenmatch.frases.api.dto.FraseDTO;
import desafio.screenmatch.frases.domain.model.Frase;
import desafio.screenmatch.frases.domain.repository.FraseRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FraseService {

    private FraseRepository fraseRepository;
    private ModelMapper modelMapper;

    public FraseDTO retornarFrase() {
        return modelMapper.map(fraseRepository.buscarFraseAleatoria(), FraseDTO.class);
    }
}

