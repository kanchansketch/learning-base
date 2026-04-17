package in.reinventing.enroll.model;

public class Enroll {
    private String id;
    private String courseId;
    private String userId;
    private Status status;
    private double progress;
    private String lastAccessedNodeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public String getLastAccessedNodeId() {
        return lastAccessedNodeId;
    }

    public void setLastAccessedNodeId(String lastAccessedNodeId) {
        this.lastAccessedNodeId = lastAccessedNodeId;
    }
}
