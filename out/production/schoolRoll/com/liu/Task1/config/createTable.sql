create  database shoolrool;
use  shoolrool;
create table users(
    id int ,
    username varchar(20),
    pass_Wrod varchar(20),
    userType varchar(20),
    use_flag int
);
create table course(
    id int ,
    coursecode varchar(20),
    coursename varchar(50),
    teacherid int,
    coursescore int ,
    coursetime int ,
    description varchar(200),
    use_flag int,
    teacherName varchar(20)
);

create table Scores(
    id int ,
    studentid int ,
    courseid int ,
    examtype varchar(20),
    score int ,
    examdate DATE,
    status int ,
    use_flag int
);

create table Students(
    id int,
    loginid int,
    code varchar(20),
    name varchar(50),
    cardid varchar(20),
    age int ,
    sex int,
    birthday date,
    Classname varchar(50),
    studycode varchar(20),
    politicallandscape varchar(20),
    nationality varchar(20),
    familyaddress varchar(200),
    use_flag int ,
    type varchar(20)
);

create table Tbl_dictionary(
    intDictionaryID int ,
    nvcDictionaryCode varchar(10),
    nvcindexcode varchar(10),
    nvcValue varchar(20),
    nvcDESCRIPTION VARCHAR(100),
    TINTSTATUS INT ,
    DTUPDATETIME DATE
);

CREATE TABLE Tbl_dictionaryindex
(
    INTINDEXID INT ,
    NVCINDEXCODE VARCHAR(5),
    NVCINDEXNAME VARCHAR(15),
    NVCDESCRIPTION VARCHAR(25),
    TINTSTAUS INT,
    DTUPDATETIME DATETIME
)





























