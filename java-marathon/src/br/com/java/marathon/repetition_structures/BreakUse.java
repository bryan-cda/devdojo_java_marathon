package br.com.java.marathon.repetition_structures;

public class BreakUse {
    public static void main(String[] args) {
        double carPrice = 30000;
        double parcelPrice = 0;

        for(int parcel = 1; parcel < carPrice; parcel++){
            parcelPrice = carPrice / parcel;

            if(parcelPrice < 1000){
                System.out.println(parcel);
                break;
            } else{
                if(parcelPrice == 1034.4827586206898){
                    System.out.println("1034");
                    continue;
                }
            }
            System.out.println(String.format("Parcel value option R$ %s in %s times...", Math.round(parcelPrice), parcel));
        }
    }
}
