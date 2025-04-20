import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion {

    public static float convertir(String origen, String destino, float valor) {
        Gson archivo = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
        Monedas tomoDatos = null;
        float resultado = 0;
        try {
            String url = "https://v6.exchangerate-api.com/v6/165ddcf7c83d7287f469eea8/pair/" + origen + "/" + destino;
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest requerimento = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> respuesta = cliente.send(requerimento, HttpResponse.BodyHandlers.ofString());
            tomoDatos = archivo.fromJson(IOUtils.toString(new URL(url)), Monedas.class);
            resultado = valor * tomoDatos.conversion_rate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("Error inesperado ");
        }
        return resultado;
    }
}
