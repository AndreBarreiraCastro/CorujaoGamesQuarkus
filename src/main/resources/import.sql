insert into colecao (nomeColecao) values ('Coleção FIFA');
insert into colecao (nomeColecao) values ( 'Coleção Call of Duty');
insert into colecao (nomeColecao) values ( 'Coleção Mario Bros');
insert into colecao (nomeColecao) values ( 'Coleção The Legend of Zelda');
insert into colecao (nomeColecao) values ( 'Coleção Final Fantasy');
insert into colecao (nomeColecao) values ( 'Coleção Need for Speed');
insert into colecao (nomeColecao) values ( 'Coleção Resid_colecaoent Evil');
insert into colecao (nomeColecao) values ( 'Coleção Mortal Kombat');
insert into colecao (nomeColecao) values ( 'Coleção Assassin''s Creed');
insert into colecao (nomeColecao) values ( 'Coleção Pokémon');

INSERT INTO saga (nomeSaga) VALUES ('The Legend of Zelda');
INSERT INTO saga (nomeSaga) VALUES ('Final Fantasy');
INSERT INTO saga (nomeSaga) VALUES ('Resident Evil');
INSERT INTO saga (nomeSaga) VALUES ('God of War');
INSERT INTO saga (nomeSaga) VALUES ('Halo');
INSERT INTO saga (nomeSaga) VALUES ('Assassin''s Creed');
INSERT INTO saga (nomeSaga) VALUES ('Uncharted');
INSERT INTO saga (nomeSaga) VALUES ('Mass Effect');
INSERT INTO saga (nomeSaga) VALUES ('Dark Souls');
INSERT INTO saga (nomeSaga) VALUES ('Elder Scrolls');
INSERT INTO saga (nomeSaga) VALUES ('Diablo');
INSERT INTO saga (nomeSaga) VALUES ('Street Fighter');
INSERT INTO saga (nomeSaga) VALUES ('Mortal Kombat');
INSERT INTO saga (nomeSaga) VALUES ('Pokemon');
INSERT INTO saga (nomeSaga) VALUES ('Metroid');
INSERT INTO saga (nomeSaga) VALUES ('Dragon Quest');
INSERT INTO saga (nomeSaga) VALUES ('Kingdom Hearts');
INSERT INTO saga (nomeSaga) VALUES ('Metal Gear Solid');
INSERT INTO saga (nomeSaga) VALUES ('Crash Bandicoot');
INSERT INTO saga (nomeSaga) VALUES ('Sonic the Hedgehog');

INSERT INTO plataforma (nomePlataforma) VALUES ('Nintendo Entertainment System (NES)');
INSERT INTO plataforma (nomePlataforma) VALUES ('Super Nintendo Entertainment System (SNES)');
INSERT INTO plataforma (nomePlataforma) VALUES ('Nintendo 64');
INSERT INTO plataforma (nomePlataforma) VALUES ('GameCube');
INSERT INTO plataforma (nomePlataforma) VALUES ('Wii');
INSERT INTO plataforma (nomePlataforma) VALUES ('Wii U');
INSERT INTO plataforma (nomePlataforma) VALUES ('Nintendo Switch');
INSERT INTO plataforma (nomePlataforma) VALUES ('Game Boy');
INSERT INTO plataforma (nomePlataforma) VALUES ('Game Boy Advance');
INSERT INTO plataforma (nomePlataforma) VALUES ('Nintendo DS');
INSERT INTO plataforma (nomePlataforma) VALUES ('Nintendo 3DS');

INSERT INTO plataforma (nomePlataforma) VALUES ('PlayStation 1');
INSERT INTO plataforma (nomePlataforma) VALUES ('PlayStation 2');
INSERT INTO plataforma (nomePlataforma) VALUES ('PlayStation 3');
INSERT INTO plataforma (nomePlataforma) VALUES ('PlayStation 4');
INSERT INTO plataforma (nomePlataforma) VALUES ('PlayStation 5');
INSERT INTO plataforma (nomePlataforma) VALUES ('PlayStation Portable (PSP)');
INSERT INTO plataforma (nomePlataforma) VALUES ('PlayStation Vita');

INSERT INTO plataforma (nomePlataforma) VALUES ('Xbox');
INSERT INTO plataforma (nomePlataforma) VALUES ('Xbox 360');
INSERT INTO plataforma (nomePlataforma) VALUES ('Xbox One');
INSERT INTO plataforma (nomePlataforma) VALUES ('Xbox Series X');
INSERT INTO plataforma (nomePlataforma) VALUES ('Xbox Series S');

INSERT INTO plataforma (nomePlataforma) VALUES ('PC');
INSERT INTO plataforma (nomePlataforma) VALUES ('Steam Deck');
INSERT INTO plataforma (nomePlataforma) VALUES ('Atari 2600');
INSERT INTO plataforma (nomePlataforma) VALUES ('Sega Master System');
INSERT INTO plataforma (nomePlataforma) VALUES ('Sega Genesis / Mega Drive');
INSERT INTO plataforma (nomePlataforma) VALUES ('Sega Saturn');
INSERT INTO plataforma (nomePlataforma) VALUES ('Dreamcast');
INSERT INTO plataforma (nomePlataforma) VALUES ('Dreamcast');

INSERT INTO classificacao (idademinima, descricao) VALUES (0, 'Livre para todos os públicos');
INSERT INTO classificacao (idademinima, descricao) VALUES (10, 'Não recomendado para menores de 10 anos');
INSERT INTO classificacao (idademinima, descricao) VALUES (12, 'Não recomendado para menores de 12 anos');
INSERT INTO classificacao (idademinima, descricao) VALUES (14, 'Não recomendado para menores de 14 anos');
INSERT INTO classificacao (idademinima, descricao) VALUES (16, 'Não recomendado para menores de 16 anos');
INSERT INTO classificacao (idademinima, descricao) VALUES (18, 'Não recomendado para menores de 18 anos');


INSERT INTO estoque (quantidade) VALUES (5);
INSERT INTO estoque (quantidade) VALUES (10);
INSERT INTO estoque (quantidade) VALUES (20);
INSERT INTO estoque (quantidade) VALUES (50);
INSERT INTO estoque (quantidade) VALUES (100);
INSERT INTO estoque (quantidade) VALUES (200);
INSERT INTO estoque (quantidade) VALUES (500);
INSERT INTO estoque (quantidade) VALUES (500);
INSERT INTO estoque (quantidade) VALUES (500);
INSERT INTO estoque (quantidade) VALUES (500);
INSERT INTO estoque (quantidade) VALUES (500);
INSERT INTO estoque (quantidade) VALUES (500);

-- =========================
-- Populando a tabela Midia
-- =========================

-- Midias genéricas (os IDs serão herdados pelas subclasses)
INSERT INTO midia ( desenvolvedora, modoJogo) VALUES ( 'Nintendo', 'Single Player');
INSERT INTO midia ( desenvolvedora, modoJogo) VALUES ( 'Nintendo', 'Multiplayer');
INSERT INTO midia ( desenvolvedora, modoJogo) VALUES ('Sony', 'Single Player');

-- =========================
-- Populando a tabela Disco (subclasse de Midia)
-- =========================
INSERT INTO disco (id) VALUES (3); -- FK para midia.id = 3

-- =========================
-- Populando a tabela Cartucho (subclasse de Midia)
-- =========================
INSERT INTO cartucho (id) VALUES (1); -- FK para midia.id = 1
INSERT INTO cartucho (id) VALUES (2); -- FK para midia.id = 2