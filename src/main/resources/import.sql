-- =========================
-- TABELA: COLEÇÃO
-- =========================
INSERT INTO colecao (nomeColecao) VALUES ('Coleção FIFA');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Call of Duty');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Mario Bros');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção The Legend of Zelda');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Final Fantasy');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Need for Speed');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Resident Evil');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Mortal Kombat');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Assassin''s Creed');
INSERT INTO colecao (nomeColecao) VALUES ('Coleção Pokémon');

-- =========================
-- TABELA: SAGA
-- =========================
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
INSERT INTO saga (nomeSaga) VALUES ('Pokémon');
INSERT INTO saga (nomeSaga) VALUES ('Metroid');
INSERT INTO saga (nomeSaga) VALUES ('Dragon Quest');
INSERT INTO saga (nomeSaga) VALUES ('Kingdom Hearts');
INSERT INTO saga (nomeSaga) VALUES ('Metal Gear Solid');
INSERT INTO saga (nomeSaga) VALUES ('Crash Bandicoot');
INSERT INTO saga (nomeSaga) VALUES ('Sonic the Hedgehog');

-- =========================
-- TABELA: PLATAFORMA
-- =========================
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

-- =========================
-- TABELA: CLASSIFICAÇÃO
-- =========================
INSERT INTO classificacao (classificacao, descricao) VALUES (0, 'Livre para todos os públicos');
INSERT INTO classificacao (classificacao, descricao) VALUES (10, 'Não recomendado para menores de 10 anos');
INSERT INTO classificacao (classificacao, descricao) VALUES (12, 'Não recomendado para menores de 12 anos');
INSERT INTO classificacao (classificacao, descricao) VALUES (14, 'Não recomendado para menores de 14 anos');
INSERT INTO classificacao (classificacao, descricao) VALUES (16, 'Não recomendado para menores de 16 anos');
INSERT INTO classificacao (classificacao, descricao) VALUES (18, 'Não recomendado para menores de 18 anos');

-- =========================
-- TABELA: ESTOQUE
-- =========================
INSERT INTO estoque (quantidade) VALUES (5);
INSERT INTO estoque (quantidade) VALUES (10);
INSERT INTO estoque (quantidade) VALUES (20);
INSERT INTO estoque (quantidade) VALUES (50);
INSERT INTO estoque (quantidade) VALUES (100);
INSERT INTO estoque (quantidade) VALUES (200);
INSERT INTO estoque (quantidade) VALUES (500);

-- =========================
-- TABELA: MÍDIA
-- =========================
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Nintendo', 'Single Player');   -- id = 1
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Nintendo', 'Multiplayer');     -- id = 2
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Sony', 'Single Player');       -- id = 3

-- =========================
-- SUBCLASSES
-- =========================
INSERT INTO disco (id) VALUES (3);     -- FK para midia.id = 3
INSERT INTO cartucho (id) VALUES (1);  -- FK para midia.id = 1
INSERT INTO cartucho (id) VALUES (2);  -- FK para midia.id = 2

-- =========================
-- TABELA: JOGO
-- =========================
INSERT INTO jogo (titulo, genero, precoUnit, jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('The Legend of Zelda: Tears of the Kingdom', 'Aventura', 349.90, 1, 1, 1, 1);

INSERT INTO jogo (titulo, genero, precoUnit, jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('God of War: Ragnarök', 'Ação/Aventura', 299.90, 4, 4, 2, 3);

INSERT INTO jogo (titulo, genero, precoUnit, jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Pokémon Scarlet', 'RPG/Aventura', 299.90, 14, 1, 3, 2);

-- =========================
-- RELACIONAMENTO: JOGO ↔ PLATAFORMA
-- =========================
-- Zelda → Nintendo Switch
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (1, 7);

-- God of War → PlayStation 5
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (2, 15);

-- Pokémon → Nintendo Switch
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (3, 7);
