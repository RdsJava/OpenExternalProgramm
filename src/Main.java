import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        {
            try {
                // Command to create an external process
                String command = "C:\\Program Files\\iZotope\\RX 8 Audio Editor\\win64/iZotope RX 8 Audio Editor.exe";

                // Running the above command
                Runtime run = Runtime.getRuntime();
                Process proc = run.exec(command);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}