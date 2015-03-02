
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private int[] hashSet;

    public MiHashSet()
    {
        hashSet = new int[0];
    }

    /**
     * Añade el elemento al conjunto si no estaba.
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int conjunto)
    {

    }

    /**
     * Vacia el conjunto
     */
    public void clear() 
    {
        conjunto = new int[0];
    }

    /**
     * Devuelve verdadero si el conjunto contiene el elemento, falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean buscar = false;
        int indice = 0;
        while(indice < numeros.length && !buscar)
        {
            if(numbers[indice]== elemento)
            {
                buscar = true;
            }
            buscar= buscar + 1;
        }
        return buscar;
    }

    /**
     * Devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        return (numbers.length == 0);
    }

    /**
     * Elimina del conjunto el elemento dado. Si no existiera devuelve falso; si existe en el conjunto 
     * devuelve verdadero.
     */
    public int remove(int elemento)
    {
        boolean existe=false;
        int indice = 0;
        int[] nuevonumero = new int[numero.length - 1];
        while(numero.length > indice && !existe)
        {
            if(numero[indice]==elemento)
            {
                existe=true;
                int pos=0;
                while(pos < numero.length)
                {
                    if(pos < indice)
                    {
                        nuevonumero[pos]= numero[pos]; 
                    }
                    else if(pos > indice)
                    {
                        nuevonumero[pos -1]= numero[pos]; 
                    }
                    pos++;
                }

            }

            numero=nuevonumero;
            indice++;
        }
        return existe;
    }

    /**
     * Devuelve el número de elementos del conjunto.
     */
    public int size() 
    {
        return numero.length;
    }

    /**
     * Devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y 
     * entre corchetes.
     */
    public toString()
    {
        String cadena = "[]";

    }

    /**
     * Devuelve verdadero si el paramentro es igual al conjunto sobre el que se invoca y falso en otro
     * caso.
     */
    public equals(MiHashSet otroConjunto)
    {

    }
}
