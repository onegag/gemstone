package by.epam.gemstone.entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement (name = "gems")
public class Gems {
    @XmlElementRefs(value = {@XmlElementRef(name = "gem"),

            @XmlElementRef(name = "natural_gem"),
            @XmlElementRef(name = "synthetic_gem"),
            @XmlElementRef(name = "organic_gem"),
            @XmlElementRef(name = "presious_gem"),
            @XmlElementRef(name = "semipresious_gem")})
    private List<Gem> gems =new ArrayList<Gem>();

    public Gems() {
    }

    public List<Gem> getGems() {
        return gems;
    }

    public void setGems(List<Gem> gems) {
        this.gems = gems;
    }
}
