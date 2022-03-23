package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyReader {

    public String readLine() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try  {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Something wrong";

    }
}
