SELECT * FROM quiztable where sporgsmaal LIKE "%hedder%"

SELECT * FROM quiztable ORDER BY svar DESC LIMIT 2

UPDATE quiztable set sporgsmaal = "Hvem er programming wiz på EASJ?" where svar = "András"

INSERT INTO quiztable (sporgsmaal, svar) VALUES ("Hvem har initialerne TGH?", "Tommy")

DELETE FROM quiztable WHERE svar like "to%"
