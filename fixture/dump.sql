CREATE TABLE "Artikel" (
  "nr" integer,
  "name" text,
  "text" text,
  "bild" text,
  PRIMARY KEY (nr)
);

INSERT INTO  "Artikel" (
  "nr",
  "name",
  "text",
  "bild"
) VALUES
(1, 'Filzhasen', 'Beschreibungstext zu Filzhasen', 'hasen.png'),
(2, 'Filzschuhe', 'Beschreibungstext zu Filzschuhe', 'filzschuhe.jpg'),
(3, 'Handtasche', 'Beschreibungstext zu Handtasche', 'handtasche.jpg');
