package by.epam.gemstone.entity;


import by.epam.gemstone.entity.type.GemColor;
import by.epam.gemstone.entity.type.Rarity;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "gem", namespace = "http://www.gemstone.epam.by/gems")
@XmlType(name = "Gem", propOrder = {
        "color",
        "hardnessPercent",
        "facetsQuantity",
        "weightCarat",
        "rarity"
})
@XmlSeeAlso({
        NaturalGem.class,
        SyntheticGem.class
})
public abstract class Gem {
    private String name;
    @XmlElement(name = "color", required = true)
    private GemColor color;
    @XmlElement(name = "hardness_percent", required = true)
    private int hardnessPercent;
    @XmlElement(name = "facets_quantity", defaultValue = "0")
    private int facetsQuantity;
    @XmlElement(name = "weight_carat", required = true)
    private double weightCarat;
    @XmlElement(name = "rarity", required = true)
    private Rarity rarity;


}
