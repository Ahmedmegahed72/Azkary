package com.example.azkary;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class Add extends AsyncTaskLoader<ArrayList<String>> {
    String url = null;
    ArrayList<String> students = new ArrayList<>();

    public Add(@NonNull Context context, String url) {
        super(context);
        this.url = url;
    }

    @Nullable
    @Override
    public ArrayList<String> loadInBackground() {
        try {
            String jsonstring = null;
            jsonstring = getHttpRequest(new URL(url));
            JSONObject jsonRoot = new JSONObject(jsonstring);
            JSONArray jsonArray = jsonRoot.getJSONArray("names");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject name = jsonArray.getJSONObject(i);
                 String data= name.getString("name");
                 students.add(data);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return students;
    }

    private String getHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        HttpsURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpsURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(20000);
            urlConnection.connect();
            inputStream = urlConnection.getInputStream();
            jsonResponse = readinputstream(inputStream);
        } catch (Exception e) {

        } finally {
            if (urlConnection != null)
                urlConnection.disconnect();
        }
        if (inputStream != null)
            inputStream.close();
        return jsonResponse;
    }

    private String readinputstream(InputStream inputStream) throws IOException {
        StringBuilder result = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));

            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                result.append(line);
                line = reader.readLine();

            }
        }
        return result.toString();
    }
}
