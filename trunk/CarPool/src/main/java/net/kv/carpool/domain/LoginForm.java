package net.kv.carpool.domain;

import org.springframework.stereotype.Component;

@Component
public class LoginForm
{
    private boolean failed;
    private String j_username;
    private String j_password;

    public boolean isFailed()
    {
        return failed;
    }

    public void setFailed(boolean failed)
    {
        this.failed = failed;
    }

    public String getJ_username()
    {
        return j_username;
    }

    public void setJ_username(String j_username)
    {
        this.j_username = j_username;
    }

    public String getJ_password()
    {
        return j_password;
    }

    public void setJ_password(String j_password)
    {
        this.j_password = j_password;
    }

}
