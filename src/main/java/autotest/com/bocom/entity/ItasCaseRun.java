package autotest.com.bocom.entity;

import java.util.Date;

public class ItasCaseRun {
    private Integer runId;

    private Integer parentRunId;

    private Integer taskId;

    private Integer parentId;

    private Integer caseSeq;

    private String caseType;

    private Integer caseId;

    private Integer caseRunId;

    private Integer runTimes;

    private String runStatus;

    private Integer runDuration;

    private Date runStart;

    private Date runOver;

    private String runEngine;

    private String runTester;

    private String runResult;

    public Integer getRunId() {
        return runId;
    }

    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    public Integer getParentRunId() {
        return parentRunId;
    }

    public void setParentRunId(Integer parentRunId) {
        this.parentRunId = parentRunId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCaseSeq() {
        return caseSeq;
    }

    public void setCaseSeq(Integer caseSeq) {
        this.caseSeq = caseSeq;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getCaseRunId() {
        return caseRunId;
    }

    public void setCaseRunId(Integer caseRunId) {
        this.caseRunId = caseRunId;
    }

    public Integer getRunTimes() {
        return runTimes;
    }

    public void setRunTimes(Integer runTimes) {
        this.runTimes = runTimes;
    }

    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus == null ? null : runStatus.trim();
    }

    public Integer getRunDuration() {
        return runDuration;
    }

    public void setRunDuration(Integer runDuration) {
        this.runDuration = runDuration;
    }

    public Date getRunStart() {
        return runStart;
    }

    public void setRunStart(Date runStart) {
        this.runStart = runStart;
    }

    public Date getRunOver() {
        return runOver;
    }

    public void setRunOver(Date runOver) {
        this.runOver = runOver;
    }

    public String getRunEngine() {
        return runEngine;
    }

    public void setRunEngine(String runEngine) {
        this.runEngine = runEngine == null ? null : runEngine.trim();
    }

    public String getRunTester() {
        return runTester;
    }

    public void setRunTester(String runTester) {
        this.runTester = runTester == null ? null : runTester.trim();
    }

    public String getRunResult() {
        return runResult;
    }

    public void setRunResult(String runResult) {
        this.runResult = runResult == null ? null : runResult.trim();
    }
}