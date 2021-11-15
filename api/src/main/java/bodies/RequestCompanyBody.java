package bodies;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Builder
public class RequestCompanyBody {

    @SerializedName("company_name")
    private String company_name;

    @SerializedName("company_type")
    private String company_type;

    @SerializedName("company_users")
    private List<String> company_users;

    @SerializedName("email_owner")
    private String email_owner;
}