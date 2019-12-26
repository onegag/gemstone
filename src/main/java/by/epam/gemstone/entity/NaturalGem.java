package by.epam.gemstone.entity;

import by.epam.gemstone.entity.type.GemColor;
import by.epam.gemstone.entity.type.Rarity;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "natural_gem", namespace = "http://www.gemstone.epam.by/gems")
@XmlType(name = "NaturalGem", propOrder = {
        "isPainted",
        "purity"
})
@XmlSeeAlso({
        OrganicGem.class,
        PreciousGem.class,
        SemipreciousGem.class
})
public abstract class NaturalGem extends Gem{
    @XmlElement(name = "is_painted", required = true)
    private double isPainted;
    @XmlElement(name = "purity", required = true)
    private int purity;

    public NaturalGem() {
    }

    public NaturalGem(String name,
                      GemColor color,
                      int hardnessPercent,
                      int facetsQuantity,
                      double weightCarat,
                      Rarity rarity,
                      double isPainted,
                      int purity) {
        super(name, color, hardnessPercent, facetsQuantity, weightCarat, rarity);
        this.isPainted = isPainted;
        this.purity = purity;
    }

    public double getIsPainted() {
        return isPainted;
    }

    public void setIsPainted(double isPainted) {
        this.isPainted = isPainted;
    }

    public int getPurity() {
        return purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }

}
