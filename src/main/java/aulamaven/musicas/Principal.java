package aulamaven.musicas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import aulamaven.musicas.Musica;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        final List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Home", "3 min"));
        musicas.add(new Musica("Roling in the Deep", "4 min"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(musicas);

        FileWriter writer;

        try{
            writer = new FileWriter("musicas.json");
            writer.write(json);
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        //run mvn package on src to package a jar file of the application
    }
}
