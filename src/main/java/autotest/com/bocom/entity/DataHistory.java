package autotest.com.bocom.entity;

import java.util.Date;

public class DataHistory {
    private Integer historyId;

    private Integer productId;

    private Integer userId;

    private Integer taskId;

    private Integer dataId;

    private Integer caseId;

    private Date useTime;

    private String attribure1;

    private String attribure2;

    private String attribure3;

    private String attribure4;

    private String attribure5;

    public Integer getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Integer historyId) {
        this.historyId = historyId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
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