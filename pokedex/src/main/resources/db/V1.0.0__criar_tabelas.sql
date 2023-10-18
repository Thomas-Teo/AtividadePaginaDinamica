CREATE TABLE pokemon {
    id_pokemon BIGINT IDENTITY PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    habilidade VARCHAR(80) NOT NULL,
    movimento VARCHAR(80) NOT NULL,
    vida INTEGER NOT NULL,
    ataque INTEGER NOT NULL,
    defesa INTEGER NOT NULL,
    velocidade INTEGER NOT NULL,
    tipo VARCHAR(20) NOT NULL
}