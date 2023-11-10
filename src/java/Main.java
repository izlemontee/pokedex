package src.java;


import java.util.Map;
public class Main {

    public static void main (String[] args) throws Exception{
        Pokedex pd = new Pokedex();
        pd.readCSV(args[0]);
        Map<String,Pokemon> pm = pd.getMap();
        //System.out.println(pm);
        
        Pokemon p = pm.get("Garchomp");
    
        //System.out.println(pm.containsKey("Garchomp"));
        //String name = p.getName().replaceAll("\"", "");
        //System.out.println(name);
        System.out.println(p.getType1());
        System.out.println(p.getType2());
        
    }
    
}
