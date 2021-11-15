package bodies;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
public class CompanyBody {

    @SerializedName("type")
    private String type;

    @SerializedName("name")
    private String name;

    @SerializedName("users")
    private List<String> users;
}