package by.epam.gemstone.entity.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Rarity")
@XmlEnum
public enum Rarity {
    @XmlEnumValue("common")
    COMMON,
    @XmlEnumValue("rare")
    RARE,
    @XmlEnumValue("uncommon")
    UNCOMMON,
    @XmlEnumValue("very_rare")
    VERY_RARE
    }
