package edu.rodrigo.tiposvariaveis;

public class MyClass {
    public double somar(int n1, int n2){
        return n1 + n2;
    }
    public void imprimir(String texto){
        System.out.println(texto);
        // AQUI NÃO PRECISA DE RETURN
        // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }
    public double dividir(int dividendo, int divisor) throws Exception{
        return (double) dividendo / divisor;
        // throws Exception : indica que o métdo ao ser utilzado
        // poderá gerar uma exceção
    }
    private void metodoPrivado(){}
    // este método não pode ser visto por outras classes no programa

    //alguns equívocos estruturais
    public void validar(){
        // este método deveria retornar algum valor
        // no caso boolean
    }
    public void calcularEnviar(){
        // um método deve representar uma única responsabilidade
    }
    public void gravarCliente(String nome, String cpf, Integer idade){
        // este método tem a finalidade de gravar
        // informações de um cliente, por que não criar
        // um objeto cliente e passar como parâmetro?
        // veja abaixo
    }
    public void gravarCliente(Cliente cliente){}
}
