package by.epam.gemstone.parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MySchemaOutputResolver msor = new MySchemaOutputResolver();
        msor.createOutput("","C:\\Users\\tanna\\gemstone\\src\\main\\resources\\schema.xsd");
    }
}
