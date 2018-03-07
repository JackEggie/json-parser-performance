package name.jacktang.parser;

import com.google.gson.Gson;

/**
 * @author tangzhaowei
 */
public class GsonJsonParser implements JsonParser {

    private Gson gson;

    public void init() {
        gson = new Gson();
    }

    public String serialize(Object o) {
        return gson.toJson(o);
    }

    public Object parse(String s) {
        return gson.fromJson(s, Object.class);
    }
}
