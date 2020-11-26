package oscar.group.MarketOscar.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeralineas")

public class sonarCloudCambios {

    @GetMapping("/ho")
    public String primeralineass()
    {
        return "primerss pipeline cambiuo";
    }

    @GetMapping("/hoi")
    public String primeralinea21()
    {
        return "primss pipeline cambiuo";
    }
}
