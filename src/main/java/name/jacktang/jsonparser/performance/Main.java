package name.jacktang.jsonparser.performance;

import name.jacktang.jsonparser.performance.model.Person;
import name.jacktang.jsonparser.performance.parser.FastjsonJsonParser;
import name.jacktang.jsonparser.performance.parser.GsonJsonParser;
import name.jacktang.jsonparser.performance.parser.JacksonJsonParser;
import name.jacktang.jsonparser.performance.parser.JsonlibJsonParser;
import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

/**
 * @author tangzhaowei
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("### json-lib ###");
        testJsonlib(100);
        testJsonlib(10000);
        testJsonlib(1000000);

        System.out.println("### gson ###");
        testGson(100);
        testGson(10000);
        testGson(1000000);

        System.out.println("### jackson ###");
        testJackson(100);
        testJackson(10000);
        testJackson(1000000);

        System.out.println("### fastjson ###");
        testFastjson(100);
        testFastjson(10000);
        testFastjson(1000000);
    }

    private static Person getPerson() {
        String name = RandomStringUtils.random(20);
        char sex = RandomStringUtils.random(1).charAt(0);
        int age = new Random().nextInt();
        String job = RandomStringUtils.random(100);
        return new Person(name, sex, age, job);
    }

    private static void testJsonlib(long freq) {
        JsonlibJsonParser jsonlibJsonParser = new JsonlibJsonParser();
        jsonlibJsonParser.init();

        long serializeTime = 0;
        long parseTime = 0;
        for (int i = 0; i < freq; i++) {
            Person person = getPerson();

            long start = System.nanoTime();
            String json = jsonlibJsonParser.serialize(person);
            serializeTime += System.nanoTime() - start;

            start = System.nanoTime();
            jsonlibJsonParser.parse(json);
            parseTime += System.nanoTime() - start;
        }
        System.out.println("serialize avg time by " + freq + " times: " + serializeTime / freq + " nano");
        System.out.println("parse avg time by " + freq + " times: " + parseTime / freq + " nano");
    }

    private static void testGson(long freq) {
        GsonJsonParser gsonJsonParser = new GsonJsonParser();
        gsonJsonParser.init();

        long serializeTime = 0;
        long parseTime = 0;
        for (int i = 0; i < freq; i++) {
            Person person = getPerson();

            long start = System.nanoTime();
            String json = gsonJsonParser.serialize(person);
            serializeTime += System.nanoTime() - start;

            start = System.nanoTime();
            gsonJsonParser.parse(json);
            parseTime += System.nanoTime() - start;
        }
        System.out.println("serialize avg time by " + freq + " times: " + serializeTime / freq + " nano");
        System.out.println("parse avg time by " + freq + " times: " + parseTime / freq + " nano");
    }

    private static void testJackson(long freq) {
        JacksonJsonParser jacksonJsonParser = new JacksonJsonParser();
        jacksonJsonParser.init();

        long serializeTime = 0;
        long parseTime = 0;
        for (int i = 0; i < freq; i++) {
            Person person = getPerson();

            long start = System.nanoTime();
            String json = jacksonJsonParser.serialize(person);
            serializeTime += System.nanoTime() - start;

            start = System.nanoTime();
            jacksonJsonParser.parse(json);
            parseTime += System.nanoTime() - start;
        }
        System.out.println("serialize avg time by " + freq + " times: " + serializeTime / freq + " nano");
        System.out.println("parse avg time by " + freq + " times: " + parseTime / freq + " nano");
    }

    private static void testFastjson(long freq) {
        FastjsonJsonParser fastjsonJsonParser = new FastjsonJsonParser();
        fastjsonJsonParser.init();

        long serializeTime = 0;
        long parseTime = 0;
        for (int i = 0; i < freq; i++) {
            Person person = getPerson();

            long start = System.nanoTime();
            String json = fastjsonJsonParser.serialize(person);
            serializeTime += System.nanoTime() - start;

            start = System.nanoTime();
            fastjsonJsonParser.parse(json);
            parseTime += System.nanoTime() - start;
        }
        System.out.println("serialize avg time by " + freq + " times: " + serializeTime / freq + " nano");
        System.out.println("parse avg time by " + freq + " times: " + parseTime / freq + " nano");
    }
}
