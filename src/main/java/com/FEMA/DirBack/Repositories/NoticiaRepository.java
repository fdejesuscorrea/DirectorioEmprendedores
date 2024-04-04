package com.FEMA.DirBack.Repositories;

import com.FEMA.DirBack.Entities.Noticia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface NoticiaRepository extends CrudRepository<Noticia,Integer> {
    List<Noticia> findAll();
    Noticia findNoticiaById(int id);
}
