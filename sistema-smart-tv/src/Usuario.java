public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV SmartTV = new SmartTV();

            SmartTV.diminuirVolume();
            SmartTV.diminuirVolume();
            SmartTV.diminuirVolume();
            SmartTV.aumentarVolume();

            System.out.println("Canal Atual : " + SmartTV.canal);

            SmartTV.mudarCanal(13);


            System.out.println("TV Ligada ? " + SmartTV.ligada);
            System.out.println("Canal Atual : " + SmartTV.canal);
            System.out.println("Volume Atual : " + SmartTV.volume);

            SmartTV.ligar();
            System.out.println("Novo Status TV Ligada ? " + SmartTV.ligada);

    }
}
