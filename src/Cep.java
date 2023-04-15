public class Cep {
    private String cep;
    private String endereco;
    private String bairro;
    private String estado;
    private String uf;

    public String getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEstado() {
        return estado;
    }

    public String getUf() {
        return uf;
    }


    @Override
    public String toString() {
        return "cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + estado + '\'' +
                '}';
    }
}
