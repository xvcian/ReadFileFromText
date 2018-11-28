import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public  class ReadFileFromText {

    public void readFile(String filePath) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void readFile2(String filePath) {
        BufferedReader br;
        String read = "";
        try {
            File file = new File(filePath);
            FileReader fileread = new FileReader(file);
            br = new BufferedReader(fileread);
            while ((read = br.readLine()) != null) {
                System.out.print(read + "\t\n");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "/home/lulu/hamlet.txt.html";
        new ReadFileFromText().readFile2(filePath);
    }
}
