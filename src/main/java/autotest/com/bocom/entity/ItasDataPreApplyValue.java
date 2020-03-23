package autotest.com.bocom.entity;

public class ItasDataPreApplyValue {
    private Integer elementId;

    private String elementName;

    private Integer applyId;

    private String elementValueType;

    private String elementValueString;

    private String elementValueComplex;

    private String elementValueRemark;

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

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
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

    public String getElementValueComplex() {
        return elementValueComplex;
    }

    public void setElementValueComplex(String elementValueComplex) {
        this.elementValueComplex = elementValueComplex == null ? null : elementValueComplex.trim();
    }

    public String getElementValueRemark() {
        return elementValueRemark;
    }

    public void setElementValueRemark(String elementValueRemark) {
        this.elementValueRemark = elementValueRemark == null ? null : elementValueRemark.trim();
    }
}