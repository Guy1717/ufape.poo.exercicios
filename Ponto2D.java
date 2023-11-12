public class Ponto2D {

    int x,y;

    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Ponto2D(int c){
        this.x = c;
        this.y = c;
    }
    public Ponto2D(Ponto2D ponto){
        this.x = -ponto.x;
        this.y = -ponto.y;
    }

    public void imprimir() {
        System.out.printf("> Ponto (%d, %d)\n", this.x,this.y);
    }

}

