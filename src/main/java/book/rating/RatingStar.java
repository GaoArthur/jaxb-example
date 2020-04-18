package book.rating;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RatingStar {

    @XmlAttribute(name = "5 star")
    private int[] five;

    @XmlAttribute(name = "4 star")
    private int[] four;

    @XmlAttribute(name = "3 star")
    private int[] three;

    @XmlAttribute(name = "2 star")
    private int[] two;

    @XmlAttribute(name = "1 star")
    private int[] one;

}
