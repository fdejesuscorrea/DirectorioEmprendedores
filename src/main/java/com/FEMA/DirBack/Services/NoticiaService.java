package com.FEMA.DirBack.Services;

import com.FEMA.DirBack.Entities.Emprendedor;
import com.FEMA.DirBack.Entities.Noticia;
import com.FEMA.DirBack.Repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticiaService {
    private final NoticiaRepository noticiaRepository;

    @Autowired
    public NoticiaService(NoticiaRepository noticiaRepository) {
        this.noticiaRepository = noticiaRepository;
    }

    public List<Noticia> findAllNoticias() {
        return noticiaRepository.findAll();
    }
    public Noticia findNoticiaById(int id) {
        return noticiaRepository.findById(id).orElse(null);
    }
}
