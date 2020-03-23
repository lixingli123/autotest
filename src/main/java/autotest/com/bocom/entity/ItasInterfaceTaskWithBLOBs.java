package autotest.com.bocom.entity;

public class ItasInterfaceTaskWithBLOBs extends ItasInterfaceTask {
    private String reqSchema;

    private String rspSchema;

    public String getReqSchema() {
        return reqSchema;
    }

    public void setReqSchema(String reqSchema) {
        this.reqSchema = reqSchema == null ? null : reqSchema.trim();
    }

    public String getRspSchema() {
        return rspSchema;
    }

    public void setRspSchema(String rspSchema) {
        this.rspSchema = rspSchema == null ? null : rspSchema.trim();
    }
}