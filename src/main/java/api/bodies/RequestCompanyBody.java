package api.bodies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestCompanyBody {

    @SerializedName("company_name")
    private String company_name;

    @SerializedName("company_type")
    private String company_type;

    @SerializedName("company_users")
    private List<String> company_users;

    @SerializedName("email_owner")
    private String email_owner;

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_type() {
        return company_type;
    }

    public void setCompany_type(String company_type) {
        this.company_type = company_type;
    }

    public List<String> getCompany_users() {
        return company_users;
    }

    public void setCompany_users(List<String> company_users) {
        this.company_users = company_users;
    }

    public String getEmail_owner() {
        return email_owner;
    }

    public void setEmail_owner(String email_owner) {
        this.email_owner = email_owner;
    }
}