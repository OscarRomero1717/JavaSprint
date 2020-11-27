package oscar.group.MarketOscar.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeralinea")

public class HolaMundoControlador {
     @GetMapping("/hope")
    public String primeralinea()
    {
        return "primerssasa pipeline cambiuo";
    }

    @GetMapping("/hopes")
    public String primeralinea21()
    {
        return "primss pipeline cambiuo";
    }


}


