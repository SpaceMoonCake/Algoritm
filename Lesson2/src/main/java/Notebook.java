import java.lang.reflect.Array;
import java.util.Random;


public class Notebook {
    private int price; //500 до 2000 долларов с шагом в 50
    private int memory; //от 4 до 24 с шагом 4
    private String manufacturer; //Lenovo > Asos > MacNote > Eser > Xamiou
    private String[] listManufacturers = {"Lenovo", "Asos", "MacNote", "Eser", "Xamiou"};

    public Notebook() {
        this.price = generateNumber(500,2000,50);
        this.memory = generateNumber(4,24,4);
        this.manufacturer = listManufacturers[getPositionManufacturer()];
    }

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    private int getPositionManufacturer() {
        Random random = new Random();
        return random.nextInt(listManufacturers.length);
    }

    private int generateNumber(int min, int max, int step) {
        return (int) Math.floor(Math.floor(Math.random()*(max-min+1)+min) / step) * step;
    }
}
