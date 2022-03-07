package br.com.ediarista.web.controllers;

import br.com.ediarista.core.models.Servico;
import br.com.ediarista.core.models.enums.Icone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/servicos")
public class ServicoController {

    @GetMapping("/cadastrar")
    public ModelAndView cadastrar(){
        var modelAndView = new ModelAndView("admin/servico/form");

        modelAndView.addObject("servico", new Servico());
        return modelAndView;
    }

    @ModelAttribute("icones")
    public Icone[] getIcones(){
        return Icone.values();
    }
}
