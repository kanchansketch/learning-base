package in.reinventing.course.service;

import in.reinventing.course.api.CourseAPI;
import in.reinventing.course.model.Course;
import in.reinventing.course.reposistory.CourseRepository;

import java.util.List;

public class CourseService {
    private CourseRepository courseReposiory;

    public List<Course> fetchCourse(int pageNumber, int pageSize) {
        return this.courseReposiory.findAll(pageNumber,pageSize);
    }

    public List<Course> saveAll(List<Course> courses) {
        return this.courseReposiory.saveAll(courses);
    }
}
