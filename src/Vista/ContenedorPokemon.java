package Vista;

import Componentes.ContenedorType;
import Models.Pokemon;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.json.JSONObject;

public class ContenedorPokemon extends javax.swing.JPanel {

    private Pokemon pokemon;

    public ContenedorPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
        initComponents();
        asignarValoresPokemon();
    }

    public void asignarValoresPokemon() {
        lblSpritePokemon.setText("");

        lblId.setText("#" + pokemon.getId());
        lblNombrePokemon.setText(pokemon.getName());
        URL spritePokemon = null;
        Image image = null;

        try {
            spritePokemon = new URL(pokemon.getSprites().getString("front_default"));
            image = ImageIO.read(spritePokemon);

            // Estableciendo el sprite de mi pokemon a un JLABLEL
            lblSpritePokemon.setIcon(new ImageIcon(image.getScaledInstance(200, 200, 100)));

            pokemon.getTypes().forEach((type) -> {
                JSONObject typePokemon = ((JSONObject) type).getJSONObject("type");
                Color color = establecerColor(typePokemon.getString("name"));

                pnlTypePokemon.add(new ContenedorType(color, typePokemon.getString("name"), pokemon.getTypes().length()));

            });
        } catch (IOException ioex) {
            System.out.println("Ocurrio un error: " + ioex.getMessage());
        }
    }

    public Color establecerColor(String type) {
        Color color = null;

        switch (type) {
            case "grass":
                color = new Color(0x6EBF2B);
                break;
            case "poison":
                color = new Color(0x99469B);
                break;
            case "fire":
                color = Color.ORANGE;
                break;
            case "water":
                color = new Color(0xA0BCEF);
                break;
            case "flying":
                color = new Color(0xA0B1F9);
                break;
            case "bug":
                color = new Color(0xAEC12A);
                break;
            case "ground":
                color = new Color(0xE2BA70);
                break;
            case "rock":
                color = new Color(0xC3AE54);
                break;
            case "ghost":
                color = new Color(0x9482B0);
                break;
            case "steel":
                color = new Color(0x628795);
                break;
            case "electric":
                color = new Color(0xC1943D);
                break;
            case "pyschic":
                color = new Color(0xE90964);
                break;
            case "ice":
                color = new Color(0x9AD8D8);
                break;
            case "fighting":
                color = new Color(0x90383F);
                break;
        }

        return color;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSpritePokemon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNombrePokemon = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlTypePokemon = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 190));

        lblSpritePokemon.setText("SPRITE POKE");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblNombrePokemon.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 24)); // NOI18N
        lblNombrePokemon.setForeground(new java.awt.Color(0, 0, 0));
        lblNombrePokemon.setText("NOMBRE POKEMON");

        lblId.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID");

        pnlTypePokemon.setLayout(new java.awt.GridLayout());
        jScrollPane1.setViewportView(pnlTypePokemon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombrePokemon)
                            .addComponent(lblId))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombrePokemon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSpritePokemon)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSpritePokemon)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombrePokemon;
    private javax.swing.JLabel lblSpritePokemon;
    private javax.swing.JPanel pnlTypePokemon;
    // End of variables declaration//GEN-END:variables
}
