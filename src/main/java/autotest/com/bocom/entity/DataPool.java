package autotest.com.bocom.entity;

import java.util.Date;

public class DataPool {
    private Integer poolId;

    private Integer productId;

    private Integer solutionId;

    private String elementName;

    private Integer dataId;

    private String elementValue;

    private String dataStatus;

    private Date createTime;

    private String attribure1;

    private String attribure2;

    private String attribure3;

    private String attribure4;

    private String attribure5;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName == null ? null : elementName.trim();
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getElementValue() {
        return elementValue;
    }

    public void setElementValue(String elementValue) {
        this.elementValue = elementValue == null ? null : elementValue.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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