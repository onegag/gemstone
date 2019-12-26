package by.epam.gemstone.entity;

import by.epam.gemstone.entity.type.GemColor;
import by.epam.gemstone.entity.type.OrganicType;
import by.epam.gemstone.entity.type.Rarity;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "organic_gem", namespace = "http://www.gemstone.epam.by/gems")
@XmlType(name = "OrganicGem", propOrder = {
        "type"
})
public class OrganicGem extends NaturalGem {
    @XmlAttribute( name = "type", required = true)
    private OrganicType type;

    public OrganicGem() {
    }

    public OrganicGem(String name,
                      GemColor color,
                      int hardnessPercent,
                      int facetsQuantity,
                      double weightCarat,
                      Rarity rarity,
                      double isPainted,
                      int purity,
                      OrganicType type) {
        super(name, color, hardnessPercent, facetsQuantity, weightCarat, rarity, isPainted, purity);
        this.type = type;
    }

    public OrganicType getType() {
        return type;
    }

    public void setType(OrganicType type) {
        this.type = type;
    }

}
