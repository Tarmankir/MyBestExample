package api.bodies;

import com.google.gson.annotations.SerializedName;

public class ResponseCompanyBody {

    @SerializedName("type")
    private String type;

    @SerializedName("id_company")
    private Integer id_company;

    @SerializedName("company")
    private CompanySubObjectBody company;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId_company() {
        return id_company;
    }

    public void setId_company(Integer id_company) {
        this.id_company = id_company;
    }
}