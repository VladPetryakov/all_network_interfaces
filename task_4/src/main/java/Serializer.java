import com.google.gson.Gson;

public class Serializer<T> {
    Gson gson = new Gson();
    public String toJson(Object object){
        return gson.toJson(object);
    }

    public <T> T fromJson(String json, Class<T> targetClass){
        return gson.fromJson(json, targetClass);
    }
}
