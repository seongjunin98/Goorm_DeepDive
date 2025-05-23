/* CONSTRAINS */

-- 제약조건
-- 테이블 작성 시 각 컬럼에 값 기록에 대한 제약조건을 설정할 수 있다.
-- 데이터 무결성 보장을 목적으로 함
-- 입력/수정하는 데이터에 문제에 없는지 자동으로 검사해 주게 하기 위한 목적
-- PRIMARY KEY, NOT NULL, UNIQUE, CHECK, FOREIGN KEY

-- NOT NULL
-- NULL값 허용하지 않음
drop table if exists user_notnull;
create table if not exists user_notnull (
	user_no int not null,
	user_id varchar(255) not null,
	user_pwd varchar(255) not null,
	user_name varchar(255) not null,
	gender varchar(3),
	phone varchar(255) not null,
	email varchar(255)
) engine = innodb;

describe user_notnull;

insert into user_notnull(user_no, user_id, user_pwd, user_name, gender, phone, email)
values
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com'),
(2, 'user02', 'pass02', '유관순', '여', '010-777-7777', 'yu77@gmail.com');

select*from user_notnull;

-- not null 제약조건 에러 발생(null 값 적용)
insert into user_notnull(user_no, user_id, user_pwd, user_name, gender, phone, email)
values
(3, 'user03', null, '이순신', '남', '010-1234-5678', 'hong123@gmail.com');

/* UNIQUE */
-- 중복 값을 허용하지 않음
drop table if exists user_unique;
create table if not exists user_unique (
	user_no int not null unique,
	user_id varchar(255) not null,
	user_pwd varchar(255) not null,
	user_name varchar(255) not null,
	gender varchar(3),
	phone varchar(255) not null,
	email varchar(255),
    unique(phone)
) engine = innodb;

insert into user_unique(user_no, user_id, user_pwd, user_name, gender, phone, email)
values
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com'),
(2, 'user02', 'pass02', '유관순', '여', '010-777-7777', 'yu77@gmail.com');

select*from user_unique;

-- UNIQUE 제약조건 에러 발생(전화번호 중복값 적용)
insert into user_unique(user_no, user_id, user_pwd, user_name, gender, phone, email)
values
(3, 'user03', 'pass03', '이순신', '남', '010-777-7777', 'hong123@gmail.com');


/* PRIMARY KEY */
-- 테이블에서 한 행의 정보를 찾기 위해 사용할 컬럼을 의미한다.
-- 테이블에 대한 식별자 역할을 한다.(한 행씩 구분하는 역할을 말한다.)
-- NOT NULL + UNIQUE 제약조건의 의미
-- 한 테이블당 한 개만 설정할 수 있음
-- 컬럼 레벨, 테이블 레벨 둘 다 설정 가능함
-- 한 개의 컬럼에 설정할 수도 있고, 여러 개의 컬럼을 묶어서 설정할 수도 있음(복합키)
drop table if exists user_primarykey;
create table if not exists user_primarykey (
	user_no int not null unique,
	user_id varchar(255) not null,
	user_pwd varchar(255) not null,
	user_name varchar(255) not null,
	gender varchar(3),
	phone varchar(255) not null,
	email varchar(255),
    primary key(user_no)
) engine = innodb;

insert into user_primarykey(user_no, user_id, user_pwd, user_name, gender, phone, email)
values
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com'),
(2, 'user02', 'pass02', '유관순', '여', '010-777-7777', 'yu77@gmail.com');

select*from user_primarykey;



-- PRIMARY KEY 제약조건 에러 발생(NULL값 적용)
insert into user_primarykey(user_no, user_id, user_pwd, user_name, gender, phone, email)
values
(null, 'user03', 'pass03', '이순신', '남', '010-777-7777', 'hong123@gmail.com');

-- PRIMARY KEY 제약조건 에러 발생(중복값 적용)
insert into user_primarykey(user_no, user_id, user_pwd, user_name, gender, phone, email)
values
(2, 'user03', 'pass03', '이순신', '남', '010-777-7777', 'hong123@gmail.com');

/* FOREIGN KEY */
-- 참조(REFERENCES)된 다른 테이블에서 제공하는 값만 사용할 수 있음
-- 참조 무결성을 위배하지 않기 위해 사용
-- FOREIGN KEY 제약조건에 의해서
-- 테이블 간의 관계(RELATIONSHIP)가 형성됨
-- 제공되는 값 외에는 NULL을 사용할 수 있음

drop table if exists user_grade;
create table if not exists user_grade (
	grade_code int not null unique,
    grade_name varchar(255) not null
)engine = innodb;

describe user_grade;

insert into user_grade
values
(10, '일반회원'),
(20, '우수회원'),
(30, '특별,회원');

select*from user_grade;

drop table if exists user_foreignkey1;
create table if not exists user_foreignkey1 (
	user_no int primary key,
	user_id varchar(255) not null,
	user_pwd varchar(255) not null,
	user_name varchar(255) not null,
	gender varchar(3),
	phone varchar(255) not null,
	email varchar(255),
    grade_code int,
    foreign key(grade_code)
    references user_grade(grade_code)
) engine = innodb;

describe user_foreignkey1;

insert into user_foreignkey1(user_no, user_id, user_pwd, user_name, gender, phone, email, grade_code)
values
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com', 10),
(2, 'user02', 'pass02', '유관순', '여', '010-777-7777', 'yu77@gmail.com', 20);

select * from user_foreignkey1;

-- foreignkey 제약조건 에러 발생(참초컬럼에 없는 값 적용)
insert into user_foreignkey1(user_no, user_id, user_pwd, user_name, gender, phone, email, grade_code)
values
(2, 'user03', 'pass03', '이순신', '남', '010-777-7777', 'hong123@gmail.com', 50);


-- ON UPDATE SET NULL, ON DELETE SET NULL
drop table if exists user_foreignkey2;
create table if not exists user_foreignkey2 (
	user_no int primary key,
	user_id varchar(255) not null,
	user_pwd varchar(255) not null,
	user_name varchar(255) not null,
	gender varchar(3),
	phone varchar(255) not null,
	email varchar(255),
    grade_code int,
    foreign key(grade_code)
    references user_grade(grade_code)
    on update set null
    on delete set null
) engine = innodb;

insert into user_foreignkey2(user_no, user_id, user_pwd, user_name, gender, phone, email, grade_code)
values
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com', 10),
(2, 'user02', 'pass02', '유관순', '여', '010-777-7777', 'yu77@gmail.com', 20);

select * from user_foreignkey2;

-- 1) 부모 테이블의 grade_code 수정
drop table if exists user_foreignkey1;
update user_grade
	set grade_code = 1
    where grade_code =10;

select*from user_grade;

-- 2) 부모 테이블의 행 삭제
delete from user_grade
	where grade_code = 20;

/* CHECK */
drop table if exists user_check;
create table if not exists user_check (
	user_no int auto_increment primary key,
	user_name varchar(255) not null,
	gender varchar(3) check(gender in ('남', '여')),
	age int check(age >= 19)
) engine = innodb;

describe user_check;

insert into user_check 
values
(null, '홍길동', '남', 25),
(null, '이순신', '남', 33);

select * from user_check;

-- gender 컬럼 check 제약 조건 에러 발생
insert into user_check 
values
(null, '안중근', '남성', 25);

-- age 컬럼 check 제약 조건 에러 발생
insert into user_check 
values
(null, '유관순', '여', 17);

/* DEFAULT */
-- 컬럼에 NULL 대신 기본 값 적용
drop table if exists tbl_country;
create table if not exists tbl_country (
	country_cod int auto_increment primary key,
    country_name varchar(255) default '한국',
    population varchar(255) default '0명'
) engine = innodb;

select * from tbl_country;

insert into tbl_country
values (null, default, default);