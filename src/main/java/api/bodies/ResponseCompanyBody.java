package api.bodies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseCompanyBody {

    @SerializedName("type")
    private String type;

    @SerializedName("id_company")
    private Integer id_company;

    @SerializedName("company")
    private CompanySubObjectBody company;

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    @SerializedName("inn")
    private Integer inn;

    @SerializedName("ogrn")
    private Integer ogrn;

    @SerializedName("kpp")
    private Integer kpp;

    @SerializedName("phone")
    private Integer phone;

    @SerializedName("adress")
    private String adress;

    @SerializedName("users")
    private List<String> users;

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