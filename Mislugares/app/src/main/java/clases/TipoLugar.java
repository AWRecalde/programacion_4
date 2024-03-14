package clases;

import java.io.Serializable;

import columbia.edu.py.mislugares.R;


public enum TipoLugar implements Serializable {
    OTROS("otros", R.drawable.otros),
    //El R.drawable. trae la imagen en la carpeta drawable
    //El id que le identifica a a la imagen OTROS es otros
    RESTAURANTE("Restaurante", R.drawable.restaurante),

    BAR("Bar", R.drawable.bar),

    COPAS("Copas", R.drawable.copas),

    ESPECTACULO("Espectaculo", R.drawable.espectaculos),

    HOTEL("Hotel", R.drawable.hotel),

    COMPRAS("Compras", R.drawable.compras),

    EDUCACION("Educacion", R.drawable.educacion),

    DEPORTE("Deporte", R.drawable.deporte),

    NATURALEZA("Naturaleza", R.drawable.naturaleza),

    GASOLINERA("Gasolinera", R.drawable.gasolinera);

    private final String texto;

    private final int recurso;

    //Al momento que creamos esto ↓↓, llamamos al constructor
    TipoLugar(String texto, int recurso){
        this.texto = texto;
        this.recurso = recurso;
    }

    private String getTexto() {
        return texto;
    }

    public int getRecurso() {
        return recurso;
    }
    //Cadena para llenar los lugares: arreglo o cadena
    public static String[] obtenerTipoLugares(){
        String tipoLugares[] = new String[TipoLugar.values().length];
                                     //↑↑ Aqui definimos la cadena, la cantidad de objetos de arriba
        for(TipoLugar tipoLugar : TipoLugar.values() ){
            tipoLugares[tipoLugar.ordinal() ] =
                     tipoLugar.getTexto();
        }
        return tipoLugares;
    }

}
