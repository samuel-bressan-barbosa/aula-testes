package senai.aulas.exemplos.Controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadorController {

    @PostMapping("/atividade/1")
    public Map<String, Object> atividade1(@RequestBody Map<String, String> json) {    
        
        String nascimento = json.get("nascimento");
        LocalDate nascimentoDate = LocalDate.parse(nascimento);

        LocalDate hoje = LocalDate.now();

        int idade = Period.between(nascimentoDate, hoje).getDays();

        Map<String, Object> resposta = new HashMap<>();
        resposta.put("idade", idade);

        return resposta;
    }

    @PostMapping("/atividade/2")
    public Map<String, Object> atividade2(@RequestBody Map<String, String> json) {    
        
        int numb1 = Integer.parseInt(json.get("numb1"));
        int numb2 = Integer.parseInt(json.get("numb2"));

        Map<String, Object> resposta = new HashMap<>();
        resposta.put("resultado", numb1 - numb2);

        return resposta;
    }
}
