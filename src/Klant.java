/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Klant {
    private String voornaam;
    private String achternaam;
    private String adres;
    private String woonplaats;
    private String postcode;

    public Klant(String voornaam, String achternaam, String address, String woonplaats, String postcode) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.adres = address;
        this.woonplaats = woonplaats;
        this.postcode = postcode;
    }

    public String getAddress() {
        return adres;
    }

    public void setAddress(String address) {
        this.adres = address;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }
    
    
}
