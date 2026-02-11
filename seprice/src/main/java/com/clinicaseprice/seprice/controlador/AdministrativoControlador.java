package com.clinicaseprice.seprice.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/administrativo")
public class AdministrativoControlador {

    @PostMapping("/homeAdministrativo")
    public String homeAdministrativo(RedirectAttributes redirectAttributes){
        
        return "administrativo/home";
    }
    
}

