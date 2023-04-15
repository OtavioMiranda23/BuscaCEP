import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class CriadorJsonFile {
    public void  escreveJson(CepViaCep meuCep) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escreve = new FileWriter(meuCep.cep() + ".json");
        escreve.write(gson.toJson(meuCep));
        escreve.close();
    }
}
