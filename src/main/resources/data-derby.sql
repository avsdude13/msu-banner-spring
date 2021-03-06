-- Fixtures for Students
insert into student (id, first_name, last_name) values (default, 'John', 'Doe');
insert into student (id, first_name, last_name) values (default, 'Jim', 'Johnson');
insert into student (id, first_name, last_name) values (default, 'Lewis', 'Smith');

-- Fixtures for Professors
insert into professor (id, first_name, last_name) values (default, 'Albert', 'Einstein');
insert into professor (id, first_name, last_name) values (default, 'Isacc', 'Newton');
insert into professor (id, first_name, last_name) values (default, 'Thomas', 'Edison');

-- Fixtures for Buildings
insert into building (id, building_name, number_of_rooms) values (default, 'Science', 80);
insert into building (id, building_name, number_of_rooms) values (default, 'King Center', 60);
insert into building (id, building_name, number_of_rooms) values (default, 'Student Success', 40);

-- Fixtures for Courses
insert into course (course_id, course_name, course_number, course_dept, credit_value, level, description, learning_objectives)values (1, 'Calculus', 'MTH-1410', 'MT', 4, 'Freshman', 'description', 'learning_objectives');
insert into course (course_id, course_name, course_number, course_dept, credit_value, level, description, learning_objectives)values (2, 'Software Engineering', 'CS-3250', 'CS', 4, 'Junior', 'description', 'learning_objectives');
insert into course (course_id, course_name, course_number, course_dept, credit_value, level, description, learning_objectives)values (3, 'Computer Science 1', 'CS-1010', 'CS', 4, 'Freshman', 'description', 'learning_objectives');

-- Fixtures for Semesters
insert into semester (id, semester_name, start_date, end_date) values (default, 'Fall', '2017-12-20', '2017-12-30');
insert into semester (id, semester_name, start_date, end_date) values (default, 'Spring', '2017-12-20', '2017-12-30');
insert into semester (id, semester_name, start_date, end_date) values (default, 'Spring', '2017-12-20', '2017-12-30');


-- Fixtures for Sections
insert into section (id, room_number, start_time, end_time, weekday, professor_id, course_course_id, building_id, semester_id) values (default, 1022, '12:12', '12:13', 'Mon', 1, 1, 1, 1);
insert into section (id, room_number, start_time, end_time, weekday, professor_id, course_course_id, building_id, semester_id) values (default, 1012, '12:12', '12:13', 'Mon', 1, 2, 1, 1);
insert into section (id, room_number, start_time, end_time, weekday, professor_id, course_course_id, building_id, semester_id) values (default, 1043, '12:12', '12:13', 'Mon', 1, 1, 2, 2);
