package by.epam.gemstone.entity.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "synthesis_type")
@XmlEnum
public enum SyntheticType {
    @XmlEnumValue("emerald")
    EMERALD,
    @XmlEnumValue("ruby")
    RUBY,
    @XmlEnumValue("sapphire")
    SAPPHIRE,
    @XmlEnumValue("alexandrite")
    ALEXANDRITE,
    @XmlEnumValue("corundum")
    CORUNDUM
}
