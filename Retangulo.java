
public class Retangulo {



    // Agregação entre retângulo e Ponto2D. Não se encaixa como composição pois um determinado ponto não depende dum retângulo para existir.
    Ponto2D A;
    Ponto2D B;

    public boolean pontoContido(Ponto2D ponto) {

        int x1 = this.A.x;
        int y1 = this.A.y;
        int x2 = this.B.x;
        int y2 = this.B.y;
        int x = ponto.x;
        int y = ponto.y;

        return x <= x1 && x >= x2 || x <= x2 && x >= x1 && y <= y1 && y >= y2 || y <= y2 && y >= y1;

    }

    public Retangulo calculaIntersecao(Retangulo ret){

        int x1,y1,x2,y2;

        int minX = Math.min(this.A.x, this.B.x);
        int maxX = Math.max(this.A.x, this.B.x);
        int minY = Math.min(this.A.y, this.B.y);
        int maxY = Math.max(this.A.y, this.B.y);

        int minX_ret = Math.min(ret.A.x, ret.B.x);
        int maxX_ret = Math.max(ret.A.x, ret.B.x);
        int minY_ret = Math.min(ret.A.y, ret.B.y);
        int maxY_ret = Math.max(ret.A.y, ret.B.y);

        if(minX <= minX_ret && minX_ret <= maxX){
            x1 = minX_ret;
            x2 = Math.min(maxX_ret, maxX);
        }
        else if(minX <= maxX_ret && maxX_ret <= maxX){
            x1 = maxX_ret;
            x2 = Math.min(minX_ret, minX);
        }
        else{
            return new Retangulo(0,0,0,0); // Representa interceção inexistente
        }

        if(minY <= minY_ret && minY_ret <= maxY ){
            y1 = minY_ret;
            y2 = Math.min(maxY_ret, maxY);
        }
        else if(minY <= maxY_ret && maxY_ret <= maxY){
            y1 = maxY_ret;
            y2 = Math.min(minY_ret, minY);
        }
        else{
            return new Retangulo(0,0,0,0); // Representa interceção inexistente
        }

        return new Retangulo(x1,y1,x2,y2);




    }

    public void imprimir(){
        System.out.printf("# Retângulo:\n> A(%d, %d)\n> B(%d, %d)\n", this.A.x, this.A.y, this.B.x, this.B.y);
    }

    public Retangulo(Ponto2D A, Ponto2D B){
        this.A = A;
        this.B = B;
    }
    public Retangulo(int x1, int y1, int x2, int y2){
        this.A = new Ponto2D(x1,y1);
        this.B = new Ponto2D(x2,y2);
    }
}