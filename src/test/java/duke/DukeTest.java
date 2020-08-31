package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DukeTest {
    private static final String SEPARATOR = System.getProperty("line.separator");
    private static final String LOGO = " _   _       _   _ _            \n"
            + "| | | |     | | | (_)           \n"
            + "| |_| | ___ | |_| |_ _ __   ___ \n"
            + "|  _  |/ _ \\| __| | | '_ \\ / _ \\\n"
            + "| | | | (_) | |_| | | | | |  __/\n"
            + "\\_| |_/\\___/ \\__|_|_|_| |_|\\___| \n";
    private static final String DIVIDER = "<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>";
    private static final String WELCOME_MESSAGE = DIVIDER + "\n Thanks for contacting Hotline! \n"
            + " How can I help you today? \n"
            + DIVIDER + "\n";
    private static final String GOODBYE_MESSAGE =
            "██████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████\n"
            + "██                  ████      ██"
            + "██████  ██████████████████      "
            + "████    ██  ▒▒██████████  ██████"
            + "██  ████████        ░░██    ████"
            + "██████\n"
            + "██                  ████      ██"
            + "██████    ████████  ██████      "
            + "██      ██    ████████    ░░████"
            + "▒▒    ████            ██      ▓▓"
            + "      \n"
            + "██                  ████      ██"
            + "████      ████████    ▒▒██      "
            + "██              ██████      ████"
            + "                              ██"
            + "      \n"
            + "████      ████      ████      ██"
            + "████        ██████              "
            + "██            ████████          "
            + "              ████            ██"
            + "      \n"
            + "████      ████      ▒▒        ██"
            + "██          ▒▒████              "
            + "██          ████████████        "
            + "    ██      ██████            ██"
            + "      \n"
            + "████      ████                ██"
            + "██    ░░      ████              "
            + "██        ████████████████      "
            + "    ██      ██████            ██"
            + "      \n"
            + "████      ████                ██"
            + "                ██              "
            + "██          ██████████████      "
            + "  ████      ████▒▒            ██"
            + "      \n"
            + "████      ████      ████    ██░░"
            + "                ▒▒      ██      "
            + "██            ▓▓██████████      "
            + "  ████                ██        "
            + "      \n"
            + "████      ████      ████    ██  "
            + "      ████              ████░░  "
            + "██            ████████████      "
            + "  ████▒▒              ██        "
            + "      \n"
            + "████      ████      ████    ██▒▒"
            + "      ████    ████      ████████"
            + "██      ██    ████████████      "
            + "  ██████░░          ██████      "
            + "    ██\n"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████    ████████████    "
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "      ██████████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████    "
            + "        ████████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████    "
            + "  ██    ████████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████    "
            + "        ████████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████▓▓  "
            + "      ██  ██████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "██████████████████████████      "
            + "            ████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "██████████████████████████      "
            + "██          ████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "██████████████████████████      "
            + "            ████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "██████████████████████████▒▒    "
            + "          ██████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "████████████████████████████████"
            + "██████\n"
            + "██████████████████        ██████"
            + "██████      ██████████      ████"
            + "██▒▒        ██████▒▒        ████"
            + "██  ██████░░████████████▒▒  ████"
            + "██████\n"
            + "██████████████              ░░██"
            + "██            ████            ██"
            + "              ██              ██"
            + "    ██████    ░░            ████"
            + "██████\n"
            + "████████████░░              ████"
            + "                                "
            + "                                "
            + "      ██                    ████"
            + "██████\n"
            + "████████████      ░░████░░████  "
            + "      ████            ████      "
            + "      ██░░            ██    ▒▒██"
            + "              ██      ██████████"
            + "██████\n"
            + "██████████      ████            "
            + "    ██████          ██████      "
            + "      ████                  ░░██"
            + "██          ▒▒██          ██████"
            + "██████\n"
            + "██████████      ████            "
            + "    ██████          ██████      "
            + "      ████                      "
            + "████        ████          ██████"
            + "██████\n"
            + "██████████      ██████          "
            + "    ████            ████        "
            + "      ██      ██      ████      "
            + "████      ██████            ████"
            + "██████\n"
            + "██████████░░                ▒▒  "
            + "              ██              ██"
            + "              ██                "
            + "████      ██████            ████"
            + "██████\n"
            + "████████████                ████"
            + "            ████            ░░██"
            + "            ████              ██"
            + "████      ██████            ████"
            + "██████\n"
            + "██████████████            ██████"
            + "██          ██████          ████"
            + "          ██████            ████"
            + "████      ██████            ████"
            + "██████";
    private Duke duke;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Test
    public void testRun() {
        duke = new Duke("./testTasks.txt");
        String input = "bye";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        PrintStream ps = new PrintStream(out);
        System.setOut(ps);
        duke.run();
        assertEquals(LOGO + SEPARATOR + WELCOME_MESSAGE
                + SEPARATOR + DIVIDER + SEPARATOR + GOODBYE_MESSAGE
                + SEPARATOR + DIVIDER + SEPARATOR, out.toString());
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
