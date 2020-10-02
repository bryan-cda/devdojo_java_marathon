package br.com.example.exception;

public class SexyTypeException {

    public String declareSexyType(String sexy) throws InvalidSexyTypeException {

        String message = null;
        if(sexy.equalsIgnoreCase("m")){

            message = SexyType.m;
        } else if(sexy.equalsIgnoreCase("f")){

            message = SexyType.f;

        }

        if(!sexy.equalsIgnoreCase("m") && !sexy.equalsIgnoreCase("f")){
            throw new InvalidSexyTypeException("This is not a valid sexy type: ", sexy);
        }

        return message;
    }

    public static void main(String[] args) throws InvalidSexyTypeException {
        SexyTypeException test = new SexyTypeException();
        test.declareSexyType("sasuke");
    }

}
