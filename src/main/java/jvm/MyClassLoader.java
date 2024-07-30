package jvm;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;

public class MyClassLoader extends ClassLoader {
    private String myName = "";

    public MyClassLoader(String myName) {
        this.myName = myName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String name) {
        byte[] data = null;
        InputStream in = null;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        name = name.replace(".", "/");
        try (out) {
            in = Files.newInputStream(new File("classes/" + name + ".class").toPath());
            int a = 0;
            while ((a = in.read()) != -1) {
                out.write(a);
            }
            data = out.toByteArray();

        } catch (Exception err) {
            err.printStackTrace();
        }
        return data;
    }


}
