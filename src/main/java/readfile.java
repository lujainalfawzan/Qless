import java.io.*;
import java.util.*;
class readfile{
    private Scanner x;

    public void openFile(){
        try{
            x=new Scanner(new File("C:\\Users\\NEW\\Desktop\\Shop.txt"));
        }
        catch (Exception e){
            System.out.println("could not find file");
        }
    }

    public void readFile(){
        while (x.hasNext()){
            String a=x.next();
            String b=x.next();
            String c=x.next();
            System.out.printf("%s %s %s",a,b,c);
        }

    }

    public void closeFile(){
        x.close();
    }

    public static void main(String[] args) {
        readfile r=new readfile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
