package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonToHtmlTest {

    private static final String SRC_TEST_RESOURCES = "src/test/resources/demo/";

    @Test
    public void convertTest1() {
        convertTest("test1.json", "test1.html");
    }

    @Test
    public void convertTest2() {
        convertTest("test2.json", "test2.html");
    }

    @Test
    public void convertTest3() {
        convertTest("test3.json", "test3.html");
    }

    @Test
    public void convertTest4() {
        convertTest("test4.json", "test4.html");
    }

    @Test
    public void convertTest5() {
        convertTest("test5.json", "test5.html");
    }

    @Test
    public void convertTest6() {
        convertTest("test6.json", "test6.html");
    }

    @Test
    public void convertTest10() {
        convertTest("test10.json", "test10.html");
    }

    private void convertTest(String jsonFileName, String htmlFileName) {
        String expected = new TextFile(SRC_TEST_RESOURCES + htmlFileName).load();
        String actual = new JsonToHtml().convert(new TextFile(SRC_TEST_RESOURCES + jsonFileName).load());

        assertEquals(normalizeLineBreaks(expected), normalizeLineBreaks(actual));
    }

    private String normalizeLineBreaks(String source) {
        return source.replaceAll("\r", "");
    }
}
