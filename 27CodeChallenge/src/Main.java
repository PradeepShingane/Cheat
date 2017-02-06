import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;


public class Main {

public static void main(String[] args) throws Exception, IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
TreeMap<String,Player> tm=new TreeMap<String,Player>();
System.out.println("Enter the number of players");
int n=Integer.parseInt(br.readLine());
String capn = null,name,team,skill;
Player p = null;
int i=0;
for(i=0;i<n;i++)
{
System.out.println("Enter the details of the player "+(i+1));
capn=br.readLine();
name=br.readLine();
team=br.readLine();
skill=br.readLine();
p=new  Player(name,team,skill);
tm.put(capn, p);
}

for ( Map.Entry<String, Player> entry : tm.entrySet()) {
    String key = entry.getKey();
    
    Player player2 = entry.getValue();
    
    System.out.println(key+player2.toString());
    }// do something with key and/or tab
}  
}





