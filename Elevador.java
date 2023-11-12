public class Elevador {

    int capacidadePessoas;
    int pessoas;
    int andar;
    int maxAndar;

    public void entradaPessoa(int qtdeEntrada) {
        if(this.pessoas + qtdeEntrada <= this.capacidadePessoas) this.pessoas += qtdeEntrada;
    }

    public void saidaPessoa(int qtdeSaida) {
        if(this.pessoas - qtdeSaida >= 0) this.pessoas -= qtdeSaida;
    }

     public void subir(int qtdeAndares) {
        if(this.andar + qtdeAndares <= this.maxAndar) this.andar += qtdeAndares;
    }

    public void descer(int qtdeAndares) {
        if(andar - qtdeAndares >= 0) andar -= qtdeAndares;
    }

    public void imprimir(){
        System.out.printf("# Elevador\n> Capacidade Max: %d\n> Pessoas: %d\n> Topo: %d\n> Andar Atual: %d\n", capacidadePessoas, pessoas, maxAndar, andar);
    }

    Elevador(int capacidadePessoas, int maxAndar){
        this.capacidadePessoas = capacidadePessoas;
        this.maxAndar = maxAndar;
    }
    Elevador(int capacidadePessoas, int maxAndar, int andar){
        this.capacidadePessoas = capacidadePessoas;
        this.maxAndar = maxAndar;
        this.andar = andar;
    }
    Elevador(int capacidadePessoas, int maxAndar, int andar, int pessoas){
        this.capacidadePessoas = capacidadePessoas;
        this.maxAndar = maxAndar;
        this.andar = andar;
        this.pessoas = pessoas;
    }

}

