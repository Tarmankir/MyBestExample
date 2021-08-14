package api.requestData;

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
    private List<String> tasks;

    @SerializedName("companies")
    private List<String> companies;

    @SerializedName("hobby")
    private String hobby;

    @SerializedName("adres")
    private String adres;

    @SerializedName("name1")
    private String name1;

    @SerializedName("surname1")
    private String surname1;

    @SerializedName("fathername1")
    private String fathername1;

    @SerializedName("cat")
    private String cat;

    @SerializedName("dog")
    private String dog;

    @SerializedName("parrot")
    private String parrot;

    @SerializedName("cavy")
    private String cavy;

    @SerializedName("hamster")
    private String hamster;

    @SerializedName("squirrel")
    private String squirrel;

    @SerializedName("phone")
    private String phone;

    @SerializedName("inn")
    private String inn;

    @SerializedName("gender")
    private String gender;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("date_start")
    private String date_start;
}