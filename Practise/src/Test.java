import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Test {
 public static void main(String[] args) throws IOException {
  File file=new File("d:/data");
  byte buffer[]=new byte[(int)file.length()+1];
  FileInputStream fis=new FileInputStream(file);
  fis.read(buffer);
  FileWriter fw=new FileWriter("d:/temp.txt");
  fw.write(new String(buffer));}}
