package in.reinventing.course.api;

import in.reinventing.course.model.Course;
import in.reinventing.course.service.CourseService;

import java.util.List;

public class CourseAPI {
    private CourseService courseService;

    public CourseAPI(CourseService courseService) {
        this.courseService = courseService;
    }

    public List<Course> courseList(int pageNumber, int pageSize){
        return this.courseService.fetchCourse(pageNumber,pageSize);
    }

    public List<Course> saveAll(List<Course> courses){
        return this.courseService.saveAll(courses);
    }
}
