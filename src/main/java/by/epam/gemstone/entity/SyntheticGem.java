package by.epam.gemstone.entity;

import by.epam.gemstone.entity.type.GemColor;
import by.epam.gemstone.entity.type.Rarity;
import by.epam.gemstone.entity.type.SynthesisMethod;
import by.epam.gemstone.entity.type.SyntheticType;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "synthetic_gem", namespace = "http://www.gemstone.epam.by/gems")
@XmlType(name = "SyntheticGem", propOrder = {
        "type",
        "synthesisMethod"
})
public class SyntheticGem extends Gem{
    @XmlElement(name = "synthesis_method", required = true)
    SynthesisMethod synthesisMethod;
    @XmlAttribute( name = "type", required = true)
    SyntheticType type;

    public SyntheticGem() {
    }

    public SyntheticGem(String name,
                        GemColor color,
                        int hardnessPercent,
                        int facetsQuantity,
                        double weightCarat,
                        Rarity rarity,
                        SynthesisMethod synthesisMethod,
                        SyntheticType type) {
        super(name, color, hardnessPercent, facetsQuantity, weightCarat, rarity);
        this.synthesisMethod = synthesisMethod;
        this.type = type;
    }

    public SynthesisMethod getSynthesisMethod() {
        return synthesisMethod;
    }

    public void setSynthesisMethod(SynthesisMethod synthesisMethod) {
        this.synthesisMethod = synthesisMethod;
    }

    public SyntheticType getType() {
        return type;
    }

    public void setType(SyntheticType type) {
        this.type = type;
    }
}
