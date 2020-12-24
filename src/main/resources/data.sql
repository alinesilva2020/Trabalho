DROP TABLE IF EXISTS livros;
CREATE TABLE Livros (
   id INTEGER PRIMARY KEY AUTO_INCREMENT,
   titulo VARCHAR(50) NOT NULL,
   descricao VARCHAR(1000),
   referencia VARCHAR(1000) NOT NULL,
   cadastro DATE NOT NULL
);

INSERT INTO Livros(titulo,descricao,referencia,cadastro)
VALUES('La Casa de Papel','Livro baseado na serie espanhola La...','123456','2020-12-20'),
('A Formiguinha e a Neve','Minha literatura infantil favorita','654321','2020-12-20'),
('Cronicas de natal','Sempre vai bem uma historia de Natal','246','2020-12-20');