package autotest.com.bocom.entity;

public class DataApplyElementValue {
    private Integer elementValueId;

    private Integer taskId;

    private String elementName;

    private String elementDesc;

    private String elementValue;

    private String defaultValue;

    private String attribure1;

    private String attribure2;

    private String attribure3;

    private String attribure4;

    private String attribure5;

    public Integer getElementValueId() {
        return elementValueId;
    }

    public void setElementValueId(Integer elementValueId) {
        this.elementValueId = elementValueId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName == null ? null : elementName.trim();
    }

    public String getElementDesc() {
        return elementDesc;
    }

    public void setElementDesc(String elementDesc) {
        this.elementDesc = elementDesc == null ? null : elementDesc.trim();
    }

    public String getElementValue() {
        return elementValue;
    }

    public void setElementValue(String elementValue) {
        this.elementValue = elementValue == null ? null : elementValue.trim();
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    public String getAttribure1() {
        return attribure1;
    }

    public void setAttribure1(String attribure1) {
        this.attribure1 = attribure1 == null ? null : attribure1.trim();
    }

    public String getAttribure2() {
        return attribure2;
    }

    public void setAttribure2(String attribure2) {
        this.attribure2 = attribure2 == null ? null : attribure2.trim();
    }

    public String getAttribure3() {
        return attribure3;
    }

    public void setAttribure3(String attribure3) {
        this.attribure3 = attribure3 == null ? null : attribure3.trim();
    }

    public String getAttribure4() {
        return attribure4;
    }

    public void setAttribure4(String attribure4) {
        this.attribure4 = attribure4 == null ? null : attribure4.trim();
    }

    public String getAttribure5() {
        return attribure5;
    }

    public void setAttribure5(String attribure5) {
        this.attribure5 = attribure5 == null ? null : attribure5.trim();
    }
}