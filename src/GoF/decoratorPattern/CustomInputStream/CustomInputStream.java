package GoF.decoratorPattern.CustomInputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ProjectName: designPatterns
 * @Package: GoF.decoratorPattern.CustomInputStream
 * @Description:
 * @Author: Jacob Zhang
 * @CreateDate: 2018/6/25/025 21:47
 * @UpdateDate: 2018/6/25/025 21:47
 */
public class CustomInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected CustomInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c==-1 ? c : Character.toUpperCase((char)c);
    }
}
