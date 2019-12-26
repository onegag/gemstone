package by.epam.gemstone.entity;


import by.epam.gemstone.entity.type.GemColor;
import by.epam.gemstone.entity.type.Rarity;

import javax.xml.bind.annotation.*;
import java.util.Objects;


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
    @XmlAttribute(name = "name", required = true)
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

    public Gem() {
    }

    public Gem(String name,
               GemColor color,
               int hardnessPercent,
               int facetsQuantity,
               double weightCarat,
               Rarity rarity) {
        this.name = name;
        this.color = color;
        this.hardnessPercent = hardnessPercent;
        this.facetsQuantity = facetsQuantity;
        this.weightCarat = weightCarat;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GemColor getColor() {
        return color;
    }

    public void setColor(GemColor color) {
        this.color = color;
    }

    public int getHardnessPercent() {
        return hardnessPercent;
    }

    public void setHardnessPercent(int hardnessPercent) {
        this.hardnessPercent = hardnessPercent;
    }

    public int getFacetsQuantity() {
        return facetsQuantity;
    }

    public void setFacetsQuantity(int facetsQuantity) {
        this.facetsQuantity = facetsQuantity;
    }

    public double getWeightCarat() {
        return weightCarat;
    }

    public void setWeightCarat(double weightCarat) {
        this.weightCarat = weightCarat;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gem gem = (Gem) o;
        return hardnessPercent == gem.hardnessPercent &&
                facetsQuantity == gem.facetsQuantity &&
                Double.compare(gem.weightCarat, weightCarat) == 0 &&
                Objects.equals(name, gem.name) &&
                color == gem.color &&
                rarity == gem.rarity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, hardnessPercent, facetsQuantity, weightCarat, rarity);


    }
}
