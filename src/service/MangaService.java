package service;

import model.Manga;

import java.util.ArrayList;
import java.util.List;

public class MangaService {
    private List<Manga> mangaList;

        public MangaService() {
        this.mangaList = new ArrayList<>();
    }

    public void addManga(Manga manga) {
        mangaList.add(manga);
        System.out.println("Manga added: " + manga);
    }

    // Метод для удаления манги по ID
    public boolean removeManga(int id) {
        for (Manga manga : mangaList) {
            if (manga.getId() == id) {
                mangaList.remove(manga);
                System.out.println("Manga removed: " + manga);
                return true;
            }
        }
        System.out.println("Manga with ID " + id + " not found.");
        return false;
    }

        public List<Manga> getAllMangas() {
        return new ArrayList<>(mangaList); // Возвращает новый список манг
    }

        public Manga findMangaById(int id) {
        for (Manga manga : mangaList) {
            if (manga.getId() == id) {
                return manga;
            }
        }
        return null;
    }

        public List<Manga> findMangaByTitle(String title) {
        List<Manga> result = new ArrayList<>();
        for (Manga manga : mangaList) {
            if (manga.getTitle().equalsIgnoreCase(title)) {
                result.add(manga);
            }
        }
        return result;
    }

    public Manga getMangaById(int id) {
        return null;
    }
}