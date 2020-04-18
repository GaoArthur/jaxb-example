package book;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@Data
public class Details {

    //private Format format;

    //private Dimension dimension;
    //@XmlRootElement(name = "Details")
    //public static class Dimension extends Details {
    //    @XmlElement(name = "width")
    //    private int width;
    //    @XmlElement(name = "length")
    //    private int length;
    //    @XmlElement(name = "height")
    //    private int height;
    //    @XmlElement(name = "weight")
    //    private double weight;
    //    @XmlElement(name = "unit")
    //    private String unit;
    //
    //
    //    public Dimension(int width, int length, int height, double weight, String unit) {
    //        this.width = width;
    //        this.length = length;
    //        this.height = height;
    //        this.weight = weight;
    //        this.unit = unit;
    //    }
    //}

}
