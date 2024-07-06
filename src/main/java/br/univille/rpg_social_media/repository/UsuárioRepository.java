package br.univille.rpg_social_media.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.rpg_social_media.entity.Usuário;


@Repository
public interface UsuárioRepository 
        extends JpaRepository<Usuário, Long>{
    
}
