package api.bodies;

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
public class RequestUserBody {

    @SerializedName("email")
    private String email;

    @SerializedName("name")
    private String name;

    @SerializedName("tasks")
    private List<TaskBody> tasks;
}