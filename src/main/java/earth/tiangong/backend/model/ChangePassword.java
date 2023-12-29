package earth.tiangong.backend.model;

import earth.tiangong.backend.security.util.SecurityUtils;

public class ChangePassword {
    private String oldpwd;

    private String newpwd;

    private String newpwd2;

    public String getOldpwd() {
        return oldpwd;
    }

    public void setOldpwd(String oldpwd) {
        this.oldpwd = oldpwd == null ? null : oldpwd.trim();
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

    public boolean isOldSame() {
        return newpwd.equals(oldpwd);
    }

    public String checkPwd(String pwd) {
        if (isNewSame()) {
            if (isOldSame()) {
                return "新密码不能与旧密码相同";
            } else {
                if (SecurityUtils.matchesPassword(oldpwd, pwd)) {
                    return "ok";
                } else {
                    return "旧密码不正确";
                }
            }
        } else {
            return "两次输入的密码不一致";
        }
    }
}
