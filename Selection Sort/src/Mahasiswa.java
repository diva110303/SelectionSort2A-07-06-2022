import SelectionSort.SelectionSort;

public class Mahasiswa {

    public static void main(String[] args) {
        SelectionSort mhs = new SelectionSort();
        String[] mahasiswa = new String[]{"Shinta","Jefri","Oliv","Surya","Dani","Winda"};

        mhs.setData();
        mhs.SelectionSort();
        mhs.PrintData();

    }
}
