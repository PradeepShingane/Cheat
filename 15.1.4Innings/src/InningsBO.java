import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class InningsBO {
	 
   public  Innings createInnings(String data) {
	String[] a=data.split(",");
	Innings i=new Innings(Long.parseLong(a[0]),a[1]);
	return i;

}
}
