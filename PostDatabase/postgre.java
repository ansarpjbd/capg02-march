DataBase 

---Releational Database 

Operating system :File : 
id:20;
name:"hello";
id:20;
name:"hello";
id:20;
name:"hello";

Database Management Software :

#DB2 (IDM)
#MYSQL
#ORcale
#Sql Serve
#Postgre

>installions
   connect to database
   --Search for psql in serach bar in window
 
 #Database Properites
     >Server Name : Localhost 
	 >Database Name : postgre (default)
     >Port No : 5432 (Default port for postgree)                 //MYsql 3600
     >Username  : Ppostgre
	 >Password  : --------
	 
postgres=#
C ,C++,JAVA ,Phyton
Dataabse --SQL
Oracle
DB2
MySQL
POSTGRE
  
//Command to show all the dataabse list
>\l  
You are now connected to database "demo" as user "postgres".
demo=#

//Create a datbase 
//create dataabase databasename

//connect to any dataabse
//c database 

//see all the table
>/dt

//see the structure of table
>/d table name

//delete the database
> drop database  databsename

employee=# drop database india;
DROP DATABASE
employee=# \l

SQL Queries  : used to communicate with the database	 
	 
//it store the data for later use
 
it store the data in table form 
Table 
--combination row and coloumn 
id     name
1      abc
2      kumar
3      java
4      kumar


using java --it will not stored :
Employee
{
int id;
String name;
String salary;
int age;
date doj;
}

class dept
{
	int id;
	String name;
	String location
}



#Data type in Postgre SQl
datatype-->int --it is used to store the int type of value
       --->varchar --it is used to store the string with lenght

 id     name
 
create table employee(id int, name varchar(10));

//insert value into table
//insert into tablename(col list) values (values list);
insert into employee(id,name) values(1001,"umesh");

//select (need to display the data )
//select * from tablename;
select * from employee;

select id from employee;


//udate
//update table name set col=value, col2 =value ,col3=value where condition
update employee set name='kkk' where id=1001

//delete 
//delete from table name where and condition
delete from employee where id=1001;



//how to create database
//how to create table

//sql cluses which will help you get the data 
//build in method to get the data 

//sort the data
//order by 
select * from employee order by id;
//ASC--ascending order
//DESC--descending order

//count
//total number of rows
//select count(*) from employee;

//sum
//select sum(id) from employee;

//min
//select min(id) from employee;

//max
>find th maximum from all the record
select max(id) from employee;

//distinct
>unique value from employee records
#Select distinct from employee;

//where
>it is used to add the condition
select * from employee where  

//creating releationship between two table
group by
>it will combine and give the group of data 
select count(name) from employee group by name;

//add testing 

//RENAME THE TABLE

RENAME TABLE TABLENAME TO NEWTABLENAME

>Alter table to add the column
//ALTER TABLE emp ADD FOREIGN KEY (deptid) REFERENCES dept(id);


//Joins

//full join -- all thevalues from both the tables

it is used to fetch the data from one or more table

select * from tableone , tabletwo;

//inner joins

//get the matching data from both the tables
select * from tableone inner join tablewo on table.col1=tabltwo.col2;


//left join
select * from tableone left join tablewo on table.col1=tabltwo.col2;


//right join
select * from tableone right join tablewo on table.col1=tabltwo.col2;


//full join
select * from tableone right join tablewo on table.col1=tabltwo.col2;


//subqueries
//we have two queries combines togater
//child query result will be used by the parent query

select * from emp where deptid=(select id from dept where name='IT');


Server [localhost]:
Database [postgres]:
Port [5432]:
Username [postgres]:
Password for user postgres:
psql (14.1)
WARNING: Console code page (437) differs from Windows code page (1252)
         8-bit characters might not work correctly. See psql reference
         page "Notes for Windows users" for details.
Type "help" for help.

postgres=# \c demo2;
You are now connected to database "demo2" as user "postgres".
demo2=# \dt
           List of relations
 Schema |   Name    | Type  |  Owner
--------+-----------+-------+----------
 public | dept      | table | postgres
 public | emp       | table | postgres
 public | employee  | table | postgres
 public | employeep | table | postgres
(4 rows)


demo2=# insert into dept(name) values('IT');
INSERT 0 1
demo2=# insert into dept(name) values('SALE');
INSERT 0 1
demo2=# select * from dept;
 id | name
----+------
  1 | IT
  2 | SALE
(2 rows)


demo2=# insert into emp(name,deptid) values('abc',1);
INSERT 0 1
demo2=# insert into emp(name,deptid) values('jyoti',1);
INSERT 0 1
demo2=# insert into emp(name,deptid) values('kumar',1);
INSERT 0 1
demo2=# insert into emp(name,deptid) values('pooja',2);
INSERT 0 1
demo2=# insert into emp(name,deptid) values('priya',2);
INSERT 0 1
demo2=# insert into emp(name,deptid) values('komal',2);
INSERT 0 1
demo2=# select * from emp;
 id | name  | deptid
----+-------+--------
  1 | abc   |
  2 | a     |
  3 | b     |
  4 | c     |
  5 | d     |
  6 | e     |
  8 | abc   |      1
  9 | jyoti |      1
 10 | kumar |      1
 11 | pooja |      2
 12 | priya |      2
 13 | komal |      2
(12 rows)


demo2=# select * from dep;
ERROR:  relation "dep" does not exist
LINE 1: select * from dep;
                      ^
demo2=# select * from dept;
 id | name
----+------
  1 | IT
  2 | SALE
(2 rows)


demo2=# select count(name) from emp;
 count
-------
    12
(1 row)


demo2=# select count(name) from emp group by name;
 count
-------
     1
     1
     1
     1
     1
     1
     1
     1
     2
     1
     1
(11 rows)


demo2=# select count(name) ,name from emp group by name;
 count | name
-------+-------
     1 | d
     1 | kumar
     1 | a
     1 | b
     1 | priya
     1 | jyoti
     1 | c
     1 | pooja
     2 | abc
     1 | e
     1 | komal
(11 rows)


demo2=# alter table rename emp to emp1;
ERROR:  syntax error at or near "emp"
LINE 1: alter table rename emp to emp1;
                           ^
demo2=# alter table emp rename  to emp1;
ALTER TABLE
demo2=# select * from emp;
ERROR:  relation "emp" does not exist
LINE 1: select * from emp;
                      ^
demo2=# alter table emp1 rename  to emp;
ALTER TABLE
demo2=# select * from emp;
 id | name  | deptid
----+-------+--------
  1 | abc   |
  2 | a     |
  3 | b     |
  4 | c     |
  5 | d     |
  6 | e     |
  8 | abc   |      1
  9 | jyoti |      1
 10 | kumar |      1
 11 | pooja |      2
 12 | priya |      2
 13 | komal |      2
(12 rows)


demo2=# select * from dept;
 id | name
----+------
  1 | IT
  2 | SALE
(2 rows)


demo2=# select * from emp,dept;
 id | name  | deptid | id | name
----+-------+--------+----+------
  1 | abc   |        |  1 | IT
  2 | a     |        |  1 | IT
  3 | b     |        |  1 | IT
  4 | c     |        |  1 | IT
  5 | d     |        |  1 | IT
  6 | e     |        |  1 | IT
  8 | abc   |      1 |  1 | IT
  9 | jyoti |      1 |  1 | IT
 10 | kumar |      1 |  1 | IT
 11 | pooja |      2 |  1 | IT
 12 | priya |      2 |  1 | IT
 13 | komal |      2 |  1 | IT
  1 | abc   |        |  2 | SALE
  2 | a     |        |  2 | SALE
  3 | b     |        |  2 | SALE
  4 | c     |        |  2 | SALE
  5 | d     |        |  2 | SALE
  6 | e     |        |  2 | SALE
  8 | abc   |      1 |  2 | SALE
  9 | jyoti |      1 |  2 | SALE
 10 | kumar |      1 |  2 | SALE
 11 | pooja |      2 |  2 | SALE
 12 | priya |      2 |  2 | SALE
 13 | komal |      2 |  2 | SALE
(24 rows)


demo2=# select * from emp inner dept on emp.deptid=dept.id;
ERROR:  syntax error at or near "dept"
LINE 1: select * from emp inner dept on emp.deptid=dept.id;
                                ^
demo2=# select * from emp inner join dept on emp.deptid=dept.id;
 id | name  | deptid | id | name
----+-------+--------+----+------
  8 | abc   |      1 |  1 | IT
  9 | jyoti |      1 |  1 | IT
 10 | kumar |      1 |  1 | IT
 11 | pooja |      2 |  2 | SALE
 12 | priya |      2 |  2 | SALE
 13 | komal |      2 |  2 | SALE
(6 rows)


demo2=# select * from emp;
 id | name  | deptid
----+-------+--------
  1 | abc   |
  2 | a     |
  3 | b     |
  4 | c     |
  5 | d     |
  6 | e     |
  8 | abc   |      1
  9 | jyoti |      1
 10 | kumar |      1
 11 | pooja |      2
 12 | priya |      2
 13 | komal |      2
(12 rows)


demo2=# insert into dept values('HR');
ERROR:  invalid input syntax for type bigint: "HR"
LINE 1: insert into dept values('HR');
                                ^
demo2=# insert into dept (name) values('HR');
INSERT 0 1
demo2=# select * from dept;
 id | name
----+------
  1 | IT
  2 | SALE
  3 | HR
(3 rows)


demo2=# select * from emp inner join dept on emp.deptid=dept.id;
 id | name  | deptid | id | name
----+-------+--------+----+------
  8 | abc   |      1 |  1 | IT
  9 | jyoti |      1 |  1 | IT
 10 | kumar |      1 |  1 | IT
 11 | pooja |      2 |  2 | SALE
 12 | priya |      2 |  2 | SALE
 13 | komal |      2 |  2 | SALE
(6 rows)


demo2=# select * from emp left join dept on emp.deptid=dept.id;
 id | name  | deptid | id | name
----+-------+--------+----+------
  1 | abc   |        |    |
  2 | a     |        |    |
  3 | b     |        |    |
  4 | c     |        |    |
  5 | d     |        |    |
  6 | e     |        |    |
  8 | abc   |      1 |  1 | IT
  9 | jyoti |      1 |  1 | IT
 10 | kumar |      1 |  1 | IT
 11 | pooja |      2 |  2 | SALE
 12 | priya |      2 |  2 | SALE
 13 | komal |      2 |  2 | SALE
(12 rows)


demo2=# select * from emp right join dept on emp.deptid=dept.id;
 id | name  | deptid | id | name
----+-------+--------+----+------
  8 | abc   |      1 |  1 | IT
  9 | jyoti |      1 |  1 | IT
 10 | kumar |      1 |  1 | IT
 11 | pooja |      2 |  2 | SALE
 12 | priya |      2 |  2 | SALE
 13 | komal |      2 |  2 | SALE
    |       |        |  3 | HR
(7 rows)


demo2=# select * from emp full join dept on emp.deptid=dept.id;
 id | name  | deptid | id | name
----+-------+--------+----+------
  1 | abc   |        |    |
  2 | a     |        |    |
  3 | b     |        |    |
  4 | c     |        |    |
  5 | d     |        |    |
  6 | e     |        |    |
  8 | abc   |      1 |  1 | IT
  9 | jyoti |      1 |  1 | IT
 10 | kumar |      1 |  1 | IT
 11 | pooja |      2 |  2 | SALE
 12 | priya |      2 |  2 | SALE
 13 | komal |      2 |  2 | SALE
    |       |        |  3 | HR
(13 rows)


demo2=# select * from dept where name='IT';
 id | name
----+------
  1 | IT
(1 row)


demo2=# select id from dept where name='IT';
 id
----
  1
(1 row)


demo2=# select * from emp where deptid=(select * from dept where name='IT');
ERROR:  subquery must return only one column
LINE 1: select * from emp where deptid=(select * from dept where nam...
                                       ^
demo2=# select * from emp where deptid=(select id from dept where name='IT');
 id | name  | deptid
----+-------+--------
  8 | abc   |      1
  9 | jyoti |      1
 10 | kumar |      1
(3 rows)


demo2=#


