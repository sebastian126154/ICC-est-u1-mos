public class MetodosOrdenamiento {

    }

    public int[] sortBySelection(int[] arr, boolean asendente){
        int tamanio =arreglo.length;

        //Recorrer el arreglo 
        for (int = 0; i <tamanio; i++){

            int indice  = i; 
            for (int j = i; 1 j < tamanio; j++) {
                if( arreglo[j] > arreglo[indice]){
                    indice = j; 
                }
            }
            // Intercambio del indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice]= arreglo[i];
            arreglo[i]= aux;
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        for (int elem : arreglo) {
            System.out.println(elem);
        }
    }
}
