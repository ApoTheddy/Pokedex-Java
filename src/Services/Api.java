package Services;

import Models.Pokemon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Arrays;

public class Api {

    private HttpURLConnection connection;
    private URL uri;

    public ArrayList<Pokemon> getPokemons(int offset) {
        String basicUrl = "https://pokeapi.co/api/v2/pokemon-form/?offset=" + offset + "&limit=50";
        ArrayList<Pokemon> pokemones = new ArrayList<>();

        try {
            uri = new URL(basicUrl);
            connection = (HttpURLConnection) uri.openConnection();
            connection.setRequestMethod("GET");

            try ( var bf = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                List<String> data = Arrays.asList(bf.readLine());
                JSONArray results = new JSONArray(data.toString()).getJSONObject(0).getJSONArray("results");

                for (Object result : results) {
                    pokemones.add(getPokemon(((JSONObject) result).getString("url")));
                }
                return pokemones;
            }
        } catch (IOException ioex) {
            System.out.println("Error: " + ioex.getMessage());
        }
        return null;
    }

    public int getCount() {
        String basicUrl = "https://pokeapi.co/api/v2/pokemon-form/";
        int count = -1;

        try {
            uri = new URL(basicUrl);
            connection = (HttpURLConnection) uri.openConnection();
            connection.setRequestMethod("GET");

            try ( var bf = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                List<String> data = Arrays.asList(bf.readLine());
                count = new JSONArray(data.toString()).getJSONObject(0).getInt("count");
            }
        } catch (IOException ioex) {
            System.out.println("Error: " + ioex.getMessage());
        }
        return count;
    }

    public Pokemon getPokemon(String url) {
        try {
            uri = new URL(url);
            connection = (HttpURLConnection) uri.openConnection();
            connection.setRequestMethod("GET");

            try ( var bf = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                List<String> listaDatos = Arrays.asList(bf.readLine());
                JSONArray jsA = new JSONArray(listaDatos.toString());
                JSONObject rs = jsA.getJSONObject(0);

                return new Pokemon(
                   rs.getString("form_name"),
                   rs.getJSONArray("form_names"),
                   rs.getInt("form_order"),
                   rs.getInt("id"),
                   rs.getBoolean("is_battle_only"),
                   rs.getBoolean("is_default"),
                   rs.getBoolean("is_mega"),
                   rs.getString("name"),
                   rs.getJSONArray("names"),
                   rs.getInt("order"),
                   rs.getJSONObject("pokemon"),
                   rs.getJSONObject("sprites"),
                   rs.getJSONArray("types"),
                   rs.getJSONObject("version_group"));
            }
        } catch (IOException ioex) {
            System.out.println("Error: " + ioex.getMessage());
        }
        return null;
    }
}
