package com.FEMA.DirBack.Controllers;


import com.FEMA.DirBack.Entities.Emprendedor;
import com.FEMA.DirBack.Entities.Emprendimiento;
import com.FEMA.DirBack.Entities.Noticia;
import com.FEMA.DirBack.Repositories.NoticiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiaController {
    @Autowired
    private NoticiaRepository noticiaRepository;
    @GetMapping
    public ResponseEntity<List<Noticia>> getAllNoticias() {
        List<Noticia> noticias=noticiaRepository.findAll();
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<Noticia>> getNoticiaById(@PathVariable("id") int id) {
        List<Noticia> noticia=new ArrayList<>();
        noticia.add(noticiaRepository.findNoticiaById(id));
        return new ResponseEntity<>(noticia, HttpStatus.OK);
    }
}
