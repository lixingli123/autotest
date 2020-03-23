package autotest.com.bocom.entity;

import java.util.Date;

public class DataProductSolution {
    private Integer solutionId;

    private String solutionName;

    private Integer productId;

    private String solutionDesc;

    private String solutionType;

    private String defaultSolution;

    private String creator;

    private Integer creatorId;

    private Date createTime;

    private String modifier;

    private Integer modifierId;

    private Date modifyTime;

    private String attribure1;

    private String attribure2;

    private String attribure3;

    private String attribure4;

    private String attribure5;

    public Integer getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(Integer solutionId) {
        this.solutionId = solutionId;
    }

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName == null ? null : solutionName.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSolutionDesc() {
        return solutionDesc;
    }

    public void setSolutionDesc(String solutionDesc) {
        this.solutionDesc = solutionDesc == null ? null : solutionDesc.trim();
    }

    public String getSolutionType() {
        return solutionType;
    }

    public void setSolutionType(String solutionType) {
        this.solutionType = solutionType == null ? null : solutionType.trim();
    }

    public String getDefaultSolution() {
        return defaultSolution;
    }

    public void setDefaultSolution(String defaultSolution) {
        this.defaultSolution = defaultSolution == null ? null : defaultSolution.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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