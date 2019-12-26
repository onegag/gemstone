package by.epam.gemstone.entity.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "organic_type")
@XmlEnum
public enum OrganicType {
    @XmlEnumValue("amber")
    AMBER,
    @XmlEnumValue("coral")
    CORAL,
    @XmlEnumValue("jet")
    JET,
    @XmlEnumValue("pearl")
    PEARL
}
