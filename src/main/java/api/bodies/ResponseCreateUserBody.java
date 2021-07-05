package api.bodies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseCreateUserBody {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getCompanies() {
        return companies;
    }

    public void setCompanies(List<String> companies) {
        this.companies = companies;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getFathername1() {
        return fathername1;
    }

    public void setFathername1(String fathername1) {
        this.fathername1 = fathername1;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getParrot() {
        return parrot;
    }

    public void setParrot(String parrot) {
        this.parrot = parrot;
    }

    public String getCavy() {
        return cavy;
    }

    public void setCavy(String cavy) {
        this.cavy = cavy;
    }

    public String getHamster() {
        return hamster;
    }

    public void setHamster(String hamster) {
        this.hamster = hamster;
    }

    public String getSquirrel() {
        return squirrel;
    }

    public void setSquirrel(String squirrel) {
        this.squirrel = squirrel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }
}