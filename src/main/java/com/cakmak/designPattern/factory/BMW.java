package com.cakmak.designPattern.factory;

public class BMW implements ICar{
    //Arabada bulunan özellikleri belirledik.
    private String color;
    private double price;
    private int modelYear;
    private boolean backupCamera;

    public BMW(String color, double price, int modelYear, boolean backupCamera){
        this.color = color;
        this.price = price;
        this.modelYear = modelYear;
        this.backupCamera = backupCamera;
    }
    //ICar Interface'indeki metotlar override edilir :
    //Bu metotlar yardımı ile nesne özelliklerine erişilebilir.
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int modelYear() {
        return modelYear;
    }

    @Override
    public boolean backupCamera() {
        return backupCamera;
    }

    @Override
    public void showCarInfo() {
        System.out.println("Araba Markası : BMW");
        System.out.println("Araba Fiyatı : "+price);
        System.out.println("Araba Model Yılı : "+modelYear);

        if(backupCamera){
            System.out.println("Arka Kamera Özelliği : Var");
        }
        else{
            System.out.println("Arka Kamera Özelliği : Yok");
        }
    }
}
