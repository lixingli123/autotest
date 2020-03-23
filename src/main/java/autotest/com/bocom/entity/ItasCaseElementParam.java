package autotest.com.bocom.entity;

public class ItasCaseElementParam {
    private Integer caseEntranceParamId;

    private Integer caseId;

    private Integer entranceParamId;

    private String paramValue;

    private String paramDesc;

    public Integer getCaseEntranceParamId() {
        return caseEntranceParamId;
    }

    public void setCaseEntranceParamId(Integer caseEntranceParamId) {
        this.caseEntranceParamId = caseEntranceParamId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getEntranceParamId() {
        return entranceParamId;
    }

    public void setEntranceParamId(Integer entranceParamId) {
        this.entranceParamId = entranceParamId;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }
}