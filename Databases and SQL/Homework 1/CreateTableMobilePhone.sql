CREATE TABLE IF NOT EXISTS MobilePhones 
	(Id SERIAL PRIMARY KEY, 
    ProductName VARCHAR(100) NOT NULL, 
    Manufacturer VARCHAR(100) NOT NULL, 
    ProductCount INT, 
    Price FLOAT);