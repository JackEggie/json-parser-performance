package name.jacktang.parser;

import com.alibaba.fastjson.JSON;

/**
 * @author tangzhaowei
 */
public class FastjsonJsonParser implements JsonParser {
    public void init() {}

    public String serialize(Object o) {
        return JSON.toJSONString(o);
    }

    public Object parse(String s) {
        return JSON.parse(s);
    }
}
