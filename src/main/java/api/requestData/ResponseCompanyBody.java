package api.requestData;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class ResponseCompanyBody {

    @SerializedName("type")
    private String type;

    @SerializedName("id_company")
    private int id_company;
}