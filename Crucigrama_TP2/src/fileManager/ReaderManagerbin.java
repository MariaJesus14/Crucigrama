package fileManager;

import dataset.UsersList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderManagerbin {

    private ObjectInputStream reader;

    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

    public UsersList read() throws IOException, ClassNotFoundException {
        return (UsersList) reader.readObject();
    }

    public void close() throws IOException {
        reader.close();
    }
}
