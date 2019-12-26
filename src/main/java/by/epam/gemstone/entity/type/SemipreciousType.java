package by.epam.gemstone.entity.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "semiprecious_type")
@XmlEnum
public enum SemipreciousType {
    @XmlEnumValue("agate")
    AGATE,
    @XmlEnumValue("garnet")
    GARNET,
    @XmlEnumValue("hematite")
    HEMATITE,
    @XmlEnumValue("jade")
    JADE,
    @XmlEnumValue("lazuli")
    LAZULI,
    @XmlEnumValue("malachite")
    MALACHITE,
    @XmlEnumValue("moonstone")
    MOONSTONE,
    @XmlEnumValue("obsidian")
    OBSIDIAN,
    @XmlEnumValue("onyx")
    ONYX,
    @XmlEnumValue("sunstone")
    SUNSTONE,
    @XmlEnumValue("tigers_eye")
    TIGERS_EYE,
    @XmlEnumValue("tanzanite")
    TANZANITE
}
