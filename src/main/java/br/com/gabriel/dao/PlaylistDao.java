package br.com.gabriel.dao;

import java.util.List;

import br.com.gabriel.domain.Playlist;

public interface PlaylistDao {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorID(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);

}
