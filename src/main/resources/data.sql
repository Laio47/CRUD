
DROP TABLE IF EXISTS livro;

CREATE TABLE livro (
	id INT PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(50) ,
	descricao VARCHAR(50),
	referencia VARCHAR(50),
	datacadastro DATE
);

INSERT INTO livro (titulo, descricao, referencia, datacadastro)
VALUES ('cravo', 'tyhery', 'referf', CURRENT_DATE()),
	   ('rosa', 'erteerer', 'fghdd',  '2020-10-13')  	   ;	   