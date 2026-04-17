package in.reinventing.course.model;

import java.util.Objects;

public class Course implements Cloneable{
    private String courseId;
    private String title;
    private String description;
    private Level level;
    private Status status;
    private String createdBy;
    private MetaData metaData;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public Course clone() throws CloneNotSupportedException{
        return (Course) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course course)) return false;
        return Objects.equals(getCourseId(), course.getCourseId()) && Objects.equals(getTitle(), course.getTitle()) && Objects.equals(getDescription(), course.getDescription()) && getLevel() == course.getLevel() && getStatus() == course.getStatus() && Objects.equals(getCreatedBy(), course.getCreatedBy()) && Objects.equals(getMetaData(), course.getMetaData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId(), getTitle(), getDescription(), getLevel(), getStatus(), getCreatedBy(), getMetaData());
    }
}
