package br.com.java.marathon.repetition_structures;

public class ContinueUse {
    public static void main(String[] args) {
       double carPrice = 100;
       double parcelPrice = 0.0;

       for(int parcel = (int) carPrice; parcel >= 1; parcel--){
            parcelPrice = carPrice / parcel;
            if(parcel > 30){
                continue;
            }
            System.out.println(String.format("Parcel value option R$ %s in %s times...", Math.round(parcelPrice), parcel));
        }
    }
}
