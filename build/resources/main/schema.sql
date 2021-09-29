CREATE TABLE product (
	product_Id			INTEGER PRIMARY KEY, 
	name				VARCHAR(32), 
	upc					INTEGER, 
	stock				INTEGER, 
	low_Stock_Amount	INTEGER, 
	cost				FLOAT(32), 
	msrp				FLOAT(32), 
	provider			VARCHAR(32));