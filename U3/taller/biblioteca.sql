-- Crear la base de datos
CREATE DATABASE biblioteca;

-- Usar la base de datos
USE biblioteca;

-- Crear la tabla de autores
CREATE TABLE autores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL
);

-- Crear la tabla de libros
CREATE TABLE libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) UNIQUE NOT NULL,
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES autores(id)
);


-- Insertar datos en la tabla de autores
INSERT INTO autores (nombre, apellido) VALUES ('Gabriel', 'García Márquez');
INSERT INTO autores (nombre, apellido) VALUES ('Jane', 'Austen');
INSERT INTO autores (nombre, apellido) VALUES ('Mark', 'Twain');
INSERT INTO autores (nombre, apellido) VALUES ('Leo', 'Tolstoy');
INSERT INTO autores (nombre, apellido) VALUES ('Herman', 'Melville');
INSERT INTO autores (nombre, apellido) VALUES ('Charles', 'Dickens');
INSERT INTO autores (nombre, apellido) VALUES ('J.K.', 'Rowling');
INSERT INTO autores (nombre, apellido) VALUES ('George', 'Orwell');
INSERT INTO autores (nombre, apellido) VALUES ('J.R.R.', 'Tolkien');
INSERT INTO autores (nombre, apellido) VALUES ('F. Scott', 'Fitzgerald');
INSERT INTO autores (nombre, apellido) VALUES ('Ernest', 'Hemingway');
INSERT INTO autores (nombre, apellido) VALUES ('Virginia', 'Woolf');
INSERT INTO autores (nombre, apellido) VALUES ('William', 'Shakespeare');
INSERT INTO autores (nombre, apellido) VALUES ('Miguel de', 'Cervantes');
INSERT INTO autores (nombre, apellido) VALUES ('Franz', 'Kafka');
INSERT INTO autores (nombre, apellido) VALUES ('Victor', 'Hugo');
INSERT INTO autores (nombre, apellido) VALUES ('Fyodor', 'Dostoevsky');
INSERT INTO autores (nombre, apellido) VALUES ('Mary', 'Shelley');
INSERT INTO autores (nombre, apellido) VALUES ('Arthur Conan', 'Doyle');
INSERT INTO autores (nombre, apellido) VALUES ('Agatha', 'Christie');
INSERT INTO autores (nombre, apellido) VALUES ('H.G.', 'Wells');
INSERT INTO autores (nombre, apellido) VALUES ('Edgar Allan', 'Poe');
INSERT INTO autores (nombre, apellido) VALUES ('Oscar', 'Wilde');
INSERT INTO autores (nombre, apellido) VALUES ('Jules', 'Verne');
INSERT INTO autores (nombre, apellido) VALUES ('Emily', 'Bronte');
INSERT INTO autores (nombre, apellido) VALUES ('Lewis', 'Carroll');
INSERT INTO autores (nombre, apellido) VALUES ('Jonathan', 'Swift');
INSERT INTO autores (nombre, apellido) VALUES ('James', 'Joyce');
INSERT INTO autores (nombre, apellido) VALUES ('Dante', 'Alighieri');
INSERT INTO autores (nombre, apellido) VALUES ('Homer', '');
INSERT INTO autores (nombre, apellido) VALUES ('Virgil', '');
INSERT INTO autores (nombre, apellido) VALUES ('Homer', 'Simpson'); -- Ejemplo ficticio humorístico
INSERT INTO autores (nombre, apellido) VALUES ('George R.R.', 'Martin');
INSERT INTO autores (nombre, apellido) VALUES ('Stephen', 'King');
INSERT INTO autores (nombre, apellido) VALUES ('Isaac', 'Asimov');
INSERT INTO autores (nombre, apellido) VALUES ('Aldous', 'Huxley');
INSERT INTO autores (nombre, apellido) VALUES ('J.D.', 'Salinger');
INSERT INTO autores (nombre, apellido) VALUES ('T.S.', 'Eliot');
INSERT INTO autores (nombre, apellido) VALUES ('Ray', 'Bradbury');
INSERT INTO autores (nombre, apellido) VALUES ('J.R.R.', 'Tolkien');
INSERT INTO autores (nombre, apellido) VALUES ('C.S.', 'Lewis');
INSERT INTO autores (nombre, apellido) VALUES ('Harper', 'Lee');
INSERT INTO autores (nombre, apellido) VALUES ('Margaret', 'Atwood');
INSERT INTO autores (nombre, apellido) VALUES ('Ursula K.', 'Le Guin');
INSERT INTO autores (nombre, apellido) VALUES ('George', 'Eliot');
INSERT INTO autores (nombre, apellido) VALUES ('Marcel', 'Proust');
INSERT INTO autores (nombre, apellido) VALUES ('Thomas', 'Mann');
INSERT INTO autores (nombre, apellido) VALUES ('Ralph', 'Ellison');
INSERT INTO autores (nombre, apellido) VALUES ('Vladimir', 'Nabokov');
INSERT INTO autores (nombre, apellido) VALUES ('Italo', 'Calvino');

-- Insertar datos en la tabla de libros
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Cien años de soledad', '978-3-16-148410-0', 1);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Orgullo y prejuicio', '978-0-19-283355-6', 2);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Las aventuras de Tom Sawyer', '978-1-56619-909-4', 3);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Guerra y paz', '978-0-679-64037-8', 4);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Moby Dick', '978-0-14-243724-7', 5);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Oliver Twist', '978-0-14-143974-7', 6);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Harry Potter y la piedra filosofal', '978-0-7475-3269-9', 7);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('1984', '978-0-452-28423-4', 8);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('El Hobbit', '978-0-618-00221-3', 9);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('El gran Gatsby', '978-0-7432-7356-5', 10);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('El viejo y el mar', '978-0-684-80122-3', 11);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('La señora Dalloway', '978-0-15-662870-9', 12);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Hamlet', '978-0-486-27557-1', 13);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Don Quijote de la Mancha', '978-0-06-093434-7', 14);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('La metamorfosis', '978-0-7432-1552-8', 15);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Los miserables', '978-0-14-044430-8', 16);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Crimen y castigo', '978-0-14-044913-6', 17);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Frankenstein', '978-0-14-143947-1', 18);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Sherlock Holmes: Estudio en escarlata', '978-0-486-26737-8', 19);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Asesinato en el Orient Express', '978-0-06-207350-1', 20);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('La máquina del tiempo', '978-0-8129-7414-1', 21);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('El cuervo y otros poemas', '978-0-486-43541-8', 22);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('El retrato de Dorian Gray', '978-0-14-143957-0', 23);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Viaje al centro de la Tierra', '978-0-451-52798-9', 24);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Cumbres Borrascosas', '978-0-14-143955-6', 25);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Alicia en el País de las Maravillas', '978-0-14-143976-1', 26);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Los viajes de Gulliver', '978-0-14-143949-5', 27);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Ulises', '978-0-394-74747-3', 28);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('La Divina Comedia', '978-0-14-044895-5', 29);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('La Ilíada', '978-0-14-027536-0', 30);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('La Eneida', '978-0-14-044051-5', 31);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('La Odisea', '978-0-14-026886-7', 30);
INSERT INTO libros (titulo, isbn, autor_id) VALUES ('Juego de Tronos', '978-0-553-10354-0', 32);
