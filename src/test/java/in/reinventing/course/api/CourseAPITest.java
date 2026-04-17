package in.reinventing.course.api;

import in.reinventing.course.model.*;
import in.reinventing.course.reposistory.CourseRepository;
import in.reinventing.course.service.CourseService;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class CourseAPITest extends TestCase {
    private CourseRepository courseRepository = new CourseRepository();
    private CourseService courseService = new CourseService(courseRepository);
    private CourseAPI courseAPI = new CourseAPI(courseService);
    private List<Course> courses = new ArrayList<>();

    public void setUp() throws Exception {
        super.setUp();
        Course course = new Course();
        course.setCourseId(UUID.randomUUID().toString());
        course.setTitle("Java Programming");
        course.setDescription("Kanchan Sharma is the creator of project who have been working experience of 4 years in this industry on Java technology.");
        course.setLevel(Level.BEGINNER);
        course.setStatus(Status.PUBLISHED);
//===============================================Meta Start ===========================================//
        MetaData metaData = new MetaData();

        //=====Category==============================//
        Category category = new Category();
        category.setId(UUID.randomUUID().toString());
        category.setName("Software Development");
        metaData.setCategory(category);

        //=====Language=============================//
        Language language = new Language();
        language.setId(UUID.randomUUID().toString());
        language.setName("English");
        language.setDescription("English Description");
        metaData.setLanguage(language);

        //=======Tags===============================//
        MetaData.Tag tag = new MetaData.Tag();
        tag.setTag("Java");

        MetaData.Tag tag2 = new MetaData.Tag();
        tag.setTag("Programming");

        metaData.setTags(new MetaData.Tag[]{tag,tag2});

        course.setMetaData(metaData);
//==============================================Meta End ==============================================//

        this.courses.add(course);

        Course course1 = course.clone();
        course1.setCourseId(UUID.randomUUID().toString());
        course1.setTitle("Python");
        this.courses.add(course1);

        Course course2 = course.clone();
        course2.setCourseId(UUID.randomUUID().toString());
        course2.setTitle("Javascript");
        this.courses.add(course2);

        courseAPI.saveAll(this.courses);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCourseList() {
        final List<Course> courses1 = courseAPI.saveAll(this.courses);
        Assert.assertEquals(courses1,this.courses);
    }

    public void testCourseFind(){
        final List<Course> courses1 = courseAPI.courseList(0,this.courses.size());
        Assert.assertEquals(courses1,this.courses);
    }
}