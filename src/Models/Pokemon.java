package Models;

import org.json.JSONArray;
import org.json.JSONObject;

public class Pokemon {

    private String form_name;
    private JSONArray form_names;
    private int form_order;
    private int id;
    private boolean is_battle_only;
    private boolean is_default;
    private boolean is_mega;
    private String name;
    private JSONArray names;
    private int order;
    private JSONObject pokemon;
    private JSONObject sprites;
    private JSONArray types;
    private JSONObject version_group;

    public Pokemon() {
    }

    public Pokemon(String form_name, JSONArray form_names, int form_order, int id, boolean is_battle_only, boolean is_default, boolean is_mega, String name, JSONArray names, int order, JSONObject pokemon, JSONObject sprites, JSONArray types, JSONObject version_group) {
        this.form_name = form_name;
        this.form_names = form_names;
        this.form_order = form_order;
        this.id = id;
        this.is_battle_only = is_battle_only;
        this.is_default = is_default;
        this.is_mega = is_mega;
        this.name = name;
        this.names = names;
        this.order = order;
        this.pokemon = pokemon;
        this.sprites = sprites;
        this.types = types;
        this.version_group = version_group;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public JSONArray getForm_names() {
        return form_names;
    }

    public void setForm_names(JSONArray form_names) {
        this.form_names = form_names;
    }

    public int getForm_order() {
        return form_order;
    }

    public void setForm_order(int form_order) {
        this.form_order = form_order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_battle_only() {
        return is_battle_only;
    }

    public void setIs_battle_only(boolean is_battle_only) {
        this.is_battle_only = is_battle_only;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public boolean isIs_mega() {
        return is_mega;
    }

    public void setIs_mega(boolean is_mega) {
        this.is_mega = is_mega;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JSONArray getNames() {
        return names;
    }

    public void setNames(JSONArray names) {
        this.names = names;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public JSONObject getPokemon() {
        return pokemon;
    }

    public void setPokemon(JSONObject pokemon) {
        this.pokemon = pokemon;
    }

    public JSONObject getSprites() {
        return sprites;
    }

    public void setSprites(JSONObject sprites) {
        this.sprites = sprites;
    }

    public JSONArray getTypes() {
        return types;
    }

    public void setTypes(JSONArray types) {
        this.types = types;
    }

    public JSONObject getVersion_group() {
        return version_group;
    }

    public void setVersion_group(JSONObject version_group) {
        this.version_group = version_group;
    }

}
