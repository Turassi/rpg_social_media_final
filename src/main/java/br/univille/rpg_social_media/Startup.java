package br.univille.rpg_social_media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.univille.rpg_social_media.entity.Usuário;
import br.univille.rpg_social_media.service.UsuárioService;

@Component
public class Startup {
    @Autowired
    private UsuárioService service;
    
    public void onApplicationEvent(ContextRefreshedEventevent event){

        var usuário1 = new Usuário();
        usuário1.setNome("Zézin");
        usuário1.setEmail("Zézin@zé");
        usuário1.setSenha("zé12345");
        service.save(usuário1);
        
    }
}
