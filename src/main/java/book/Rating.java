package book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.net.URL;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rating {

    @XmlRootElement(name = "Rating")
    public static class Source extends Rating{

        public Source(String source, URL url) {
            this.source = source;
            this.url = url;
        }

        @XmlAttribute
        private String source;

        @XmlValue
        private URL url;

    }

    private int total;

    @XmlRootElement(name = "Rating")
    public static class RatingStar extends Rating{

        @XmlAttribute(name = "5 star")
        private double five;

        @XmlAttribute(name = "4 star")
        private double four;

        @XmlAttribute(name = "3 star")
        private double three;

        @XmlAttribute(name = "2 star")
        private double two;

        @XmlAttribute(name = "1 star")
        private double one;

        public RatingStar(double five, double four, double three, double two, double one) {
            this.five = five;
            this.four = four;
            this.three = three;
            this.two = two;
            this.one = one;
        }
    }

}
