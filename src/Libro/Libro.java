package Libro;

    public class Libro {
    int clavelibro, paginas;
    String nombre, autores, editorial;
    public void setNombre(String nombre ){
        this.nombre=nombre;}
    public String getNombre(){
        return(nombre);
    }
    public void setAutores(String autores ){
        this.autores=autores;}
    public String getAutores(){
        return(autores);
    }
    public void setEditorial(String editorial ){
        this.editorial=editorial;}
    public String getEditorial(){
        return(editorial);
    }
    public void setPaginas(int paginas  ){
        this.paginas=paginas;}
    public int getPaginas(){
        return(paginas);
    }
    public void setClavelibro(int clavelibro  ){
        this.clavelibro=clavelibro;}
    public int getClavelibro(){
        return(clavelibro);
    }
    public void imprimir(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Autor: "+getAutores());
        System.out.println("Editorial "+getEditorial());
        System.out.println("N° Páginas: "+getPaginas());
        System.out.println("Clave del libro: "+getClavelibro()+"\n");
    }
    public static void main(String[] args) {
       Libro Libro1= new Libro();
       Libro1.setNombre("El principito");
       Libro1.setAutores("Antoine de Saint-Exupery");
       Libro1.setEditorial("Salamandra");
       Libro1.setPaginas(120);
       Libro1.setClavelibro(10);
       Libro Libro2= new Libro();
       Libro2.setNombre("Soy leyenda");
       Libro2.setAutores("Richard Matheson");
       Libro2.setEditorial("booket");
       Libro2.setPaginas(176);
       Libro2.setClavelibro(20);
       Libro Libro3= new Libro();
       Libro3.setNombre("Los juegos del hambre");
       Libro3.setAutores("Suzanne Collins");
       Libro3.setEditorial("Molino");
       Libro3.setPaginas(274);
       Libro3.setClavelibro(30);
       Libro1.imprimir();
       Libro2.imprimir();
       Libro3.imprimir();
    }

    @Override
    public String toString() {
        return "Libro{" + "clavelibro=" + clavelibro + ", paginas=" +
                paginas + ", nombre=" + nombre + ", autores=" +
                autores + ", editorial=" + editorial + '}';
    }
    
}
