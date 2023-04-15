import java.io.IOException;

public class Buscador {
    private String cep;

    public String getCep() {
        return cep;
    }

    private String url;

    public String getUrl() {
        return url;
    }


    public Buscador(String cep) throws IOException, InterruptedException {
        cep = cep.replace(" ", "");
        if (cep.contains("-")) {
            cep = cep.replace("-", "");
        }
        if (cep.length() != 8 ) {
            System.out.println("=> O cep informado não contém 8 caracteres.");
            throw new IllegalArgumentException();
        }
        if (!cep.matches("[0-9]*")){
            System.out.println("=> O cep informado não contém apenas números.");
            throw new IllegalArgumentException();
        }
        this.cep = cep;
        url = "https://viacep.com.br/ws/" + cep + "/json/";
    }


}
