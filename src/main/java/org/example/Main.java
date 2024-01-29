package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

       try {
           String s = "https://www.ekstrabladet.dk";
           URL urlEb =  new URL(s);
           InputStream stream = urlEb.openStream();
           BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
              String inputLine = "";
              while (inputLine != null) {
                  inputLine = reader.readLine();
                  System.out.println(inputLine);
              }

    } catch (Exception e) {
           e.printStackTrace();
       }
    }
}