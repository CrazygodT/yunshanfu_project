package com.qf;

import com.qf.pojo.Film;
import com.qf.service.FilmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testFilm {
    @Autowired
    FilmService filmService;
    @Test
    public void testFilme(){
        List<Film> all = filmService.findAll();
        System.out.println(all);
    }

    @Test
    public void testFilmById(){
        Film all = filmService.findById(1);
        System.out.println(all);
    }
}
