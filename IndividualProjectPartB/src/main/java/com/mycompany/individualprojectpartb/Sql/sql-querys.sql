-- all courses
select * from course;

-- all students
select * from student;

-- all trainers
select* from trainer;

-- all students per course
select course_title,student_firstName,student_lastName,student_tuitionFees,student_dateOfBirth
from student JOIN course_student ON
student.student_ID = course_student.student_id
JOIN course on course.course_ID = course_student.course_id;

-- all trainers per course
select course_title,trainer_firstName,trainer_lastName
from trainer JOIN course_trainer ON
trainer.trainer_ID = course_trainer.trainer_id
JOIN course ON course.course_ID = course_trainer.course_id;

-- all assignments per course
select course_title,asgnmnt_title,asgnmnt_desc,asgnmnt_subDate
from assignment JOIN course_asgnmnt ON
assignment.asgnmnt_ID = course_asgnmnt.asgnmnt_id
JOIN course ON course.course_ID = course_asgnmnt.course_id;

-- assignments per course per student
select course_title,student_firstName,student_lastName,asgnmnt_title,asgnmnt_desc
from student JOIN course_asgnmnt_student ON
student.student_ID = course_asgnmnt_student.student_id JOIN
course ON course.course_ID = course_asgnmnt_student.course_id JOIN
assignment ON assignment.asgnmnt_ID = course_asgnmnt_student.asgnmnt_id;