package service;

public class ServiceDaoImpl {
    
    private String deleteME;
    private int serviceId;
    
    private long serviceNumber;

    public static void print(String str){
        System.out.println("Printed: " + str + "!");
    }


    public static void imprint(String request){
        System.out.println("Requested: " + request);
    }

    public static void dummy(){
        //i.m dummy method
        System.out.println("1111");
    }

}
