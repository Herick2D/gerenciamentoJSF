INSERT INTO ramo_atividade (id, descricao) VALUES (1, 'Distribuição de alimentos');
INSERT INTO ramo_atividade (id, descricao) VALUES (2, 'Telecomunicações');
INSERT INTO ramo_atividade (id, descricao) VALUES (3, 'Vestuário');
INSERT INTO ramo_atividade (id, descricao) VALUES (4, 'Lavanderia');
INSERT INTO ramo_atividade (id, descricao) VALUES (5, 'Gráfica');
INSERT INTO ramo_atividade (id, descricao) VALUES (6, 'Mecânica');
INSERT INTO ramo_atividade (id, descricao) VALUES (7, 'Turismo');
INSERT INTO ramo_atividade (id, descricao) VALUES (8, 'Saúde');
INSERT INTO ramo_atividade (id, descricao) VALUES (9, 'Educação');
INSERT INTO ramo_atividade (id, descricao) VALUES (10, 'Lazer');

INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (1, '70.311.193/0001-87', 'Mercado do João', 'João Mercado e Distribuidor de Alimentos Ltda', 'LTDA', '2009-03-02', 1);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (2, '52.822.994/0001-25', 'Fale Mais', 'Fale Mais Telecom S.A', 'SA', '1997-12-10', 2);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (3, '41.952.519/0001-57', 'Maria de Souza da Silva', 'Maria de Souza da Silva', 'MEI', '2014-10-15', 3);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (4, '16.134.777/0001-89', 'Gomes Inovação', 'José Fernando Gomes EIRELI ME', 'EIRELI', '2009-03-02', 4);
-- Novas inserções de empresas com ramos existentes
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (15, '87.456.321/0001-09', 'Alimentos Express', 'Alimentos Express Distribuidora Ltda', 'LTDA', '2011-05-03', 1);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (16, '33.789.654/0001-12', 'TeleTech', 'TeleTech Soluções em Telecomunicações S.A', 'SA', '2006-08-22', 2);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (17, '98.231.765/0001-78', 'Fashion Plus', 'Fashion Plus Confecções Ltda', 'LTDA', '2013-11-19', 3);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (18, '22.567.890/0001-34', 'Lav Clean', 'Lav Clean Lavanderia Ltda', 'LTDA', '2007-07-07', 4);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (19, '77.123.456/0001-45', 'PrintMaster', 'PrintMaster Gráfica Rápida Ltda', 'LTDA', '2015-09-14', 5);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (20, '45.678.901/0001-56', 'Mecânica Rápida', 'Mecânica Rápida Automotiva Ltda', 'LTDA', '2012-12-30', 6);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (21, '12.345.678/0001-67', 'Turismo Aventura', 'Turismo Aventura Agência de Viagens Ltda', 'LTDA', '2009-04-25', 7);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (22, '55.432.109/0001-78', 'Clínica Vida Saudável', 'Clínica Vida Saudável Ltda', 'LTDA', '2014-03-08', 8);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (23, '21.987.654/0001-89', 'Escola Futuro Brilhante', 'Escola Futuro Brilhante Ltda', 'LTDA', '2010-10-17', 9);
INSERT INTO empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) VALUES (24, '88.567.234/0001-90', 'Diversão Total', 'Diversão Total Parque de Diversões Ltda', 'LTDA', '2017-07-02', 10);
