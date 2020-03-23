package autotest.com.bocom.entity;

import java.util.Date;

public class ItasMethod {
    private Integer methodId;

    private String methodCode;

    private String methodName;

    private String paramCount;

    private String methodType;

    private String methodStaus;

    private String methodDesc;

    private String paramDesc;

    private String exampleDesc;

    private Integer creator;

    private Integer reviser;

    private Date timeCreated;

    private Date timeRevised;

    private String methodSrc;

    public Integer getMethodId() {
        return methodId;
    }

    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    public String getMethodCode() {
        return methodCode;
    }

    public void setMethodCode(String methodCode) {
        this.methodCode = methodCode == null ? null : methodCode.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getParamCount() {
        return paramCount;
    }

    public void setParamCount(String paramCount) {
        this.paramCount = paramCount == null ? null : paramCount.trim();
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType == null ? null : methodType.trim();
    }

    public String getMethodStaus() {
        return methodStaus;
    }

    public void setMethodStaus(String methodStaus) {
        this.methodStaus = methodStaus == null ? null : methodStaus.trim();
    }

    public String getMethodDesc() {
        return methodDesc;
    }

    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc == null ? null : methodDesc.trim();
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc == null ? null : paramDesc.trim();
    }

    public String getExampleDesc() {
        return exampleDesc;
    }

    public void setExampleDesc(String exampleDesc) {
        this.exampleDesc = exampleDesc == null ? null : exampleDesc.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getReviser() {
        return reviser;
    }

    public void setReviser(Integer reviser) {
        this.reviser = reviser;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeRevised() {
        return timeRevised;
    }

    public void setTimeRevised(Date timeRevised) {
        this.timeRevised = timeRevised;
    }

    public String getMethodSrc() {
        return methodSrc;
    }

    public void setMethodSrc(String methodSrc) {
        this.methodSrc = methodSrc == null ? null : methodSrc.trim();
    }
}