package controller;

import model.Manga;
import service.MangaService;

import java.util.List;

class MangaController {
    private MangaService mangaService;

    public MangaController(MangaService mangaService) {
        this.mangaService = mangaService;
    }

    public List<Manga> getAllMangas() {
        return mangaService.getAllMangas();
    }

    public Manga getMangaById(int id) {
        return mangaService.getMangaById(id);
    }
}
