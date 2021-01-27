import java.util.Hashtable;
import java.util.StringTokenizer;

public class TesteHash {
    public void teste(){
        Hashtable<Integer, String> hteTeste = new Hashtable<>();
        StringTokenizer str = new StringTokenizer("AT-ROVER0-WAYPOINT3,~AT-ROVER0-WAYPOINT0:AT-ROVER0-WAYPOINT3,~AT-ROVER0-WAYPOINT1:AT-ROVER0-WAYPOINT3,~AT-ROVER0-WAYPOINT02");
        int i=0;
        while (str.hasMoreTokens()){
            hteTeste.put(i,str.nextToken());
            i++;
        }

        hteTeste.forEach((k,v) -> System.out.println("Key : "+ k+", Value : " + v));

    }

}
