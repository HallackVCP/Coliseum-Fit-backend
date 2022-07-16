INSERT INTO tb_administradores (cpf,email,nome,telefone,senha,is_admin) VALUES ('12345678910','adm@email.com','ADM','32323232','123',true);

INSERT INTO tb_instrutores (cpf,email,nome,telefone,senha, administrador_id) VALUES ('12345678911', 'joao@email.com', 'Joao', '32323232', 'qwerty',1);

INSERT INTO tb_alunos (cpf,email,nome,telefone,senha, instrutor_id) VALUES ('12345678911', 'ze@email.com', 'Ze', '32323232', 'abcd',1);


INSERT INTO tb_alunos (cpf,email,nome,telefone,senha, instrutor_id) VALUES ('12345678912', 'couto@email.com', 'Couto', '32323232', 'abcd',1);

INSERT INTO tb_alunos (cpf,email,nome,telefone,senha, instrutor_id) VALUES ('12345678913', 'tintas@email.com', 'Tintas', '32323232', 'abcd',1);

INSERT INTO tb_alunos (cpf,email,nome,telefone,senha, instrutor_id) VALUES ('12345678914', 'itatiaia@email.com', 'Itatiaia', '32323232', 'abcd',1);
