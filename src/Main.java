import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Buscador meuBuscador = new Buscador("03637050");

        Gson gson = new Gson();
        Client conexao = new Client();
        String json = conexao.montaJson(meuBuscador);
        CepViaCep meuCep = gson.fromJson(json, CepViaCep.class);
        CriadorJsonFile escreveJson = new CriadorJsonFile();
        escreveJson.escreveJson(meuCep);
        System.out.println(meuCep);


        }
    }
