package oscar.group.MarketOscar.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeralinea")

public class sonarCloudCambios {

    @GetMapping("/hope")
    public String primeralineass()
    {
        return "primerss pipeline cambiuo";
    }

    @GetMapping("/hopes")
    public String primeralinea21()
    {
        return "primss pipeline cambiuo";
    }
}
