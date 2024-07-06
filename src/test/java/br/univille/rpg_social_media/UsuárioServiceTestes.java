package br.univille.rpg_social_media;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import br.univille.rpg_social_media.entity.Usuário;
import br.univille.rpg_social_media.service.UsuárioService;

@SpringBootTest
@ContextConfiguration
@ActiveProfiles(profiles = "test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class UsuárioServiceTestes {
    
    @Autowired
    private UsuárioService service;
    
    @Test
    void getAllUsuáriosEmptyList(){
        var listaUsuário = service.getAll();
        assertEquals(listaUsuário.size(),0);
    }

    @Test
    void saveNewUsuárioFindAll(){
        var newUsuário = new Usuário();
        newUsuário.setNome("Christian");    
        newUsuário.setSenha("12345");
        service.save(newUsuário);

        var listaUsuários = service.getAll();
        assertEquals(listaUsuários.get(0).getNome(), "Christian");
    }
}
