package autotest.com.bocom.entity;

public class ItasApiDiffWithBLOBs extends ItasApiDiff {
    private String fieldNameBased;

    private String fieldName;

    public String getFieldNameBased() {
        return fieldNameBased;
    }

    public void setFieldNameBased(String fieldNameBased) {
        this.fieldNameBased = fieldNameBased == null ? null : fieldNameBased.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }
}