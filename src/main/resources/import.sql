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

-- =================================================================
-- TABELA: ESTOQUE (NOVO BLOCO - 33 ENTRADAS)
-- 1 entrada de estoque para cada 1 jogo.
-- =================================================================
INSERT INTO estoque (quantidade) VALUES (15); -- id 1
INSERT INTO estoque (quantidade) VALUES (25); -- id 2
INSERT INTO estoque (quantidade) VALUES (30); -- id 3
INSERT INTO estoque (quantidade) VALUES (50); -- id 4
INSERT INTO estoque (quantidade) VALUES (40); -- id 5
INSERT INTO estoque (quantidade) VALUES (35); -- id 6
INSERT INTO estoque (quantidade) VALUES (60); -- id 7
INSERT INTO estoque (quantidade) VALUES (20); -- id 8
INSERT INTO estoque (quantidade) VALUES (70); -- id 9
INSERT INTO estoque (quantidade) VALUES (45); -- id 10
INSERT INTO estoque (quantidade) VALUES (10); -- id 11
INSERT INTO estoque (quantidade) VALUES (100);-- id 12
INSERT INTO estoque (quantidade) VALUES (55); -- id 13
INSERT INTO estoque (quantidade) VALUES (25); -- id 14
INSERT INTO estoque (quantidade) VALUES (15); -- id 15
INSERT INTO estoque (quantidade) VALUES (10); -- id 16
INSERT INTO estoque (quantidade) VALUES (5);  -- id 17
INSERT INTO estoque (quantidade) VALUES (8);  -- id 18
INSERT INTO estoque (quantidade) VALUES (30); -- id 19
INSERT INTO estoque (quantidade) VALUES (20); -- id 20
INSERT INTO estoque (quantidade) VALUES (150);-- id 21
INSERT INTO estoque (quantidade) VALUES (80); -- id 22
INSERT INTO estoque (quantidade) VALUES (20); -- id 23
INSERT INTO estoque (quantidade) VALUES (40); -- id 24
INSERT INTO estoque (quantidade) VALUES (120);-- id 25
INSERT INTO estoque (quantidade) VALUES (30); -- id 26
INSERT INTO estoque (quantidade) VALUES (22); -- id 27
INSERT INTO estoque (quantidade) VALUES (40); -- id 28
INSERT INTO estoque (quantidade) VALUES (90); -- id 29
INSERT INTO estoque (quantidade) VALUES (35); -- id 30
INSERT INTO estoque (quantidade) VALUES (45); -- id 31
INSERT INTO estoque (quantidade) VALUES (65); -- id 32
INSERT INTO estoque (quantidade) VALUES (5);  -- id 33

-- =========================
-- TABELA: MÍDIA
-- =========================
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Nintendo', 'Single Player');       -- id = 1
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Nintendo', 'Multiplayer');         -- id = 2
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Sony', 'Single Player');           -- id = 3
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Microsoft', 'Single Player');      -- id = 4
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Microsoft', 'Multiplayer');        -- id = 5
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Multiplataforma', 'Single Player'); -- id = 6
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Multiplataforma', 'Multiplayer');  -- id = 7
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('EA Sports', 'Multiplayer');        -- id = 8
INSERT INTO midia (desenvolvedora, modoJogo) VALUES ('Ubisoft', 'Single Player');        -- id = 9

-- =========================
-- SUBCLASSES (MÍDIA)
-- =========================
INSERT INTO disco (id) VALUES (3);    -- FK para midia.id = 3
INSERT INTO cartucho (id) VALUES (1); -- FK para midia.id = 1
INSERT INTO cartucho (id) VALUES (2); -- FK para midia.id = 2
INSERT INTO disco (id) VALUES (4);    -- FK midia.id = 4
INSERT INTO disco (id) VALUES (5);    -- FK midia.id = 5
INSERT INTO disco (id) VALUES (6);    -- FK midia.id = 6
INSERT INTO disco (id) VALUES (7);    -- FK midia.id = 7
INSERT INTO disco (id) VALUES (8);    -- FK midia.id = 8
INSERT INTO disco (id) VALUES (9);    -- FK midia.id = 9

-- =================================================================
-- BLOCO 1: TABELA JOGO (TODOS OS 33 JOGOS)
-- 'jogoEstoque_id' agora aponta para o ID de estoque correspondente (1-33)
-- =================================================================

-- Jogo ID: 1 (Original)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('The Legend of Zelda: Tears of the Kingdom', 'Aventura', 349.90, 1, 1, 1, 1);

-- Jogo ID: 2 (Original)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('God of War: Ragnarök', 'Ação/Aventura', 299.90, 4, 4, 2, 3);

-- Jogo ID: 3 (Original)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Pokémon Scarlet', 'RPG/Aventura', 299.90, 14, 1, 3, 2);

-- Jogo ID: 4 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Final Fantasy VII Rebirth', 'RPG', 349.90, 2, 5, 4, 3);

-- Jogo ID: 5 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Halo Infinite', 'FPS', 249.90, 5, 5, 5, 5);

-- Jogo ID: 6 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Assassin''s Creed Valhalla', 'RPG de Ação', 199.90, 6, 6, 6, 9);

-- Jogo ID: 7 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Elden Ring', 'RPG de Ação', 299.90, 9, 5, 7, 6);

-- Jogo ID: 8 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Mortal Kombat 1', 'Luta', 279.90, 13, 6, 8, 7);

-- Jogo ID: 9 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Super Mario Bros. Wonder', 'Plataforma', 299.90, NULL, 1, 9, 2);

-- Jogo ID: 10 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Resident Evil 4 (Remake)', 'Survival Horror', 249.90, 3, 6, 10, 6);

-- Jogo ID: 11 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Uncharted: Legacy of Thieves Collection', 'Ação/Aventura', 249.50, 7, 5, 11, 3);

-- Jogo ID: 12 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('The Elder Scrolls V: Skyrim', 'RPG', 149.90, 10, 6, 12, 6);

-- Jogo ID: 13 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Diablo IV', 'RPG de Ação (ARPG)', 319.00, 11, 6, 13, 7);

-- Jogo ID: 14 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Street Fighter 6', 'Luta', 279.99, 12, 4, 14, 7);

-- Jogo ID: 15 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Metroid Prime Remastered', 'Ação/Aventura (FPS)', 249.90, 15, 3, 15, 1);

-- Jogo ID: 16 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Dragon Quest XI S', 'RPG', 199.90, 16, 3, 16, 6);

-- Jogo ID: 17 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Kingdom Hearts III', 'RPG de Ação', 129.90, 17, 2, 17, 6);

-- Jogo ID: 18 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Metal Gear Solid V: The Phantom Pain', 'Stealth/Ação', 99.90, 18, 6, 18, 6);

-- Jogo ID: 19 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Crash Bandicoot N. Sane Trilogy', 'Plataforma', 149.90, 19, 1, 19, 6);

-- Jogo ID: 20 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Sonic Frontiers', 'Plataforma/Aventura', 299.90, 20, 2, 20, 6);

-- Jogo ID: 21 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('EA Sports FC 24', 'Esporte', 249.00, NULL, 1, 21, 8);

-- Jogo ID: 22 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Call of Duty: Modern Warfare III', 'FPS', 329.00, NULL, 6, 22, 7);

-- Jogo ID: 23 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Need for Speed Unbound', 'Corrida', 299.00, NULL, 3, 23, 7);

-- Jogo ID: 24 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Mass Effect Legendary Edition', 'RPG/Ação', 249.90, 8, 5, 24, 6);

-- Jogo ID: 25 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('The Legend of Zelda: Breath of the Wild', 'Aventura', 299.90, 1, 2, 25, 1);

-- Jogo ID: 26 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Final Fantasy XVI', 'RPG de Ação', 349.90, 2, 5, 26, 3);

-- Jogo ID: 27 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Dark Souls III', 'RPG de Ação', 179.90, 9, 5, 27, 6);

-- Jogo ID: 28 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Pokémon Legends: Arceus', 'RPG/Aventura', 299.90, 14, 2, 28, 1);

-- Jogo ID: 29 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('God of War (2018)', 'Ação/Aventura', 99.90, 4, 6, 29, 3);

-- Jogo ID: 30 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Assassin''s Creed Odyssey', 'RPG de Ação', 149.90, 6, 6, 30, 9);

-- Jogo ID: 31 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Resident Evil Village', 'Survival Horror', 229.90, 3, 6, 31, 6);

-- Jogo ID: 32 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Super Mario Odyssey', 'Plataforma 3D', 299.90, NULL, 1, 32, 1);

-- Jogo ID: 33 (Novo)
INSERT INTO jogo (titulo, genero, precoUnit, Jogo_saga, jogoClassificacao_id, jogoEstoque_id, jogoMidia_id)
VALUES ('Halo 3', 'FPS', 49.90, 5, 5, 33, 5);


-- =================================================================
-- BLOCO 2: RELACIONAMENTO: JOGO ↔ PLATAFORMA (TODOS OS 33 JOGOS)
-- =================================================================

-- Jogo ID 1 (Original)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (1, 7);

-- Jogo ID 2 (Original)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (2, 16);

-- Jogo ID 3 (Original)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (3, 7);

-- Jogo ID 4 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (4, 16); 

-- Jogo ID 5 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (5, 22); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (5, 24); 

-- Jogo ID 6 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (6, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (6, 22); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (6, 24); 

-- Jogo ID 7 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (7, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (7, 22); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (7, 24); 

-- Jogo ID 8 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (8, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (8, 7);  
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (8, 24); 

-- Jogo ID 9 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (9, 7); 

-- Jogo ID 10 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (10, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (10, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (10, 22); 

-- Jogo ID 11 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (11, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (11, 24); 

-- Jogo ID 12 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (12, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (12, 21); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (12, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (12, 7);  

-- Jogo ID 13 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (13, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (13, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (13, 22); 

-- Jogo ID 14 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (14, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (14, 24); 

-- Jogo ID 15 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (15, 7); 

-- Jogo ID 16 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (16, 7);  
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (16, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (16, 24); 

-- Jogo ID 17 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (17, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (17, 21); 

-- Jogo ID 18 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (18, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (18, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (18, 21); 

-- Jogo ID 19 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (19, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (19, 7);  
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (19, 24); 

-- Jogo ID 20 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (20, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (20, 7);  
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (20, 24); 

-- Jogo ID 21 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (21, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (21, 22); 

-- Jogo ID 22 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (22, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (22, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (22, 22); 

-- Jogo ID 23 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (23, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (23, 16); 

-- Jogo ID 24 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (24, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (24, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (24, 21); 

-- Jogo ID 25 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (25, 7); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (25, 6); 

-- Jogo ID 26 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (26, 16); 

-- Jogo ID 27 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (27, 24); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (27, 15); 

-- Jogo ID 28 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (28, 7); 

-- Jogo ID 29 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (29, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (29, 24); 

-- Jogo ID 30 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (30, 15); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (30, 21); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (30, 24); 

-- Jogo ID 31 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (31, 16); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (31, 22); 
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (31, 24); 

-- Jogo ID 32 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (32, 7); 

-- Jogo ID 33 (Novo)
INSERT INTO jogo_plataforma (jogo_id, plataforma_id) VALUES (33, 20);


INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Palmas','TO');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Araguaína','TO');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Goiânia','GO');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Anápolis','GO');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Cuiabá','MT');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Rondonópolis','MT');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Campo Grande','MS');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Dourados','MS');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Porto Alegre','RS');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Caxias do Sul','RS');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Florianópolis','SC');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Joinville','SC');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Curitiba','PR');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Londrina','PR');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('São Paulo','SP');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Campinas','SP');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Rio de Janeiro','RJ');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Niterói','RJ');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Belo Horizonte','MG');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Uberlândia','MG');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Vitória','ES');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Vila Velha','ES');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Salvador','BA');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Feira de Santana','BA');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Aracaju','SE');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Lagarto','SE');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Recife','PE');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Caruaru','PE');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Fortaleza','CE');
INSERT INTO municipio(nome,estadoMunicipio) VALUES ('Juazeiro do Norte','CE');

INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua A','10','77023388',1);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua B','20','77010000',2);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Goiás','300','74000000',3);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Central','150','75000000',4);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Brasil','500','78000000',5);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua das Flores','12','78700000',6);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Verde','45','79000000',7);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Azul','88','79800000',8);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua da Serra','100','90000000',9);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Bento','999','95000000',10);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua das Palmeiras','30','88000000',11);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Travessa Sul','22','89200000',12);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Paraná','55','80000000',13);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Brasil','19','86000000',14);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Augusta','1000','01000000',15);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua das Orquídeas','78','13000000',16);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Copacabana','222','20000000',17);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Quintino','14','24000000',18);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Minas Gerais','300','30000000',19);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Uber','50','38400000',20);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Vitória','44','29000000',21);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Vila','221','29100000',22);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Bahia','120','40000000',23);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Feirante','12','44000000',24);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Sergipe','65','49000000',25);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Lagarto','77','49400000',26);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua do Sol','13','50000000',27);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Caruaru','81','55000000',28);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Rua Ceará','59','60000000',29);
INSERT INTO endereco(logradouro,numero,cep,enderecoMunicipio_id) VALUES('Av Padre Cícero','18','63000000',30);

-- =========================
-- TABELA: MEIO_PAGAMENTO
-- =========================
INSERT INTO meioPagamento (nome) VALUES ('Cartão de Crédito');
INSERT INTO meioPagamento (nome) VALUES ('Cartão de Débito');
INSERT INTO meioPagamento (nome) VALUES ('Pix');