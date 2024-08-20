class Contador {
    static int contadorEstatico = 0; // Variable estática
    int contadorNoEstatico = 0; // Variable no estática

    Contador() {
        contadorEstatico++;
        contadorNoEstatico++;
    }

    static void metodoEstatico() {
        System.out.println("Método estático, contadorEstatico: " + contadorEstatico);
    }

    void metodoNoEstatico() {
        System.out.println("Método no estático, contadorNoEstatico: " + contadorNoEstatico);
    }
}

public class Test {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        // Llamando a métodos estáticos y no estáticos
        Contador.metodoEstatico(); // Puede llamarse sin crear un objeto
        c1.metodoNoEstatico(); // Necesita un objeto para llamarse
        c2.metodoNoEstatico();

        // Imprimiendo valores
        System.out.println("Contador estático: " + Contador.contadorEstatico); // Se comparte entre todos los objetos
        System.out.println("Contador no estático de c1: " + c1.contadorNoEstatico); // Es único para cada objeto
        System.out.println("Contador no estático de c2: " + c2.contadorNoEstatico);
    }
}
