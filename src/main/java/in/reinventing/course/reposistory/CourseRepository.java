package in.reinventing.course.reposistory;

import in.reinventing.course.model.Course;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CourseRepository {
    private List<Course> courseList = new CopyOnWriteArrayList<>();

    public List<Course> findAll(int pageNumber, int pageSize){
        return this.courseList.subList(pageNumber*pageSize,(pageNumber*pageSize)+pageSize);
    }

    public List<Course> saveAll(List<Course> courses){
        this.courseList.addAll(courses);
        return courses;
    }

    public Course save(Course course){
        this.courseList.add(course);
        return course;
    }
}
