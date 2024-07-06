package br.univille.rpg_social_media.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.univille.rpg_social_media.entity.Usuário;
import br.univille.rpg_social_media.service.UsuárioService;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UsuárioService service;

    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("home/index");
    }

    @GetMapping("/createficha")
    public ModelAndView createficha(){
        return new ModelAndView("home/createficha");
    }

    @GetMapping("/fichas")
    public ModelAndView fichas(){
        return new ModelAndView("home/fichas");
    }

    @GetMapping("/login")
    public ModelAndView login(){
        var listaUsuário = service.getAll();
        return new ModelAndView("home/login","listaUsuário",listaUsuário);
    }

    @PostMapping("/login")
    public String salvarUsuario(@RequestParam("email") String email, @RequestParam("nome") String nome, @RequestParam("senha") String senha) {
        Usuário usuario = new Usuário();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setNome(nome);
        service.save(usuario);
        return "/home/login"; // Redirecionar para uma página de sucesso após salvar os dados
    }
}