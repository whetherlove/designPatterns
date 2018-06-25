package GoF.decoratorPattern.CustomInputStream;

import java.io.*;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.CustomInputStream
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:53
 * @UpdateDate: 2018/6/25/025 21:53
 */
public class test {

    public static void main(String[] args) throws IOException {

        InputStream is = new CustomInputStream(
                new BufferedInputStream(
                        new FileInputStream("E:\\code\\intelliJ\\designPatterns\\src\\GoF\\decoratorPattern\\CustomInputStream\\test.txt")));

        int c;
        while ((c = is.read()) != -1)
            System.out.print((char)c);

        is.close();
    }
}
