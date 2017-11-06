# schema.sql文件，存放sql语句
# 创建数据库
CREATE DATABASE online_course_selection;

# 使用数据库
USE online_course_selection;

# 创建数据表
# 院系表
CREATE TABLE tb_dept (
  dept_id    INT         NOT NULL AUTO_INCREMENT
  COMMENT '院系号',
  dept_name  VARCHAR(20) NOT NULL
  COMMENT '院系名称',
  dept_phone VARCHAR(20) NOT NULL
  COMMENT '院系联系电话',
  dept_desc  TEXT        NOT NULL
  COMMENT '院系描述',
  PRIMARY KEY (dept_id),
  KEY idx_dept_id(dept_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET utf8
  COMMENT '院系表';

# 学生表
CREATE TABLE tb_student (
  student_id       INT         NOT NULL AUTO_INCREMENT
  COMMENT '学号',
  student_name     VARCHAR(20) NOT NULL
  COMMENT '学生名称',
  student_gender   CHAR(1)     NOT NULL
  COMMENT '学生性别',
  student_birthday DATE        NOT NULL
  COMMENT '学生生日',
  student_email    VARCHAR(30) NOT NULL
  COMMENT '学生邮箱',
  student_password VARCHAR(20) NOT NULL
  COMMENT '登录密码',
  dept_id          INT         NOT NULL
  COMMENT '所在院系',
  PRIMARY KEY (student_id),
  FOREIGN KEY (dept_id) REFERENCES tb_dept (dept_id),
  KEY idx_student_id(student_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET utf8
  COMMENT '学生表';

# 教师表
CREATE TABLE tb_teacher (
  teacher_id       INT         NOT NULL AUTO_INCREMENT
  COMMENT '工号',
  teacher_name     VARCHAR(20) NOT NULL
  COMMENT '教师名称',
  teacher_gender   CHAR(1)     NOT NULL
  COMMENT '教师性别',
  teacher_birthday DATE        NOT NULL
  COMMENT '教师生日',
  teacher_email    VARCHAR(30) NOT NULL
  COMMENT '教师邮箱',
  teacher_password VARCHAR(20) NOT NULL
  COMMENT '登录密码',
  teacher_title    VARCHAR(10) NOT NULL
  COMMENT '职称',
  dept_id          INT         NOT NULL
  COMMENT '所在院系',
  PRIMARY KEY (teacher_id),
  FOREIGN KEY (dept_id) REFERENCES tb_dept (dept_id),
  KEY idx_teacher_id(teacher_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET utf8
  COMMENT '教师表';

# 管理员表
CREATE TABLE tb_admin (
  admin_id       INT         NOT NULL AUTO_INCREMENT
  COMMENT '管理员工号',
  admin_name     VARCHAR(20) NOT NULL
  COMMENT '管理员名称',
  admin_password VARCHAR(20) NOT NULL
  COMMENT '登录密码',
  PRIMARY KEY (admin_id),
  KEY idx_admin_id(admin_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET utf8
  COMMENT '管理员表';

# 课程表
CREATE TABLE tb_course (
  course_id     INT         NOT NULL AUTO_INCREMENT
  COMMENT '课程号',
  course_name   VARCHAR(50) NOT NULL
  COMMENT '课程名称',
  course_hour   SMALLINT    NOT NULL
  COMMENT '学时',
  course_credit FLOAT       NOT NULL
  COMMENT '学分',
  course_desc   TEXT        NOT NULL
  COMMENT '课程描述',
  PRIMARY KEY (course_id),
  KEY idx_course_id(course_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET utf8
  COMMENT '课程表';

# 授课表
CREATE TABLE tb_instruct (
  instruct_id INT NOT NULL AUTO_INCREMENT
  COMMENT '授课id',
  teacher_id  INT NOT NULL
  COMMENT '教师工号',
  course_id   INT NOT NULL
  COMMENT '课程号',
  PRIMARY KEY (instruct_id),
  FOREIGN KEY (teacher_id) REFERENCES tb_teacher (teacher_id),
  FOREIGN KEY (course_id) REFERENCES tb_course (course_id),
  KEY idx_instruct_id(instruct_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET utf8
  COMMENT '授课表';

# 选课表
CREATE TABLE tb_selection (
  selection_id INT NOT NULL AUTO_INCREMENT
  COMMENT '选课号',
  course_id    INT NOT NULL
  COMMENT '课程号',
  student_id   INT NOT NULL
  COMMENT '学号',
  score        INT NOT NULL DEFAULT 0
  COMMENT '成绩',
  PRIMARY KEY (student_id),
  FOREIGN KEY (course_id) REFERENCES tb_course (course_id),
  FOREIGN KEY (student_id) REFERENCES tb_student (student_id),
  KEY idx_selection_id(selection_id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET utf8
  COMMENT '选课表';
