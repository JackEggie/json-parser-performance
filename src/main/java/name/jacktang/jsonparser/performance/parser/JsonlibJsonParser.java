package name.jacktang.jsonparser.performance.parser;

import net.sf.json.JSONObject;

/**
 * @author tangzhaowei
 */
public class JsonlibJsonParser implements JsonParser {
    public void init() {}

    public String serialize(Object o) {
        return JSONObject.fromObject(o).toString();
    }

    public Object parse(String s) {
        return JSONObject.toBean(JSONObject.fromObject(s));
    }
}
