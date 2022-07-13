public class Mensagem {

    public static void mostrarMensagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                apresentarMensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                apresentarMensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                apresentarMensagemBoaNoite();
                break;
            default:
                horaInvalida();
                break;
        }
    }

    public static void apresentarMensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void apresentarMensagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }

    public static void apresentarMensagemBoaNoite() {
        System.out.println("Boa Noite!");
    }

    public static void horaInvalida() {
        System.out.println("Hora inválida, por favor, informar uma hora válida !!");
    }





}
