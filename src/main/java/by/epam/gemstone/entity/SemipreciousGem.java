package by.epam.gemstone.entity;

import by.epam.gemstone.entity.type.GemColor;
import by.epam.gemstone.entity.type.Rarity;
import by.epam.gemstone.entity.type.SemipreciousType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "semiprecious_gem", namespace = "http://www.gemstone.epam.by/gems")
@XmlType(name = "SemipreciousGem", propOrder = {
        "type"
})
public class SemipreciousGem extends NaturalGem{
    @XmlAttribute( name = "type", required = true)
    private SemipreciousType type;

    public SemipreciousGem() {

    }

    public SemipreciousGem(String name,
                           GemColor color,
                           int hardnessPercent,
                           int facetsQuantity,
                           double weightCarat,
                           Rarity rarity,
                           double isPainted,
                           int purity,
                           SemipreciousType type) {
        super(name, color, hardnessPercent, facetsQuantity, weightCarat, rarity, isPainted, purity);
        this.type = type;
    }
}
