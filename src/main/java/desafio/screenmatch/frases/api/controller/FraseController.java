package desafio.screenmatch.frases.api.controller;

import desafio.screenmatch.frases.api.dto.FraseDTO;
import desafio.screenmatch.frases.domain.model.Frase;
import desafio.screenmatch.frases.domain.service.FraseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("series")
@AllArgsConstructor
public class FraseController {

    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO retornarFrase() {
        return fraseService.retornarFrase();
    }
}
