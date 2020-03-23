package autotest.com.bocom.entity;

public class ItasCaseElement {
    private Integer elementId;

    private String elementName;

    private Integer caseId;

    private String elementValueType;

    private String elementValueString;

    private String elementFrom;

    private String elementKey;

    private String elementValueRemark;

    private String elementType;

    private String elementValueJson;

    public Integer getElementId() {
        return elementId;
    }

    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName == null ? null : elementName.trim();
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getElementValueType() {
        return elementValueType;
    }

    public void setElementValueType(String elementValueType) {
        this.elementValueType = elementValueType == null ? null : elementValueType.trim();
    }

    public String getElementValueString() {
        return elementValueString;
    }

    public void setElementValueString(String elementValueString) {
        this.elementValueString = elementValueString == null ? null : elementValueString.trim();
    }

    public String getElementFrom() {
        return elementFrom;
    }

    public void setElementFrom(String elementFrom) {
        this.elementFrom = elementFrom == null ? null : elementFrom.trim();
    }

    public String getElementKey() {
        return elementKey;
    }

    public void setElementKey(String elementKey) {
        this.elementKey = elementKey == null ? null : elementKey.trim();
    }

    public String getElementValueRemark() {
        return elementValueRemark;
    }

    public void setElementValueRemark(String elementValueRemark) {
        this.elementValueRemark = elementValueRemark == null ? null : elementValueRemark.trim();
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType == null ? null : elementType.trim();
    }

    public String getElementValueJson() {
        return elementValueJson;
    }

    public void setElementValueJson(String elementValueJson) {
        this.elementValueJson = elementValueJson == null ? null : elementValueJson.trim();
    }
}