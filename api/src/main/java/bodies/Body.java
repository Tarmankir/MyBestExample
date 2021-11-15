package bodies;

import com.google.gson.GsonBuilder;

public interface Body {

    default String toJsonWithoutNull() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create().toJson(this);
    }
}