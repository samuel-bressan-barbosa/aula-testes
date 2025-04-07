package senai.aulas.exemplos.Controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalculadoraController {

    @GetMapping("/atividade/1")
    public String atividade1() {
        return "atividade/atividade1";
    }

    @GetMapping("/atividade/2")
    public String atividade2() {
        return "atividade/atividade2";
    }
    

    
    
    
}
