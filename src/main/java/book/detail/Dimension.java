package book.detail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dimension {

    @XmlValue
    private int width;

    @XmlValue
    private int length;

    @XmlValue
    private int height;

    @XmlValue
    private double weight;

}
