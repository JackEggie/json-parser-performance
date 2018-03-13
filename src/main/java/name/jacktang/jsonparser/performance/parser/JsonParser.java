package name.jacktang.jsonparser.performance.parser;

/**
 * @author tangzhaowei
 */
public interface JsonParser {

    /**
     * init resources
     */
    public void init();

    /**
     * serialize object to json
     * @param o
     * @return
     */
    public String serialize(Object o);

    /**
     * serialize json to object
     * @param s
     * @return
     */
    public Object parse(String s);
}
