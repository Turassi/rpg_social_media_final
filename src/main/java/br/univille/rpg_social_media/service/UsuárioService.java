package br.univille.rpg_social_media.service;

import java.util.List;

import br.univille.rpg_social_media.entity.Usuário;

public interface UsuárioService {
    void save(Usuário nome);
    Usuário getById(long id);
    List<Usuário> getAll();
}
