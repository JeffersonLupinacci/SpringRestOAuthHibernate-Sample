CREATE TABLE pessoas (
  codigo BIGINT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(120) NOT NULL,
  ativo TINYINT NOT NULL,
  logradouro VARCHAR(90) NULL,
  numero VARCHAR(30) NULL,
  complemento VARCHAR(90) NULL,
  bairro VARCHAR(45) NULL,
  cep VARCHAR(20) NULL,
  cidade VARCHAR(45) NULL,
  estado VARCHAR(60) NULL) ENGINE = InnoDB DEFAULT CHARSET = utf8;  