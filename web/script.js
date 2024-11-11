const apiUrl = 'http://localhost:3005/api/books';

// Получение списка книг
function getBooks() {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', apiUrl, true);
    xhr.onload = function () {
        if (xhr.status === 200) {
            const books = JSON.parse(xhr.responseText);
            displayBooks(books);
        } else {
            console.error('Ошибка при получении книг:', xhr.statusText);
        }
    };
    xhr.onerror = function () {
        console.error('Ошибка сети');
    };
    xhr.send();
}

// Отображение книг на странице
function displayBooks(books) {
    const bookList = document.querySelector('.book-list');
    bookList.innerHTML = ''; // Очистка списка перед добавлением

    books.forEach(book => {
        const bookCard = document.createElement('div');
        bookCard.className = 'book-card';
        bookCard.innerHTML = `
            <img src="images/untilherlastbreath200x284.jpg" alt="${book.title}">
            <h3>${book.title}</h3>
            <p>Автор: ${book.author}</p>
            <p>Цена: ${book.price} руб.</p>
            <button onclick="addToCart(${book.id})">Добавить в корзину</button>
            <button onclick="deleteBook(${book.id})">Удалить</button>
        `;
        bookList.appendChild(bookCard);
    });
}

// Добавление новой книги
function addBook() {
    const newBook = {
        title: "Новая книга",
        author: "Автор книги",
        price: 700
    };

    const xhr = new XMLHttpRequest();
    xhr.open('POST', apiUrl, true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onload = function () {
        if (xhr.status === 201) {
            getBooks(); // Обновление списка книг
        } else {
            console.error('Ошибка при добавлении книги:', xhr.statusText);
        }
    };
    xhr.onerror = function () {
        console.error('Ошибка сети');
    };
    xhr.send(JSON.stringify(newBook));
}

// Удаление книги
function deleteBook(bookId) {
    const xhr = new XMLHttpRequest();
    xhr.open('DELETE', `${apiUrl}/${bookId}`, true);
    xhr.onload = function () {
        if (xhr.status === 204) {
            getBooks(); // Обновление списка книг
        } else {
            console.error('Ошибка при удалении книги:', xhr.statusText);
        }
    };
    xhr.onerror = function () {
        console.error('Ошибка сети');
    };
    xhr.send();
}

// Добавление книги в корзину (функция заглушка)
function addToCart(bookId) {
    alert(`Книга с ID ${bookId} добавлена в корзину!`);
}

// Инициализация
document.addEventListener('DOMContentLoaded', function () {
    getBooks(); // Получение списка книг при загрузке страницы
});