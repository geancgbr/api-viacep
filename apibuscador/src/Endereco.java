public record Endereco(String cep, String logradouro,
                       String localidade, String complemento, String uf) {

    public void write(String json) {
    }
}
