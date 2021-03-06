CREATE DATABASE gdbr;
Use gdbr;
CREATE TABLE IF NOT EXISTS administradores (
id_administrador INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
login_administrador VARCHAR(50) NOT NULL, 
senha_administrador VARCHAR(50) NOT NULL, 
email_administrador VARCHAR(100) NOT NULL, 
PRIMARY KEY (id_administrador)
);

CREATE TABLE IF NOT EXISTS postagens (
id_postagem INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
titulo_postagem VARCHAR(300) NOT NULL,
texto_postagem VARCHAR(5000) NOT NULL,
caminho_imagem_postagem VARCHAR(100) NOT NULL,
criado_em_postagem DATE NOT NULL,
administrador_id INTEGER UNSIGNED NOT NULL,
PRIMARY KEY (id_postagem),
FOREIGN KEY (administrador_id) REFERENCES administradores(id_administrador)
);

CREATE TABLE IF NOT EXISTS contatos (
id_contato INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
nome_contato VARCHAR(50) NOT NULL,
email_contato VARCHAR(100), 
telefone_contato VARCHAR(15), 
celular_contato VARCHAR(15), 
mensagem_contato VARCHAR(255) NOT NULL,
PRIMARY KEY (id_contato)
);
