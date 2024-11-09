package com.manga.store;

import java.util.ArrayList;
import java.util.List;

public class MangaService {
    private List<Manga> mangaList; // Список манг

    // Конструктор
    public MangaService() {
        this.mangaList = new ArrayList<>(); // Инициализация списка манг
    }

    // Метод для добавления манги
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
                return true; // Возвращает true, если манга была успешно удалена
            }
        }
        System.out.println("Manga with ID " + id + " not found.");
        return false; // Возвращает false, если манга не найдена
    }

    // Метод для получения списка всех манг
    public List<Manga> getAllMangas() {
        return new ArrayList<>(mangaList); // Возвращает новый список манг
    }

    // Метод для поиска манги по ID
    public Manga findMangaById(int id) {
        for (Manga manga : mangaList) {
            if (manga.getId() == id) {
                return manga; // Возвращает мангу, если найдена
            }
        }
        return null; // Возвращает null, если манга не найдена
    }

    // Метод для поиска манги по названию
    public List<Manga> findMangaByTitle(String title) {
        List<Manga> result = new ArrayList<>();
        for (Manga manga : mangaList) {
            if (manga.getTitle().equalsIgnoreCase(title)) {
                result.add(manga); // Добавляет мангу в результат, если название совпадает
            }
        }
        return result; // Возвращает список найденных манг
    }
}