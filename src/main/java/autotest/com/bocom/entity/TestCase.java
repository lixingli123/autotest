package autotest.com.bocom.entity;

import java.util.Date;

public class TestCase {
    private Integer testCaseId;

    private Integer scopeId;

    private String name;

    private Integer state;

    private Integer category;

    private Integer testType;

    private Integer caseType;

    private String executeCondition;

    private String executeEntrance;

    private String target;

    private String precondition;

    private String dataReq;

    private String steps;

    private String expectation;

    private String taskCreator;

    private Date taskCreatedtime;

    private String status;

    private Integer reuseFlag;

    private Integer isChanged;

    private Integer isExecuted;

    private Integer isTestBase;

    private String caseLevel;

    private String caseVersion;

    private Integer parentId;

    private String attachInfo;

    private Integer funcId;

    private Integer baseResult;

    private Integer untestReason;

    private String unexecuteReason;

    private String executer;

    private String executerEndpoint;

    private Integer result;

    private Date startTime;

    private Date endTime;

    private Integer duration;

    private String executeDesc;

    private Integer returnCode;

    private Integer succussCount;

    private String succussResponse;

    public Integer getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(Integer testCaseId) {
        this.testCaseId = testCaseId;
    }

    public Integer getScopeId() {
        return scopeId;
    }

    public void setScopeId(Integer scopeId) {
        this.scopeId = scopeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public String getExecuteCondition() {
        return executeCondition;
    }

    public void setExecuteCondition(String executeCondition) {
        this.executeCondition = executeCondition == null ? null : executeCondition.trim();
    }

    public String getExecuteEntrance() {
        return executeEntrance;
    }

    public void setExecuteEntrance(String executeEntrance) {
        this.executeEntrance = executeEntrance == null ? null : executeEntrance.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getPrecondition() {
        return precondition;
    }

    public void setPrecondition(String precondition) {
        this.precondition = precondition == null ? null : precondition.trim();
    }

    public String getDataReq() {
        return dataReq;
    }

    public void setDataReq(String dataReq) {
        this.dataReq = dataReq == null ? null : dataReq.trim();
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps == null ? null : steps.trim();
    }

    public String getExpectation() {
        return expectation;
    }

    public void setExpectation(String expectation) {
        this.expectation = expectation == null ? null : expectation.trim();
    }

    public String getTaskCreator() {
        return taskCreator;
    }

    public void setTaskCreator(String taskCreator) {
        this.taskCreator = taskCreator == null ? null : taskCreator.trim();
    }

    public Date getTaskCreatedtime() {
        return taskCreatedtime;
    }

    public void setTaskCreatedtime(Date taskCreatedtime) {
        this.taskCreatedtime = taskCreatedtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getReuseFlag() {
        return reuseFlag;
    }

    public void setReuseFlag(Integer reuseFlag) {
        this.reuseFlag = reuseFlag;
    }

    public Integer getIsChanged() {
        return isChanged;
    }

    public void setIsChanged(Integer isChanged) {
        this.isChanged = isChanged;
    }

    public Integer getIsExecuted() {
        return isExecuted;
    }

    public void setIsExecuted(Integer isExecuted) {
        this.isExecuted = isExecuted;
    }

    public Integer getIsTestBase() {
        return isTestBase;
    }

    public void setIsTestBase(Integer isTestBase) {
        this.isTestBase = isTestBase;
    }

    public String getCaseLevel() {
        return caseLevel;
    }

    public void setCaseLevel(String caseLevel) {
        this.caseLevel = caseLevel == null ? null : caseLevel.trim();
    }

    public String getCaseVersion() {
        return caseVersion;
    }

    public void setCaseVersion(String caseVersion) {
        this.caseVersion = caseVersion == null ? null : caseVersion.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAttachInfo() {
        return attachInfo;
    }

    public void setAttachInfo(String attachInfo) {
        this.attachInfo = attachInfo == null ? null : attachInfo.trim();
    }

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public Integer getBaseResult() {
        return baseResult;
    }

    public void setBaseResult(Integer baseResult) {
        this.baseResult = baseResult;
    }

    public Integer getUntestReason() {
        return untestReason;
    }

    public void setUntestReason(Integer untestReason) {
        this.untestReason = untestReason;
    }

    public String getUnexecuteReason() {
        return unexecuteReason;
    }

    public void setUnexecuteReason(String unexecuteReason) {
        this.unexecuteReason = unexecuteReason == null ? null : unexecuteReason.trim();
    }

    public String getExecuter() {
        return executer;
    }

    public void setExecuter(String executer) {
        this.executer = executer == null ? null : executer.trim();
    }

    public String getExecuterEndpoint() {
        return executerEndpoint;
    }

    public void setExecuterEndpoint(String executerEndpoint) {
        this.executerEndpoint = executerEndpoint == null ? null : executerEndpoint.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getExecuteDesc() {
        return executeDesc;
    }

    public void setExecuteDesc(String executeDesc) {
        this.executeDesc = executeDesc == null ? null : executeDesc.trim();
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public Integer getSuccussCount() {
        return succussCount;
    }

    public void setSuccussCount(Integer succussCount) {
        this.succussCount = succussCount;
    }

    public String getSuccussResponse() {
        return succussResponse;
    }

    public void setSuccussResponse(String succussResponse) {
        this.succussResponse = succussResponse == null ? null : succussResponse.trim();
    }
}