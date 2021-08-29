package api.bodies;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class TaskBody {

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;
}