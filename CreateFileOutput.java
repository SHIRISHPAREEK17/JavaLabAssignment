import java.io.*;
public class CreateFileOutput {
    public static void main(String args[]) throws IOException{
        try{
            FileOutputStream fout = new FileOutputStream("MyText.txt");

            fout.write("String to bytes using getBytes method because OutputStream has only byte methods"
                       .getBytes());

            fout.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
