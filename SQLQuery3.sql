IF EXIS (SELECT * FROM sys>databases WHERE Name LIKE 'Example5')
DROP DATABASE Example5
GO
CREATE DATABASE Example5
GO
USE Example 5
GO
CREATE TABLE lopHoc(
       MaLopHoc INT PRIMARY KEY IDENTITY,
	   TenLopHoc VARCHAR(10)
	   )
GO
SELECT * FROM LopHoc
GO
INSERT INTO LopHoc(TenLopHoc) VALUES ('T2205E')
SELECT * FROM LopHoc
UPDATE lopHoc SET TenLopHoc = 'T2209A1' WHERE MaLopHoc = 1
DELETE FROM LopHoc WHERE MaLopHoc = 1
GO

CREATE TABLE SinhVien(
MaSV int PRIMARY KEY,
TenSV varchar(40),
MaLopHoc INT,
CONSTRAINT fk FOREIGN KEY (MaLopHoc) REFERENCES LopHoc(MaLopHoc)
)
GO
INSERT INTO SinhVien(MaSV, TenSV, MaLopHoc) VALUES (5,'Minh',1);
INSERT INTO SinhVien(MaSV, TenSV, MaLopHoc) VALUES (3,'Hoa',2);
INSERT INTO SinhVien(MaSV, TenSV, MaLopHoc) VALUES (14,'Minh',8),(16,'Linh', 3);
SELECT * FROM SinhVien
SELECT * FROM LopHoc
GO

create table category (id int primary key, name varchar (20))
create table produce  (id int, name varchar(40), cat_id int,
constraint fk2 foreign (cat_id) references category(id))
insert into catagory (id, name) values (1,'Ha Noi')
insert into catagory (id, name) values (2,'cty')
insert into produce(id, name, cat_id) values (2, 'May rua bat', 1)
insert into produce(id, name, cat_id) values (2, 'May lau nha', 2)
insert into produce(id, name, cat_id) values (5, 'May ru ngu ', 1)
select * from catagory
select * from produce

DROP TABLE SanPham
GO
CREATE TABLE SanPham(
MaSP int NOT NULL,
TenSP varchar(40) NULL
)
GO 
INSERT INTO SanPham(MaSP, TenSP) VALUES (1,'LapTop')
GO
INSERT INTO SanPham(TenSP) VALUES ('LapTop2')
GO
INSERT INTO SanPham(MaSP) VALUES (2)
GO
SELECT * FROM SanPham

CREATE TABLE StoreProduct(
ProductID int NOT NULL,
Name varchar(40) NOT NULL,
Price money NOT NULL DEFAULT (100)
)
GO
INSERT INTO StoreProduct (ProductID, Name) VALUES (111, 'RIVETS')
GO
INSERT INTO StoreProduct VALUES (1, ' MAC', 101)
GO
SELECT * FROM StoreProduct
GO
CREATE TABLE ContactPhone(
Person_ID INT IDENTITY(500,10) NOT NULL,
MobileNumber bigint NOT NULL
)
GO
INSERT INTO  ContactPhone VALUES (984123123);
INSERT INTO ContactPhone VALUES  (984123124);
GO
SELECT *FROM ContactPhone
GO
DROP  TABLE cellularPhone(
   Person_id uniqueidentifier DEFAULT NEWID() NOT NULL,
   PersonName varchar(60) NOT NULL
   )
 
 INSERT INTO  CellularPhone (PersonName) VALUES ('WILLIAM SMITH')
 GO 
 SELECT *FROM CellularPhone
 GO 
 CREATE TABLE ContactPhone2(
 Person_id int PRIMARY KRY,
 MobileNumber bigint UNIQUE,
 ServiceProvider varchar (30),
 LandlineNumber bigint UNIQUE
 )
  INSERT INTO ContactPhone VALUES (101, 98334674, 'HUTCH', NULL)
  INSERT INTO ContactPhone VALUES (102, 98334674, 'ALEX', 98332211)
  INSERT INTO ContactPhone VALUES (102, 98334674, 'HUTCH', 98332211)
  GO
  SELECT * FROM ContactPhone2
  GO
  DROP TABLE PhoneExpenses
  GO
  CREATE TABLE PhoneExpsnses(
  Expense_ID int PRIMARY KEY,
  MobileNumber bigint FOREIGN REFERENCES ContactPhone2 (MobileNUmber),
  Amount bigint CHECK (Amount >0) 
  )
  GO
  INSERT INTO PhoneExpenses(Expense_ID, MOboleNUmber, Amout)
  VALUES(1,983345674, 10)
  GO
    INSERT INTO PhoneExpenses(Expense_ID, MOboleNUmber, Amout)
  VALUES(1,983345674, 10)
  GO
    INSERT INTO PhoneExpenses(Expense_ID, MOboleNUmber, Amout)
  VALUES(2,9999, 10)
  GO
    INSERT INTO PhoneExpenses(Expense_ID, MOboleNUmber, Amout)
  VALUES(1,983345674, -2)
  GO
  SELECT * FROM  StoreProduct
  GO
  ALTER TABLE StoreProduct
  DROP CONSTRAINT CHECK_PICE
  CREATE TABLE  student
  (rollNUmber  INT,
  name VARCHAR(30),
  class VARCHAR(30),
  setion  VARCHAR(1),
  mobile VARCHAR (10),
  PRIMARY KEY (rollNumber, mobile)):
  INSERT INTO Student(rollNumber, name, class, section, mobile)
  VALUES (1,'AMAN', 'FOURTH', 'B', '9988774455');
  INSERT INTO Student(rollNumber, name, class, section, mobile)
  VALUES (1,'JOHN', 'FIRST', 'A', '9988112233');
  INSERT INTO Student(rollNumber, name, class, section, mobile)
  VALUES (1,'THI', 'DANG', 'B', '9988777755');
  INSERT INTO Student(rollNumber, name, class, section, mobile)
  VALUES (1,'THI', 'KIM', 'C', '9955663322');
  SELECT * FROM Student

