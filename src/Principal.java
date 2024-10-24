public class Principal {
    public static void main(String[] args) {
        Pelicula mipelicula = new Pelicula();
        mipelicula.nombre = "encanto";
        mipelicula.fechaLanzamiento = 2021;
        mipelicula.duracionEnMinutos = 120;

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        mipelicula.muestraFichaTecnica();
        otraPelicula.muestraFichaTecnica();

        mipelicula.evalua(10);
        mipelicula.evalua(10);
        System.out.println(mipelicula.sumaDeLasEvaluaciones);
        System.out.println(mipelicula.totalDeLasEvaluaciones);
        System.out.println(mipelicula.calculamedia());







    }
}
