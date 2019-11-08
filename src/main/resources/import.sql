insert into tb_cozinha (nome) values ('Brasielira');
insert into tb_cozinha (nome) values ('Japonesa');

insert into tb_restaurante (nome, taxa_frete, cozinha_id) values ('Sugoi', 20.1, 2);
insert into tb_restaurante (nome, taxa_frete, cozinha_id) values ('Matsuri', 20.1, 2);
insert into tb_restaurante (nome, taxa_frete, cozinha_id) values ('Feijuca', 20.1, 1);

insert into tb_forma_pagamento (descricao) values ('Cartão de crédito');
insert into tb_forma_pagamento (descricao) values ('Cartão de débito');
insert into tb_forma_pagamento (descricao) values ('Dinheiro');
insert into tb_forma_pagamento (descricao) values ('PicPay');

insert into tb_permissao (nome, descricao) values ('Inserir', 'Permissão para inserir');
insert into tb_permissao (nome, descricao) values ('Deletar', 'Permissão para deletar');
insert into tb_permissao (nome, descricao) values ('Visualizar', 'Permissão para visualizar');

insert into tb_estado (id, nome) values (1, 'PR');
insert into tb_estado (id, nome) values (2, 'SC');
insert into tb_estado (id, nome) values (3, 'RS');
insert into tb_estado (id, nome) values (4, 'SP');
insert into tb_estado (id, nome) values (5, 'RN');
insert into tb_estado (id, nome) values (6, 'MG');

insert into tb_cidade (nome, estado_id) values ('Londrina', 1);
insert into tb_cidade (nome, estado_id) values ('Arapongas', 1);
insert into tb_cidade (nome, estado_id) values ('São Paulo', 4);
