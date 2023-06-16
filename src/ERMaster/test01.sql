
/* Drop Tables */

--DROP TABLE orders CASCADE CONSTRAINTS;
--DROP TABLE customer CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE customer100
(
	custid number NOT NULL,
	name varchar2(50),
	address varchar2(50 char),
	phone varchar2(50),
	PRIMARY KEY (custid)
);

select * from orders100;

CREATE TABLE orders100
(
	orderid number NOT NULL,
	bookid number,
	saleprice number,
	orderdate date,
	custid number NOT NULL,
	PRIMARY KEY (orderid)
);



/* Create Foreign Keys */

ALTER TABLE orders
	ADD FOREIGN KEY (custid)
	REFERENCES customer (custid)
;



