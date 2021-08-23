package api.requestData;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Builder
public class ResponseCompanyBody {

    @SerializedName("type")
    private String type;

    @SerializedName("id_company")
    private int id_company;

    @SerializedName("company")
    private Company company;

    public ResponseCompanyBody() {

    }

    class Company {
        @SerializedName("name")
        private String name;

        @SerializedName("type")
        private String type;

        @SerializedName("users")
        private List<String> users = new ArrayList<>();

        public String getName() {
            return name;
        }


    }

    public static void main(String[] args) {
        ResponseCompanyBody responseCompanyBody = new ResponseCompanyBody();
        ResponseCompanyBody.Company.class.getName();
    }
}