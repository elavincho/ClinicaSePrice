package com.clinicaseprice.seprice.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author elavincho
 */

@Controller
@RequestMapping("/")
public class HomeControlador {
    
    @GetMapping("")
    public String home(){
        
        return "login/login";
    }
    
    
    
}
