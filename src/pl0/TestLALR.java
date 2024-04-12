package pl0;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TestLALR extends TestRunner {

    /**
     * Construct a new parameterized test instance
     *
     * @param program PL0 source code currently being tested
     */
    public TestLALR(File program) {
        super(program);
    }

    @Override
    public void run(PrintStream outputStream) throws IOException {
        Runner runner = new PL0_LALR();
        runner.run(program.getCanonicalPath(), outputStream);
    }
}
