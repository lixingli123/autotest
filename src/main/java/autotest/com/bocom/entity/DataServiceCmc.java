package autotest.com.bocom.entity;

public class DataServiceCmc {
    private Integer id;

    private Integer cmcTaskId;

    private Integer cmcCaseId;

    private Integer dataTaskId;

    private String attribute1;

    private String attribute2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCmcTaskId() {
        return cmcTaskId;
    }

    public void setCmcTaskId(Integer cmcTaskId) {
        this.cmcTaskId = cmcTaskId;
    }

    public Integer getCmcCaseId() {
        return cmcCaseId;
    }

    public void setCmcCaseId(Integer cmcCaseId) {
        this.cmcCaseId = cmcCaseId;
    }

    public Integer getDataTaskId() {
        return dataTaskId;
    }

    public void setDataTaskId(Integer dataTaskId) {
        this.dataTaskId = dataTaskId;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }
}