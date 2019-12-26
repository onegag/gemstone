package by.epam.gemstone.entity.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Precious_type")
@XmlEnum
public enum PreciousType {
    @XmlEnumValue("diamond")
    DIAMOND,
    @XmlEnumValue("ruby")
    RUBY,
    @XmlEnumValue("sapphire")
    SAPPHIRE,
    @XmlEnumValue("emerald")
    EMERALD

}
