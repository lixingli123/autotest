package autotest.com.bocom.entity;

public class ItasApiDiff {
    private Integer id;

    private Integer apiId;

    private Integer apiBased;

    private String apiSection;

    private String changeType;

    private Integer fieldId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public Integer getApiBased() {
        return apiBased;
    }

    public void setApiBased(Integer apiBased) {
        this.apiBased = apiBased;
    }

    public String getApiSection() {
        return apiSection;
    }

    public void setApiSection(String apiSection) {
        this.apiSection = apiSection == null ? null : apiSection.trim();
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType == null ? null : changeType.trim();
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }
}