public class Main {
    public static void main(String[] args) {

        // IF

        var numeroIf = 3;

        if (numeroIf == 0) {
            System.out.println("El número es 0.");
        } else if (numeroIf < 0) {
            System.out.println("El número es Negativo.");
        } else {
            System.out.println("El número es Positivo.");
        }

        // WHILE

        var numeroWhile = 1;

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);
            numeroWhile = numeroWhile + 1; //numeroWhile++
            System.out.println(numeroWhile);

        // FOR


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // SWITCH

        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion);
        }
    }
}