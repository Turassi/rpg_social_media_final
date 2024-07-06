package br.univille.rpg_social_media.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.rpg_social_media.entity.Usuário;
import br.univille.rpg_social_media.repository.UsuárioRepository;
import br.univille.rpg_social_media.service.UsuárioService;

@Service
public class UsuárioServiceImpl
    implements UsuárioService {
    
    @Autowired
    private UsuárioRepository repository;

    @Override
    public void save(Usuário nome) {
        repository.save(nome);
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public Usuário getById(long id) {
        return repository.getById(id);
    }

    @Override
    public List<Usuário> getAll() {
        return repository.findAll();
    }
}
    

