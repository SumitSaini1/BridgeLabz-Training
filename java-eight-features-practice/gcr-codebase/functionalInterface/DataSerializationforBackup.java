package FunctionalInterface;

import java.io.*;
import java.io.Serializable;
interface Backupable {
    
}


class UserData implements Backupable, Serializable {

    private int id;
    private String name;

    public UserData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserData{id=" + id + ", name='" + name + "'}";
    }
}


class TempCache {
    private String tempData;

    public TempCache(String tempData) {
        this.tempData = tempData;
    }
}


class BackupProcessor {

    public static void backup(Object obj) {

        // Check marker interface
        if (!(obj instanceof Backupable)) {
            System.out.println("❌ Backup denied: Not marked Backupable");
            return;
        }

        // Check Serializable
        if (!(obj instanceof Serializable)) {
            System.out.println("❌ Backup denied: Not Serializable");
            return;
        }

        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("backup.dat"))) {

            out.writeObject(obj);
            System.out.println("✅ Backup successful: " + obj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



public class MarkerInterfaceBackupDemo {

    public static void main(String[] args) {

        UserData user = new UserData(101, "Sumit");
        TempCache cache = new TempCache("SESSION123");

        BackupProcessor.backup(user);   // ✅ Allowed
        BackupProcessor.backup(cache);  // ❌ Denied
    }
}
