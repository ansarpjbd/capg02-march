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
