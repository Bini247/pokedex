package com.example.pokedex;

public class FeedEntry {
    private String name;
    private String artist;
    private String releaseDate;
    private String pokemonHeight;
    private String pokemonTypes;
    private String summary;
    private String imgURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPokemonHeight() {
        return pokemonHeight;
    }

    public void setPokemonHeight(String pokemonHeight) {
        this.pokemonHeight = pokemonHeight;
    }

    public String getPokemonTypes() {
        return pokemonTypes;
    }

    public void setPokemonTypes(String pokemonHeight) {
        this.pokemonTypes = pokemonHeight;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public String toString() {
        return "name=" + name + '\n' +
                "artist=" + artist + '\n' +
                "releaseDate=" + releaseDate + '\n' +
                "imgURL=" + imgURL + '\n';
    }
}
