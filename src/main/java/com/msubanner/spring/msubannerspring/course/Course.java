//Course class, written by Eric Kearney and Thiengo Le
package com.msubanner.spring.msubannerspring.course;

import javax.persistence.*;

import com.msubanner.spring.msubannerspring.building.Building;
import com.msubanner.spring.msubannerspring.student.Student;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long courseId;
    private String courseDept = "TBD";
    private String courseName;
    private String courseNumber;
    private int creditValue;
    private String level;
    private String description;
    private String learningObjectives;

    @OneToOne
    @JoinColumn(name = "building_buildingName")
    private Building buildingObject;
    
    /**
     * This is the default constructor for the courses class that will
     * take no inputed values and create a course.
     */
    public Course(){
    	this.courseId = Long.valueOf(0);
        this.courseDept = "TBD";
        this.courseName = "TBD";
        this.courseNumber = "TBD";
        this.creditValue = 0;
        this.level = "Freshman";
        this.description = "TBD";
        this.learningObjectives = "TBD";
    }

    /**
     * This constructs a new course with all the specified variables
     * @param courseId The Id number of the course, (e.g.) 3250 in CS 3250
     * @param courseDept The department of the course, (e.g.) CS in CS 3250
     * @param courseName The name of the course
     * @param courseNumber The number of the course
     * @param creditValue How many credits the course is worth
     * @param level (e.g.) Freshman, sophomore, etc.
     * @param description Tell prospects (students) what the course is about
     * @param learningObjectives What students should learn by the end of the course
     */
    public Course(
            Long courseId,
            String courseDept,
            String courseName,
            String courseNumber,
            int creditValue,
            String level,
            String description,
            String learningObjectives)
    {
        this.courseId = courseId;
        this.courseDept = courseDept;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.creditValue = creditValue;
        this.level = level;
        this.description = description;
        this.learningObjectives = learningObjectives;
    }

    /**
     * getCourseDept will return the department that the course is for
     * @return courseDept a string of the department name
     */
    public String getCourseDept() {
        return courseDept;
    }

    /**
     * setCourseDept will set the department that the course is for
     * @param courseDept a string of the department name
     */
    public void setCourseDept(String courseDept) {
        this.courseDept = courseDept;
    }

    /**
     * getCourseId will return the unique id assigned to the course
     * @return couseId unique long value for the course
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * setCourseId will set the unique id assigned to the course
     * @param courseId unique long value for the course
     */
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    /**
     * getCourseName will return the name assigned to the course
     * @return the name of the selected course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * setCourseName will change the name assigned to the course
     * @param courseName a string with the new name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    /**
     * getCourseNumber will return the number assigned to the course
     * @return the number of the selected course
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * setCourseNumber will change the number assigned to the course
     * @param courseNumber a string with the new number of the course
     */
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     * getCreditValue will return the credit weight of the course
     * @return an integer with the credit hour weight of the course
     */
    public int getCreditValue() {
        return creditValue;
    }

    /**
     * setCreditValue will change the credit hour weighting of the course
     * @param creditValue is an integer with the new credit hour weight of the course
     */
    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    /**
     * getLevel will return the name of the year that the course is made for
     * example freshman, sophmore, junior, senior
     * @return a string with the name of the student year the course is for
     */
    public String getLevel() {
        return level;
    }

    /**
     * setLevel will change the course to a different year
     * example freshman, sophmore, junior, senior
     * @param level is a string of the new year level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * getDescription will return a brief description of the course purpose
     * @return a string listing the course purpose
     */
    public String getDescription() {
        return description;
    }

    /**
     * setDescription will change the description of a course
     * @param description is a string with the new course description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getLearningObjectives will return the objectives that the course will meet
     * throughout the semester
     * @return a string listing the objectives of the course
     */
    public String getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * setLearningObjectives will change the objectives of the course
     * @param learningObjectives is a string listing the new learning objectives
     */
    public void setLearningObjectives(String learningObjectives) {
        this.learningObjectives = learningObjectives;
    }
}
