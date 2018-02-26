package com.sc.listeMagasins;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nasredine on 25/02/2018.
 */

class Magasin {

    private String nom;
    private String adresse;
    private double latitude;
    private double longitude;
    private String logo;


    public static ArrayList<Magasin> getAllMagasins(){
        ArrayList<Magasin> magasins = new ArrayList<>();
        Magasin carrefour = new Magasin();
        carrefour.setNom("Carrefour Atlantes");
        carrefour.setAdresse("Zac De Rochepinard Cc Atlantes, " +
                "Avenue Jacques Duclos, 37700 Saint-Pierre-des-Corps");
        carrefour.setLogo("https://upload.wikimedia.org/wikipedia/fr/" +
                "thumb/3/3b/Logo_Carrefour.svg/1278px-Logo_Carrefour.svg.png");
        carrefour.setLatitude(47.380436);
        carrefour.setLongitude(0.714537);

        Magasin auchan = new Magasin();


        auchan.setNom("Auchan Chambray-lès-Tours");
        auchan.setAdresse("Centre Commercial la Vrillonnerie, Rue de Joué, 37170 Chambray-lès-Tours");
        auchan.setLogo("https://ecommercenews.eu/wp-content/uploads/2015/09/auchan.png");
        auchan.setLatitude(47.338925);
        auchan.setLongitude(0.700196);


        Magasin lidl = new Magasin();



        lidl.setNom("Lidl");
        lidl.setAdresse("19 bis rue Général de Gaulle, 37000 Tours");
        lidl.setLogo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQweZoM3bWOw75M8MsAjrlLkMjMCSe2AOydVHyi4HFnrEkJ9sqNOHJkLfc");
        lidl.setLatitude(47.380179);
        lidl.setLongitude(0.694488);

        magasins.add(carrefour);
        magasins.add(lidl);
        magasins.add(auchan);

        return magasins;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}