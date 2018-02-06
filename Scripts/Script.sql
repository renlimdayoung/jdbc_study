-- 데이타베이스
CREATE SCHEMA JDBC_Mybatis;

-- 학생
CREATE TABLE JDBC_Mybatis.student (
	std_id INTEGER     NOT NULL COMMENT '학번', -- 학번
	name   VARCHAR(50) NOT NULL COMMENT '이름', -- 이름
	email  VARCHAR(40) NOT NULL COMMENT '메일', -- 메일
	dob    DATE        NULL     COMMENT '입학일자' -- 입학일자
)
COMMENT '학생';

-- 학생
ALTER TABLE JDBC_Mybatis.student
	ADD CONSTRAINT PK_student -- 학생 기본키
		PRIMARY KEY (
			std_id -- 학번
		);