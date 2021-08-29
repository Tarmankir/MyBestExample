package api.bodies;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@Data
@Builder
public class ResponseCompanyBody {

    @SerializedName("type")
    private String type;

    @SerializedName("company")
    private CompanyBody company;
}