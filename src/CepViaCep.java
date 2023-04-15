public record CepViaCep(String cep, String logradouro, String bairro, String localidade, String uf ) {
    @Override
    public String toString() {
        return "CepViaCep{" +
                "cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", endereço='" + localidade + '\'' +
                '}';
    }
}
