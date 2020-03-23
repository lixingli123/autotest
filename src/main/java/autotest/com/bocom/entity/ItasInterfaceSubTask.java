package autotest.com.bocom.entity;

import java.util.Date;

public class ItasInterfaceSubTask {
    private Integer subTaskId;

    private Integer taskId;

    private String status;

    private Date cteateTime;

    public Integer getSubTaskId() {
        return subTaskId;
    }

    public void setSubTaskId(Integer subTaskId) {
        this.subTaskId = subTaskId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
    }
}