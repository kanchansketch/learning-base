package in.reinventing.course.model.node;

public class Dependency {
    private String id;
    private String nodeId;
    private String dependentNodeId;
    private Type type;

    enum Type{
        PREREQUISITE,
        OPTIONAL,
        RECOMMENDED
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getDependentNodeId() {
        return dependentNodeId;
    }

    public void setDependentNodeId(String dependentNodeId) {
        this.dependentNodeId = dependentNodeId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
