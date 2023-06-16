-- 5. Добавьте новый столбец под названием «время до следующей станции». 

create table Stations
(
    train_id int,
    station varchar(20) not null,
    station_time time
);

INSERT INTO Stations (train_id, station, station_time) VALUES (110, 'San Francisco', '10:00:00');
INSERT INTO Stations (train_id, station, station_time) VALUES (110, 'Redwood City', '10:54:00');
INSERT INTO Stations (train_id, station, station_time) VALUES (110, 'Palo Alto', '11:02:00');
INSERT INTO Stations (train_id, station, station_time) VALUES (110, 'San Jose', '12:35:00');
INSERT INTO Stations (train_id, station, station_time) VALUES (120, 'San Francisco', '11:00:00');
INSERT INTO Stations (train_id, station, station_time) VALUES (120, 'Palo Alto', '12:49:00');
INSERT INTO Stations (train_id, station, station_time) VALUES (120, 'San Jose', '13:30:00');

SET SQL_SAFE_UPDATES = 0;

Alter table Stations add column time_to_next_station time;

Create temporary table Time_to_next_station as 
select train_id, station, TIMEDIFF(lead(station_time) over (partition by train_id order by station_time), station_time) as time_to_next_station
from Stations;

Update Stations s
join Time_to_next_station t on s.train_id = t.train_id and s.station = t.station
SET s.time_to_next_station = t.time_to_next_station;