package autotest.com.bocom.entity;

public class ItasApiWithBLOBs extends ItasApi {
    private String apiDesc;

    private String apiReq;

    private String apiExt;

    private String apiRsp;

    public String getApiDesc() {
        return apiDesc;
    }

    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc == null ? null : apiDesc.trim();
    }

    public String getApiReq() {
        return apiReq;
    }

    public void setApiReq(String apiReq) {
        this.apiReq = apiReq == null ? null : apiReq.trim();
    }

    public String getApiExt() {
        return apiExt;
    }

    public void setApiExt(String apiExt) {
        this.apiExt = apiExt == null ? null : apiExt.trim();
    }

    public String getApiRsp() {
        return apiRsp;
    }

    public void setApiRsp(String apiRsp) {
        this.apiRsp = apiRsp == null ? null : apiRsp.trim();
    }
}