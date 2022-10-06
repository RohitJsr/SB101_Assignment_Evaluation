package com.masaiQ1AndQ2;

public class all_details {
	/*
	 * 
	q1)
	 mysql> USE SB101C4;
Database changed
mysql> CREATE TABLE Student (roll int primary key, name varchar(12) not null, address varchar(12) not null,mobile varchar(10) not null);
Query OK, 0 rows affected (0.05 sec)

mysql> desc student;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| roll    | int         | NO   | PRI | NULL    |       |
| name    | varchar(12) | NO   |     | NULL    |       |
| address | varchar(12) | NO   |     | NULL    |       |
| mobile  | varchar(10) | NO   |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

mysql> create table Course(cid int primary key, cname varchar(12) not null, fee int not null,duration varchar(12) not null);
Query OK, 0 rows affected (0.02 sec)

mysql> desc course;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| cid      | int         | NO   | PRI | NULL    |       |
| cname    | varchar(12) | NO   |     | NULL    |       |
| fee      | int         | NO   |     | NULL    |       |
| duration | varchar(12) | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
4 rows in set (0.01 sec)


mysql> create table student_course
    -> (
    -> roll int,
    -> cid int,
    -> foreign key (roll) references student(roll),
    -> foreign key (cid) references course(cid)
    -> );
Query OK, 0 rows affected (0.08 sec)

mysql> desc student_course;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| roll  | int  | YES  | MUL | NULL    |       |
| cid   | int  | YES  | MUL | NULL    |       |
+-------+------+------+-----+---------+-------+
2 rows in set (0.01 sec)


------------------------------------------------------------
mysql> select * from student;
+------+--------+------------+------------+
| roll | name   | address    | mobile     |
+------+--------+------------+------------+
|    1 | Venkat | karnatka   | 932626233  |
|    2 | Amit   | Mumbai     | 932000222  |
|    3 | Raj    | Delhi      | 620000232  |
|    4 | Binay  | Silong     | 858585555  |
|    5 | Suresh | Jamshedpur | 8989888885 |
+------+--------+------------+------------+
5 rows in set (0.00 sec)
----------------------------------------------------------

mysql> select* from course;
+-----+-----------+-------+----------+
| cid | cname     | fee   | duration |
+-----+-----------+-------+----------+
| 101 | Java      | 25000 | 45       |
| 102 | Spring    |  3500 | 30       |
| 103 | Hibernate |    35 | 33       |
| 104 | react     |    55 | 45       |
| 105 | Angular   |  5500 | 25       |
+-----+-----------+-------+----------+
5 rows in set (0.00 sec)
------------------------------------------------------

mysql> insert into student_course values(2,101);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_course values(2,102);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(1,101);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(1,104);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(3,102);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student_course values(3,105);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(5,101);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(5,103);
Query OK, 1 row affected (0.00 sec)

mysql> insert into student_course values(5,105);
Query OK, 1 row affected (0.01 sec)

select s.roll, s.name, s.address, s.mobile, c.cname, c.fee, c.duration 
from student s INNER JOIN course c INNER JOIN student_course sc
ON 
s.roll = sc.roll AND c.cid=sc.cid AND c.cname='Java';





------------------------------------------------------------------------------------------------------------------------------------------------------------

Q2)

mysql> CREATE TABLE Department (
    -> did int primary key,
    -> dname varchar(12) not null,
    -> location varchar(12) not null
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> DESC DEPARTMENT;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| did      | int         | NO   | PRI | NULL    |       |
| dname    | varchar(12) | NO   |     | NULL    |       |
| location | varchar(12) | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)


mysql>  create table employee (
    ->    empId int primary key,
    ->    ename varchar(12) not null,
    ->    address varchar(12) not null,
    ->    mobile varchar(12) not null,
    ->    salary int not null,
    ->    deptId int,
    ->  FOREIGN KEY (deptid) REFERENCES department(did)
    ->
    ->    );
Query OK, 0 rows affected (0.03 sec)

mysql> desc employee;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| empId   | int         | NO   | PRI | NULL    |       |
| ename   | varchar(12) | NO   |     | NULL    |       |
| address | varchar(12) | NO   |     | NULL    |       |
| mobile  | varchar(12) | NO   |     | NULL    |       |
| salary  | int         | NO   |     | NULL    |       |
| deptId  | int         | YES  | MUL | NULL    |       |
+---------+-------------+------+-----+---------+-------+
6 rows in set (0.00 sec)


mysql> insert into Department values(01,'Account','mumbai');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Department values(02,'sales','mumbai');
Query OK, 1 row affected (0.00 sec)

mysql> insert into Department values(03,'marketing','delhi');
Query OK, 1 row affected (0.00 sec)

mysql> insert into Department values(04,'hr','up');
Query OK, 1 row affected (0.00 sec)


mysql> select * from department;
+-----+-----------+----------+
| did | dname     | location |
+-----+-----------+----------+
|   1 | Account   | mumbai   |
|   2 | sales     | mumbai   |
|   3 | marketing | delhi    |
|   4 | hr        | up       |
+-----+-----------+----------+
4 rows in set (0.00 sec)

mysql> desc employee;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| empId   | int         | NO   | PRI | NULL    |       |
| ename   | varchar(12) | NO   |     | NULL    |       |
| address | varchar(12) | NO   |     | NULL    |       |
| mobile  | varchar(12) | NO   |     | NULL    |       |
| salary  | int         | NO   |     | NULL    |       |
| deptId  | int         | YES  | MUL | NULL    |       |
+---------+-------------+------+-----+---------+-------+
6 rows in set (0.00 sec)

mysql> insert into  employee values(101,'sohan','mumbai','625222',25000,01);
Query OK, 1 row affected (0.01 sec)

mysql> insert into  employee values(102,'rohan','mumbai','6255222',28000,01);
Query OK, 1 row affected (0.01 sec)

mysql> insert into  employee values(103,'mohan','mumbai','3255222',30000,02);
Query OK, 1 row affected (0.00 sec)

mysql> insert into  employee values(104,'shan','mumbai','55222',30000,02);
Query OK, 1 row affected (0.00 sec)

mysql> insert into  employee values(105,'ran','mumbai','53222',30500,02);
Query OK, 1 row affected (0.00 sec)

mysql> insert into  employee values(106,'dan','mumbai','53222',30500,03);
Query OK, 1 row affected (0.00 sec)

mysql> insert into  employee values(107,'man','mumbai','53222',80500,03);
Query OK, 1 row affected (0.00 sec)

mysql> insert into  employee values(108,'majn','mumbai','33222',20500,04);
Query OK, 1 row affected (0.00 sec)

mysql> insert into  employee values(109,'rajn','mumbai','33222',30500,04);
Query OK, 1 row affected (0.00 sec)

mysql> select * from employee;
+-------+-------+---------+---------+--------+--------+
| empId | ename | address | mobile  | salary | deptId |
+-------+-------+---------+---------+--------+--------+
|   101 | sohan | mumbai  | 625222  |  25000 |      1 |
|   102 | rohan | mumbai  | 6255222 |  28000 |      1 |
|   103 | mohan | mumbai  | 3255222 |  30000 |      2 |
|   104 | shan  | mumbai  | 55222   |  30000 |      2 |
|   105 | ran   | mumbai  | 53222   |  30500 |      2 |
|   106 | dan   | mumbai  | 53222   |  30500 |      3 |
|   107 | man   | mumbai  | 53222   |  80500 |      3 |
|   108 | majn  | mumbai  | 33222   |  20500 |      4 |
|   109 | rajn  | mumbai  | 33222   |  30500 |      4 |
+-------+-------+---------+---------+--------+--------+
9 rows in set (0.00 sec)


mysql> SELECT deptId, SUM(salary)
    -> FROM employee
    -> GROUP BY deptId;
+--------+-------------+
| deptId | SUM(salary) |
+--------+-------------+
|      1 |       53000 |
|      2 |       90500 |
|      3 |      111000 |
|      4 |       51000 |
+--------+-------------+
4 rows in set (0.00 sec)



SELECT  ename, address, mobile, salary ,deptId
FROM employee  
WHERE deptId = 
(SELECT deptId 
FROM department 
WHERE deptId ='sales');
	 */

}
