package com.example.pokedex;

import android.util.Log;
import org.json.*;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.StringReader;
import java.util.ArrayList;

public class ParseApplications {
    private static final String TAG = "ParseApplications";

    private ArrayList<FeedEntry> applications;

    public ParseApplications() {
        applications = new ArrayList<>();
    }

    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }

    public boolean parse(String xmlText) {
        boolean status = true; // parse com sucesso?
        FeedEntry entry = null; // entrada do RSS a ser lida
        boolean inEntry = false; // estamos em um <entry>?
        String textValue = ""; // valor texto de cada atributo
//        Log.d(TAG, xmlText);

        try {
            String jsonString = xmlText;
            JSONObject obj = new JSONObject(jsonString);
            JSONArray arr = obj.getJSONArray("pokemon");

            for (int i = 0; i < arr.length(); i++)
            {

                entry = new FeedEntry();

                entry.setName(arr.getJSONObject(i).getString("name"));
                entry.setArtist(arr.getJSONObject(i).getString("num"));
                entry.setSummary(arr.getJSONObject(i).getString("height"));
                entry.setImgURL(arr.getJSONObject(i).getString("img"));
                entry.setReleaseDate(arr.getJSONObject(i).getString("weight"));

                applications.add(entry);
            }

            for (FeedEntry feedEntry : applications) {
                Log.d(TAG, "******************************");
                Log.d(TAG, feedEntry.toString());
            }
        } catch (Exception ex) {
            Log.e(TAG, "parse: Erro ao fazer parse: " + ex.getMessage());
            status = false;
        }
        return status;
    }
}
