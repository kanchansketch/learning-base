package in.reinventing.course.service;

import in.reinventing.course.model.Course;
import in.reinventing.course.reposistory.CourseRepository;

import java.util.List;

public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> fetchCourse(int pageNumber, int pageSize) {
        return this.courseRepository.findAll(pageNumber,pageSize);
    }

    public List<Course> saveAll(List<Course> courses) {
        return this.courseRepository.saveAll(courses);
    }
}
