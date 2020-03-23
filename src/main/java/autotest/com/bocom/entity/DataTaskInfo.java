package autotest.com.bocom.entity;

import java.util.Date;

public class DataTaskInfo {
    private Integer taskId;

    private Integer productId;

    private String taskName;

    private String taskDesc;

    private Date applyTime;

    private Date finishTime;

    private String status;

    private String taskType;

    private String applyDepart;

    private Integer applicantId;

    private String applicant;

    private String phoneNo;

    private String result;

    private String remark;

    private String attribure1;

    private String attribure2;

    private String attribure3;

    private String attribure4;

    private String attribure5;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc == null ? null : taskDesc.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getApplyDepart() {
        return applyDepart;
    }

    public void setApplyDepart(String applyDepart) {
        this.applyDepart = applyDepart == null ? null : applyDepart.trim();
    }

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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