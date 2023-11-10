package src.java;

import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.*;
import java.util.stream.Collectors;

public class Pokedex{

    private final int NDEX_COL = 0;
    private final int NAME_COL = 1;
    private final int FORM_COL = 2;
    private final int TYPE1_COL = 3;
    private final int TYPE2_COL = 4;
    private final int TOTAL_COL = 5;
    private final int HP_COL = 6;
    private final int ATK_COL = 7;
    private final int DEF_COL = 8;
    private final int SPA_COL = 9;
    private final int SPD_COL = 10;
    private final int SPE_COL = 11;
    private final int GEN_COL = 12;

    private Map<String,Pokemon> pokemonMap;


    public void readCSV(String args)throws Exception{
        try(FileReader fr = new FileReader(args)){
            System.out.printf("Preparing %s...\n",args);
            BufferedReader br = new BufferedReader(fr);
            List<Pokemon> pArray = new ArrayList<>(); //arraylist is better than linkedlist here, as it's just storing data
            pokemonMap = br.lines()
                .skip(1) //skip the first line as it's just the headers
                .filter(line -> line != null) //check if there is a better way to do this
                //split each line with the comma delimiter
                .map(row -> row.trim().split(","))
                //turns each line (which is an array) into a Pokemon object, using map
                .map(row -> new Pokemon(row[NDEX_COL],row[NAME_COL],row[FORM_COL],row[TYPE1_COL],row[TYPE2_COL]
                ,row[TOTAL_COL],row[HP_COL],row[ATK_COL],row[DEF_COL],row[SPA_COL]
                ,row[SPD_COL],row[SPE_COL],row[GEN_COL]))
                //collets and puts it into a map
                //so now, the current object in the stream is a Pokemon object
                //the stream then uses the Pokemon obj as a reference to collect into a map with the name as the key
                .collect(Collectors.toMap(pokemon -> pokemon.getFullName(),pokemon -> pokemon))
            ;
            System.out.printf("%s processed. \n",args);
        }
    }

    public Map<String,Pokemon> getMap(){
        return pokemonMap;
    }

}