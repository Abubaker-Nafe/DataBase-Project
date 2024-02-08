/* 

Online Shoppnig Database
project2

*/
use project2;
show tables;


CREATE TABLE IF NOT EXISTS Customer( #email/name must be unique (cascade)
    Customer_ID INT NOT NULL AUTO_INCREMENT,
    Customer_Name VARCHAR(32) not null,
    Customer_Password VARCHAR(50),
    Age VARCHAR(32),
    PhoneNumber INT,
    Email VARCHAR(32),
    Gender VARCHAR(8),
    Address VARCHAR(32),
    Primary Key(Customer_ID)
);

     INSERT INTO customer(Customer_Name, Customer_Password, Age , PhoneNumber,Email,Gender,Address)
VALUES ('Ahmad' , '0597785625', 20 , 0597285625 , 'abubaker@gmail.com', 'female' , 'Ersal'),
        ('yazan' , 0597785625, 20 , 0592785625 , 'nafe@gmail.com', 'female' , 'Masayef'),
        ('tasneem' , 0597785625, 20 , 0597765625 , 'basem@gmail.com', 'male' , 'Masayef');	
        
        select * from tempproduct;
        select * from cart;
        
        select count(1) from customer 
        where Customer_Name = 'nafe'
        and Customer_Password = 'nafe';

CREATE TABLE if not exists Product(
	Product_ID int NOT NULL AUTO_INCREMENT,
    ProductName VARCHAR(32),
	Price int,
    Quantity int, #default 10
    CartID int,
    Primary Key(Product_ID)
    );

CREATE TABLE if not exists TempProduct(
	Product_ID int NOT NULL AUTO_INCREMENT,
    ProductName VARCHAR(32),
	Price int,
    Quantity int, #default 10
    CartID int,
    Primary Key(Product_ID)
    );

    Insert into TempProduct(ProductName,Price)
    VALUES ('nafe',50);
    
    delete from TempProduct WHERE PRODUCT_ID=7;
    
    select * from product;
    select * from TempProduct;
    
    
    delete from tempproduct;	
    #delete from customer;
    select * from product;
    #totalprice
    select sum(Price) from TempProduct;
    select * from product;
    select * from Tempproduct;

	Insert into TempProduct(ProductName,Price) VALUES ('mens watch $70',70);

        
    #number of products
	select count(product_ID) FROM TempProduct;
    
    #inserting into cart
    INSERT INTO cart(NumOfProducts,TotalPrice) VALUES (4,3);
    
    CREATE TABLE if not exists Orders_sold(
	Orders_sold_ID int NOT NULL AUTO_INCREMENT,
    Customer_ID int,
	TotalPrice int,
    Num_OF_Products int,
    Primary Key (Orders_sold_ID),
	Foreign Key (Customer_ID) References customer(customer_ID)
    );
    
    insert into Orders_sold(Customer_ID,TotalPrice,Num_OF_Products)
    values(18,2,3);
delete from orders_sold;
select * from orders_sold;
select * from customer;
select * from tempproduct;


select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Age = '20';

select * from customer;

select Customer_ID 
from customer
where Customer_Name = 'nafe';
    
    CREATE TABLE if not exists SoldOrders(
	SID int NOT NULL AUTO_INCREMENT,
    TotalPrice VARCHAR(32),
	NumOfProducts int,
    ProductID int,
    CustomerID int,
    Primary Key(Product_ID)
    );
    
#جدول وسيط
CREATE TABLE if not exists Cus_Prod(
	Customer_ID int auto_increment not null,
	Product_ID int not null,
    Primary Key(Customer_ID,Product_ID)
	);

CREATE TABLE if not exists Cart(
	CartID int not null AUTO_INCREMENT,
    NumOfProducts int,
    TotalPrice int,
    ProductID int,
    Primary Key(CartID)
	);

Create TAbLE if not exists Manager( #name must be unique (cascade)
	ManagerID int NOT NULL,
    Manager_Name VARCHAR(32),
    Manager_PassWord VARCHAR(50),
    CartID int,
    Primary Key(ManagerID)
	);

    CREATE Table if not exists Orderr( 
		OrderID int AUTO_INCREMENT,
		OrderDate date,
        Address VARCHAR(32),
        Customer_ID int,
        CartID int,
        Primary Key(OrderID)
        );
        
	CREATE TABLE if not exists CartProduct(
		ID int NOT NULL AUTO_INCREMENT,	
		CartID int,
		Product_ID int,
		Primary Key (ID),
		Foreign Key (CartID) References Cart(CartID),
		Foreign Key (Product_ID) References Product(Product_ID)
		);
	
    ALTER TABLE Product 
    ADD CONSTRAINT CartID FOREIGN KEY ( CartID )
        REFERENCES Cart ( CartID );
        
        
			ALTER TABLE Cus_Prod 
    ADD CONSTRAINT Product_ID FOREIGN KEY ( Product_ID )
			REFERENCES Product ( Product_ID );
        
            ALTER TABLE Cus_Prod 
    ADD CONSTRAINT Customer_ID FOREIGN KEY ( Customer_ID )
			REFERENCES Customer ( Customer_ID );
        
        
			ALTER TABLE Manager 
    ADD CONSTRAINT Manager_CartID FOREIGN KEY ( CartID )
			REFERENCES Cart ( CartID );
        
			ALTER TABLE Orderr 
	ADD CONSTRAINT Order_Customer_ID FOREIGN KEY ( Customer_ID ) 
			REFERENCES Customer ( Customer_ID );
			
            ALTER TABLE Orderr 
	ADD CONSTRAINT Order_CartID FOREIGN KEY ( CartID ) 
			REFERENCES Cart ( CartID );

		ALTER TABLE Cart 
	ADD CONSTRAINT Product_Cart FOREIGN KEY ( ProductID) 
			REFERENCES Product ( Product_ID);
            
	#setting default value to quantity=10
    ALTER TABLE TempProduct
	ALTER Quantity SET DEFAULT 10;
    
	ALTER TABLE product MODIFY Product_ID INT AUTO_INCREMENT;
    ALTER TABLE manager ADD PRIMARY KEY (ManagerID);
    
    ALTER TABLE manager
	ADD CONSTRAINT CartID1
	FOREIGN KEY (CartID) REFERENCES cart (CartID)
	ON DELETE CASCADE;

	#For inserting values
INSERT INTO Cart (CartID, NumOfProducts, TotalPrice)
VALUES  (1, 10, 20),
		(2,10,500),
        (3,20,1000 );
        
INSERT INTO cus_prod(Customer_ID, Product_ID)
VALUES (1 , 1),
		(2,2),
        (3,3);
        
        
     INSERT INTO cus_prod(Customer_ID, Product_ID)
VALUES  (1,1),
		(2,2),
        (3,3);   



     INSERT INTO customer(Customer_Name, Customer_Password, Age , PhoneNumber,Email,Gender,Address)
VALUES ('Ahmad' , 0597785625, 20 , 0597285625 , 'abubaker@gmail.com', 'female' , 'Ersal'),
        ('yazan' , 0597785625, 20 , 0592785625 , 'nafe@gmail.com', 'female' , 'Masayef'),
        ('tasneem' , 0597785625, 20 , 0597765625 , 'basem@gmail.com', 'male' , 'Masayef');


     INSERT INTO customer(Customer_Name, Customer_Password, Age , PhoneNumber,Email,Gender,Address)
VALUES ('basel' , 0597785625, 20 , 0597285625 , 'abubaker@gmail.com', 'female' , 'Ersal');

INSERT INTO manager(ManagerID, Manager_Name, Manager_Password, CartID)
VALUES (1,'nafe','597785625', 1),
		(2,'ahmad', 'ahmad',2);
        
	INSERT INTO manager(Manager_Name, Manager_Password, CartID) VALUES('yazan','yazan', 1);
    
    select * from cart;
    select * from cus_prod;
    select * from customer;
    select * from manager;
    select * from orderr;
    select * from product;
    
    	INSERT INTO product(ProductName, Price)
        VALUES  ('Mens watch $30',30),
				('Mens watch $35',35),
                ('Mens watch $50',50),
                ('Mens watch $55',55),
                ('Womens watch $30',30),
                ('Mens watch $70',70),
                ('Black leather jacket 60$',60),
                ('Training for girls 30',30),
                ('White Reebok blouse 50$',50),
                ('Black jeans for girls 25$',25),
                ('Pink jacket for children 25$',25),
                ('Brown leather jacket 50$',50);


	SELECT * 
    FROM  cart JOIN product join customer
    ON cart.ProductID = product.Product_ID 
	WHERE cart.productID = 1 AND cart.CartID = 2;
	
    SELECT * FROM  product
	WHERE cart.productID = 1 AND cart.CartID = 2;