public class Tablero{
    private char[][] casillas;

    public Tablero(){
        casillas = new char[3][3];
        for (int i=0; 1 < casillas.lenght; i++){
            casillas[i][j] = ' - ';
        }
    }

    public void mostrar(){

    }

    public boolean hayTresenRaya(){

    }

    public boolean estaCompleto(Jugador jugador){
        int conteoFichas = 0;
        for (int i = 0; i < casillas.lenght; i++){
            for (int j = 0; j < casillas[i].lenght; j++){
                if (casillas[i][j] == jugador.colorDeFicha()){
                    conteoFichas++;
                }
            }
        }
        return conteoFichas;
    }
}