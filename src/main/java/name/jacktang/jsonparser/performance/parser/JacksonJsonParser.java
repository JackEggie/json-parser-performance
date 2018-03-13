package name.jacktang.jsonparser.performance.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author tangzhaowei
 */
public class JacksonJsonParser implements JsonParser {

    ObjectMapper objectMapper;

    public void init() {
        objectMapper = new ObjectMapper();
    }

    public String serialize(Object o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public Object parse(String s) {
        try {
            return objectMapper.readValue(s, Object.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
