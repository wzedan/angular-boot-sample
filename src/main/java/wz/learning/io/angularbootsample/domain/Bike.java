package wz.learning.io.angularbootsample.domain;

import java.util.Random;

public class Bike {
    private Long id;
    private String model;
    private String manufacturer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Bike() {
    }

    public static Bike build(String model, String manufacturer) {
        Bike bike = new Bike();
        Random random = new Random(System.nanoTime());

        bike.id = random.nextLong();
        bike.model = model;
        bike.manufacturer = manufacturer;
        return bike;
    }
}
