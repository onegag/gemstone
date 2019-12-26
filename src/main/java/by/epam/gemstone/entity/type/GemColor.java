package by.epam.gemstone.entity.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Gem_color")
@XmlEnum
public enum  GemColor {
  @XmlEnumValue("orange")
  ORANGE,
  @XmlEnumValue("green")
  GREEN,
  @XmlEnumValue("brown")
  BROWN,
  @XmlEnumValue("blue")
  BLUE,
  @XmlEnumValue("red")
  RED,
  @XmlEnumValue("yellow")
  YELLOW,
  @XmlEnumValue("pink")
  PINK
}
