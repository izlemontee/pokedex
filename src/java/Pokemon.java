package src.java;

public class Pokemon {
    
    private String ndex;
    private String name;
    private String form;
    private String type1;
    private String type2;
    private String total;
    private String hp;
    private String atk;
    private String def;
    private String spa;
    private String spd;
    private String spe;
    private String gen;
    private String fullName;



    public Pokemon(String ndex,String name, String form, String type1, String type2,
    String total, String hp, String atk, String def, String spa, String spd, String spe, String gen){
        this.ndex = ndex;
        this.name = name;
        this.form = form;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spa = spa;
        this.spd = spd;
        this.spe = spe;
        this.gen = gen;

        name = name.replaceAll("\"", "");
        form = form.replaceAll("\"", "");
        type1 = type1.replaceAll("\"", "");
        type2 = type2.replaceAll("\"", "");

        if((form.equals(" ")) || (form.equals("")) || (form.equals(null))){
            fullName = name;

        }
        else{
            fullName = name + "-" +form;
        }
        removeQuotation(name,form,type1,type2,fullName);
        System.out.println(fullName);

    }

    public void removeQuotation(String name, String form, String type1, String type2, String fullName){
        name = name.replaceAll("\"", "");
        form = form.replaceAll("\"", "");
        type1 = type1.replaceAll("\"", "");
        type2 = type2.replaceAll("\"", "");
        fullName = fullName.replaceAll("\"", "");

    }

    public String getFullName(){
        fullName = fullName.replaceAll("\"", "");
        return fullName;
    }
    public String getName(){
        name = name.replaceAll("\"", "");
        return name;
    }
    public String getNdex(){
        return ndex;
    }
    public String getForm(){
        form = form.replaceAll("\"", "");
        return form;
    }
    public String getType1(){
        //type1 = type1.replaceAll("\"", "");
        return type1;
    }
    public String getType2(){
        //type2 = type2.replaceAll("\"", "");
        return type2;
    }
    public String getHP(){
        return hp;
    }
    public String getTotal(){
        return total;
    }
    public String getAtk(){
        return atk;
    }
    public String getDef(){
        return def;
    }
    public String getSpa(){
        return spa;
    }
    public String getSpd(){
        return spd;
    }
    public String getSpe(){
        return spe;
    }
    public String getGen(){
        return gen;
    }
}
