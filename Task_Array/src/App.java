public class App {
    public static void main(String[] args) throws Exception {
        double [] AirTemps = {25.0, 12.7, 17.3, 45.9, 51.0};
        AirTemps[2] = 10.0;
       for(double airtemps : AirTemps){
       System.out.println(airtemps);
       }
    }
}
