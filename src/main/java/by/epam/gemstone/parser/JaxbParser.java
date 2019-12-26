package by.epam.gemstone.parser;

import by.epam.gemstone.entity.Gems;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;

public class JaxbParser {
    JAXBContext jaxbContext;

    {
        try {
            jaxbContext = JAXBContext.newInstance(Gems.class);

            SchemaOutputResolver sor = new MySchemaOutputResolver();
            jaxbContext.generateSchema(sor);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
