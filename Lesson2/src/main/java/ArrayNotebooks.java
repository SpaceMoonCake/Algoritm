public class ArrayNotebooks {
    private int size;
    private static Notebook[] arrayNotebooks;

    public ArrayNotebooks(int size) {
        this.size = size;
        this.arrayNotebooks = getArrayNotebooks(size);
    }

    private Notebook[] getArrayNotebooks(int size) {
        arrayNotebooks = new Notebook[size];
        for (int i = 0; i < size - 1; i++) {
            arrayNotebooks[i] = new Notebook();
        }
        return arrayNotebooks;
    }

    public static Notebook[] getArrayNotebooks() {
        return arrayNotebooks;
    }

    public String getReadyToPrint() {
        String arrayNotebooksReadyToPrint = "";
        for (int i = 0; i < size - 1; i++) {
            arrayNotebooksReadyToPrint += arrayNotebooks[i].getPrice() + " "
                    + arrayNotebooks[i].getMemory() + " "
                    + arrayNotebooks[i].getManufacturer() + "\n";
        }
        return arrayNotebooksReadyToPrint;
    }

    public void sort() {
        for (int i = 0; i < size - 1 ; i++) {
            int min = i;

            for (int j = i + 1; j < size - 1; j++) {
                if( arrayNotebooks[min].getPrice() > arrayNotebooks[j].getPrice()){
                    min = j;
                }
                if(arrayNotebooks[min].getPrice() == arrayNotebooks[j].getPrice()){
                    if(arrayNotebooks[min].getMemory() > arrayNotebooks[j].getMemory()){
                        min = j;
                    }

                    if(arrayNotebooks[min].getMemory() == arrayNotebooks[j].getMemory()){
                        if (arrayNotebooks[min].getManufacturer().compareTo(arrayNotebooks[j].getManufacturer()) > 0){
                            min = j;
                        };
                    }
                }
            }

            Notebook notebook = arrayNotebooks[i];
            arrayNotebooks[i] = arrayNotebooks[min];
            arrayNotebooks[min] = notebook;

        }

    }
}
