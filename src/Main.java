import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File fileSource = new File("source.txt");
        File fileDest = new File("deft.txt");
        try {
            if(!fileSource.exists()){
                throw new NullPointerException();
            }
            FileInputStream fileInput = new FileInputStream(fileSource);
            FileOutputStream fileOutput =new FileOutputStream(fileDest);
            byte[] a = new byte[100];
            int i;
            while ((i=fileInput.read(a)) !=-1){
                fileOutput.write(a,0,i);
            }
            fileInput.close();
            fileOutput.close();
            System.out.println("the file:" +fileDest.getName()+" has: "+fileDest.length()+ "byte");
        }catch (NullPointerException e){
            System.out.println("tep nguon khong ton tai");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
