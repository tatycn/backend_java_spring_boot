package earth.tiangong.backend.model;

public class ApiLoginCode {
    private String userId;

    private String apiLoginCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getApiLoginCode() {
        return apiLoginCode;
    }

    public void setApiLoginCode(String apiLoginCode) {
        this.apiLoginCode = apiLoginCode == null ? null : apiLoginCode.trim();
    }

    public ApiLoginCode() {
    }

    public ApiLoginCode(String userId, String apiLoginCode) {
        this.userId = userId;
        this.apiLoginCode = apiLoginCode;
    }

    public Boolean check(String code) {
        if (code.equals(this.apiLoginCode)) {
            return true;
        } else {
            return false;
        }
    }
}
