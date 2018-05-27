package pl.sda.helloworld.interfaces;

public interface DataSource {

    String read();

    void write(String data);
}

class FileDS implements DataSource {

    String data;

    @Override
    public String read() {
        return "From files: " + data;
    }

    @Override
    public void write(String data) {
        this.data = data;
    }
}

class MemoryDS implements DataSource {

    String data;

    @Override
    public String read() {
        return "From memory: " + data;
    }

    @Override
    public void write(String data) {
        this.data = data;
    }
}