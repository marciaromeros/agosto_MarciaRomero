package Practico5;

public class Libro {
    //Atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int numPag;

    //Constructores
    //Constructor sin parámetro
    public Libro(){
        this.titulo = "Sin Título";

    }

    //Constructor con parametros
    public Libro(int unIsbn, String unTitulo, String unAutor, int unNumPag){
        this.isbn = unIsbn;
        this.titulo = unTitulo;
        if(unAutor.isEmpty()){
            this.autor = "Desconocido";
        }else{
            this.autor = unAutor;
        }

        this.numPag = unNumPag;
    }

    //Métodos Get u Set
    public void setIsbn(int unIsbn){
        this.isbn = unIsbn;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public void setTitulo(String untitulo){
        this.titulo = untitulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String unAutor){
        this.autor = unAutor;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setNumPag (int unNumPag){
        this.numPag = unNumPag;
    }

    public int getNumPag(){
        return this.numPag;
    }

    //Metodo toString

    public String toString(){
        String retorno = "El libro " + this.getTitulo() + " con ISBN " + this.getIsbn() + " creado por el autor " + this.getAutor() + " y tiene " + this.getNumPag() + " páginas";
            return retorno;
    }

}
