package by.epam.gemstone.entity;

import by.epam.gemstone.entity.type.GemColor;
import by.epam.gemstone.entity.type.PreciousType;
import by.epam.gemstone.entity.type.Rarity;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "precious_gem", namespace = "http://www.gemstone.epam.by/gems")
@XmlType(name = "PreciousGem", propOrder = {
        "type"
})
public class PreciousGem extends  NaturalGem {
    @XmlAttribute( name = "type", required = true)
    private PreciousType type;

    public PreciousGem() {

    }

    public PreciousGem(String name,
                       GemColor color,
                       int hardnessPercent,
                       int facetsQuantity,
                       double weightCarat,
                       Rarity rarity,
                       double isPainted,
                       int purity,
                       PreciousType type) {
        super(name, color, hardnessPercent, facetsQuantity, weightCarat, rarity, isPainted, purity);
        this.type = type;
    }

    public PreciousType getType() {
        return type;
    }

    public void setType(PreciousType type) {
        this.type = type;
    }
}
