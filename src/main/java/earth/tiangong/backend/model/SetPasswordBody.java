package earth.tiangong.backend.model;

public class SetPasswordBody {
    private String email;

    private String registerCode;

    private String newpwd;

    private String newpwd2;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim().toLowerCase();
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode == null ? null : registerCode.trim();
    }
    
    public String getNewpwd() {
        return newpwd;
    }

    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd == null ? null : newpwd.trim();
    }

    public String getNewpwd2() {
        return newpwd2;
    }

    public void setNewpwd2(String newpwd2) {
        this.newpwd2 = newpwd2 == null ? null : newpwd2.trim();
    }

    public boolean isNewSame() {
        return newpwd.equals(newpwd2);
    }
}
