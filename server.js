const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const PORT = 3005;

app.use(cors());
app.use(bodyParser.json());

let books = [
    { id: 1, title: "Until Her Last Breath", author: "Неизвестен", price: 500 },
    { id: 2, title: "Dead Romance: Ultra Numb", author: "Неизвестен", price: 600 },
    { id: 3, title: "TO&HI", author: "Неизвестен", price: 600 },
    { id: 4, title: "Level Up!", author: "Неизвестен", price: 600 },
    { id: 5, title: "Love is Blind", author: "Неизвестен", price: 600 },
    { id: 6, title: "Отзывчивый дизайн на HTML5 и CSS3 для любых устройств", author: "Фрэйн Бен", price: 414 }
];

// Получение списка книг
app.get('/api/books', (req, res) => {
    res.json(books);
});

// Добавление новой книги
app.post('/api/books', (req, res) => {
    const newBook = { id: books.length + 1, ...req.body };
    books.push(newBook);
    res.status(201).json(newBook);
});

// Обновление книги
app.put('/api/books/:id', (req, res) => {
    const { id } = req.params;
    const index = books.findIndex(book => book.id == id);
    if (index !== -1) {
        books[index] = { id: parseInt(id), ...req.body };
        res.json(books[index]);
    } else {
        res.status(404).send('Книга не найдена');
    }
});

// Удаление книги
app.delete('/api/books/:id', (req, res) => {
    const { id } = req.params;
    books = books.filter(book => book.id != id);
    res.status(204).send();
});

// Запуск сервера
app.listen(PORT, () => {
    console.log(`Сервер запущен на http://localhost:${PORT}`);
});
