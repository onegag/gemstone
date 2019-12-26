package by.epam.gemstone.entity.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "synthesis_method")
@XmlEnum
public enum  SynthesisMethod {
    @XmlEnumValue("vapor")
    VAPOR,
    @XmlEnumValue("solution")
    SOLUTION,
    @XmlEnumValue("melt")
    MELT
}
