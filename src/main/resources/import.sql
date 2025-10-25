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

-- Jogos
INSERT INTO jogo (titulo, genero, precoUnit, Classificacao_id, Estoque_id,Midia_id)
VALUES ('The Legend of Zelda: Breath of the Wild', 'Ação/Aventura', 299.90, 1, 1, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Final Fantasy VII Remake', 'RPG', 249.90, 1, 2, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Resident Evil 4 Remake', 'Terror/Ação', 279.90, 2, 3, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('God of War Ragnarök', 'Ação/Aventura', 349.90, 2, 4, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Halo Infinite', 'Tiro em Primeira Pessoa', 299.90, 2, 5, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Assassin''s Creed Valhalla', 'Ação/RPG', 279.90, 2, 6, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Dark Souls III', 'RPG/Ação', 199.90, 2, 7, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Diablo IV', 'RPG/Ação', 299.90, 2, 8, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Street Fighter 6', 'Luta', 259.90, 1, 9, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Pokémon Scarlet', 'RPG/Aventura', 299.90, 1, 10, 1);

-- Relações Jogo x Saga (jogo_saga)
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (1, 1);  -- Zelda
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (2, 2);  -- Final Fantasy
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (3, 3);  -- Resident Evil
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (4, 4);  -- God of War
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (5, 5);  -- Halo
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (6, 6);  -- Assassin's Creed
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (7, 9);  -- Dark Souls
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (8, 11); -- Diablo
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (9, 12); -- Street Fighter
INSERT INTO jogo_saga (jogo_id, saga_id) VALUES (10, 14);-- Pokémon
