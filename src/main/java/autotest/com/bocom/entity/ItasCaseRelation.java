package autotest.com.bocom.entity;

public class ItasCaseRelation {
    private Integer id;

    private Integer flowCaseId;

    private Integer subCaseId;

    private Integer subCaseSeq;

    private Integer apiId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlowCaseId() {
        return flowCaseId;
    }

    public void setFlowCaseId(Integer flowCaseId) {
        this.flowCaseId = flowCaseId;
    }

    public Integer getSubCaseId() {
        return subCaseId;
    }

    public void setSubCaseId(Integer subCaseId) {
        this.subCaseId = subCaseId;
    }

    public Integer getSubCaseSeq() {
        return subCaseSeq;
    }

    public void setSubCaseSeq(Integer subCaseSeq) {
        this.subCaseSeq = subCaseSeq;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }
}