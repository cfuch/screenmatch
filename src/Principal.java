import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula mipelicula = new Pelicula();
        mipelicula.setNombre("Encanto");
        mipelicula.setFechaLanzamiento(2021);
        mipelicula.setDuracionEnMinutos(120);
        mipelicula.setIncluidoEnElPlan(true);

        mipelicula.muestraFichaTecnica();
        mipelicula.evalua(10);
        mipelicula.evalua(10);
        mipelicula.evalua(7.8);
        System.out.println(mipelicula.getTotalDeLasEvaluaciones());
        System.out.println(mipelicula.calculamedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorCapitulo(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("matrix");
        otraPelicula.setDuracionEnMinutos(1998);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidoEnElPlan(true);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(mipelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos "
                + calculadora.getTiempoTotal() + " minutos");

    }










}
