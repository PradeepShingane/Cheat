import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class UmpireTypeBO
{

 public UmpireType createUmpireType (String data)
 {
  String s=data;
  UmpireType up=new UmpireType(s);
  return up;
  
 }
}
