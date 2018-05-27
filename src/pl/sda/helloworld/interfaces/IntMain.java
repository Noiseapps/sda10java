package pl.sda.helloworld.interfaces;

public class IntMain {

    private DataSource ds;

    public IntMain(DataSource ds) {
        this.ds = ds;
    }

    public void setDs(DataSource ds) {
        this.ds = ds;
    }

    void read() {
        System.out.println(ds.read());
    }

    void write(String s) {
        System.out.println("Saving " + s + " to my DataSource");
        ds.write(s);
    }

    public static void main(String[] args) {
        FileDS fileDS = new FileDS();
        MemoryDS memoryDS = new MemoryDS();

        IntMain main1 = new IntMain(fileDS);
        main1.read();
        main1.write("Test");
        main1.read();

        System.out.println();

        main1.setDs(memoryDS);
        main1.read();
        main1.write("Test2");
        main1.read();
        System.out.println();

        main1.setDs(fileDS);
        main1.read();
        main1.write("Test3");
        main1.read();
        System.out.println();
    }
}
