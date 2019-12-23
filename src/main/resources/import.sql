insert into tb_cozinha (nome) values ('Brasielira');
insert into tb_cozinha (nome) values ('Japonesa');

insert into tb_estado (id, nome) values (1, 'PR');
insert into tb_estado (id, nome) values (2, 'SC');
insert into tb_estado (id, nome) values (3, 'RS');
insert into tb_estado (id, nome) values (4, 'SP');
insert into tb_estado (id, nome) values (5, 'RN');
insert into tb_estado (id, nome) values (6, 'MG');

insert into tb_cidade (nome, estado_id) values ('Londrina', 1);
insert into tb_cidade (nome, estado_id) values ('Arapongas', 1);
insert into tb_cidade (nome, estado_id) values ('São Paulo', 4);

INSERT INTO tb_restaurante(endereco_bairro, endereco_cep, endereco_complemento, endereco_logradouro, endereco_numero, nome, taxa_frete, cozinha_id, endereco_cidade_id, data_cadastro, data_atualizacao) VALUES ('Colina Verde', '86050610', NULL, 'Rua flor da primavera', '550', 'Sugoi', 19.2, 2, 1, utc_timestamp, utc_timestamp);
insert into tb_restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values ('Matsuri', 20.1, 2, utc_timestamp, utc_timestamp);
insert into tb_restaurante (nome, taxa_frete, cozinha_id, data_cadastro, data_atualizacao) values ('Feijuca', 20.1, 1, utc_timestamp, utc_timestamp);

INSERT INTO tb_produto(ativo, descricao, nome, preco, restaurante_id) VALUES (true, 'Feijoada simples', 'Feijoada', 19.90, 3);
INSERT INTO tb_produto(ativo, descricao, nome, preco, restaurante_id) VALUES (true, 'Feijoada dupla', 'Feijoada', 23.90, 3);
INSERT INTO tb_produto(ativo, descricao, nome, preco, restaurante_id) VALUES (true, 'Frango empanado com ervilhas', 'Frango empanado', 16.90, 3);
INSERT INTO tb_produto(ativo, descricao, nome, preco, restaurante_id) VALUES (true, 'Frango grelhado com legumes', 'Frango grelhado', 16.90, 3);


insert into tb_forma_pagamento (descricao) values ('Cartão de crédito');
insert into tb_forma_pagamento (descricao) values ('Cartão de débito');
insert into tb_forma_pagamento (descricao) values ('Dinheiro');
insert into tb_forma_pagamento (descricao) values ('PicPay');

insert into tb_permissao (nome, descricao) values ('Inserir', 'Permissão para inserir');
insert into tb_permissao (nome, descricao) values ('Deletar', 'Permissão para deletar');
insert into tb_permissao (nome, descricao) values ('Visualizar', 'Permissão para visualizar');

insert into tb_restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (1, 1);
insert into tb_restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (1, 2);
insert into tb_restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (1, 3);
insert into tb_restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (2, 1);
insert into tb_restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (2, 2);
insert into tb_restaurante_forma_pagamento(restaurante_id, forma_pagamento_id) values (3, 1);
