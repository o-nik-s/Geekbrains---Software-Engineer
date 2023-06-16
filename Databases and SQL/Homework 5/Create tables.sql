create table Cars
(
    Id    int auto_increment primary key,
    Name varchar(255) not null,
    Cost  int not null
);

INSERT INTO Cars (Id, Name, Cost) VALUES (1, 'Audi', 52642);
INSERT INTO Cars (Id, Name, Cost) VALUES (2, 'Mercedes', 57127);
INSERT INTO Cars (Id, Name, Cost) VALUES (3, 'Skoda', 9000);
INSERT INTO Cars (Id, Name, Cost) VALUES (4, 'Volvo', 29000);
INSERT INTO Cars (Id, Name, Cost) VALUES (5, 'Bentley', 350000);
INSERT INTO Cars (Id, Name, Cost) VALUES (6, 'Citroen', 21000);
INSERT INTO Cars (Id, Name, Cost) VALUES (7, 'Hummer', 41400);
INSERT INTO Cars (Id, Name, Cost) VALUES (8, 'Volkswagen', 21600);
