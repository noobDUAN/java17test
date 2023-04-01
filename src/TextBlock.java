import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextBlock {
    /**
     * 无法动态传值，好看不好用！正常拼SQL谁会这么玩啊；
     * @param args
     */
    public static void main(String[] args) {
        String name = "wayne";
        String textBlock = """
                    <p>
                        张三，里斯，王二麻子
                    <p>
                """;
        System.out.println(textBlock);
    }

    public static void testReaderTransferTo() throws IOException {
        StringReader sr = new StringReader("Hello");
        StringWriter sw = new StringWriter();
        sr.transferTo(sw);
        sw.append(" world!");
        System.out.println(sw.getBuffer()); //打印Hello world!
    }

    public static void testInputStreamTransferTo() throws IOException {
        InputStream ist = new ByteArrayInputStream("hello world".getBytes(StandardCharsets.UTF_8));
        ist.transferTo(System.out); //打印Hello world!
    }
}
