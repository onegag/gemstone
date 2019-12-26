package by.epam.gemstone.parser;

import javax.xml.transform.Result;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MySchemaOutputResolver msor = new MySchemaOutputResolver();
        Result result = msor.createOutput("C:\\Users\\tanna\\gemstone\\src\\main","schema.xsd");
        System.out.println(result);
    }
}
