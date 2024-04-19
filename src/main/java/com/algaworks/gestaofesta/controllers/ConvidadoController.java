package com.algaworks.gestaofesta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.gestaofesta.model.Convidado;
import com.algaworks.gestaofesta.repositories.ConvidadoRepository;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class ConvidadoController {

@Autowired
private ConvidadoRepository convidados;


@GetMapping("/")
public String index() {
    return "index";
}


 @GetMapping("/convidados")
 public ModelAndView listar() {
     ModelAndView modelAndView=new ModelAndView("listaConvidados");
    modelAndView.addObject("convidados", convidados.findAll());
     return modelAndView;
 }

    @PostMapping("/adicionar")
    public String adicionar(Convidado convidado) {
     this.convidados.save(convidado);
        return "redirect:/convidados";
    }
    
}
