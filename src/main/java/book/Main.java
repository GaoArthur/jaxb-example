package book;

import jaxb.JAXBHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * (string)isbn: 9780785837350
 * (string list)categories: Classic Books & Novels, Crime, Crime Fiction, Vintage Crime, Vintage Crime
 * (string list)book name: The Complete Sherlock Holmes : Works include: The Hound of the Baskervilles; A Study in Scarlet; The Adventures of Sherlock Holmes; The Memoirs of Sherlock Holmes; The Return of Sherlock Holmes
 * (float)rating: 4.5
 * (string)cover: Hardback
 * (string)series: Chartwell Classics
 * (string)language: english
 * (string)author: Sir Arthur Conan Doyle
 * (string)introduction: Daniel Stashower
 * (string, int, string)price:hardback 13001 ft, paperback 16413 ft
 * (boolean)available: true
 * (string, int)delivery: free, 4 days
 * (string)description:
 *      Part of the elegant Chartwell Classics series, The Complete Sherlock Holmes comprises 4 full-length novels and 56 short stories featuring the world's most famous pipe-smoking detective.
 *      Written by Sir Arthur Conan Doyle between the years 1867 and 1927, the legendary Sherlock Holmes employed his mastery of deductive reasoning and expert sleuthing to solve an array of complex and harrowing cases. From his home--221B Baker Street in London--the legendary Sherlock Holmes (accompanied by his loyal companion and chronicler, Dr. Watson) baffled policemen and became famous worldwide for his remarkable observations and even more eccentric habits.
 *      Containing every known Sherlock Holmes tale ever written and featuring a comprehensive introduction by renowned Holmes scholar Daniel Stashower (author of A Teller of Tales: The Life of Arthur Conan Doyle and Sherlock Holmes in America) with enlightening information on the author's life and works, this elegantly designed edition brings the world's greatest detective to life. From Holmes' first appearance in "A Study in Scarlet" (1887) and The Hound of the Baskervilles (1901-1902), through the collection of stories in the The Case-Book of Sherlock Holmes, this deluxe edition boasts the entire Holmes catalog.
 *      For Sherlock Holmes fans worldwide, this stunning hardcover edition is the perfect gift.
 * (list)details:
 *      (string, int)format: Hardback, 1200 pages
 *      (int, int, int, double)dimensions: 165 x 235 x 70mm, 1,837.05g
 *      (date)publication date: 25 Jun 2019
 *      (string)publisher: Book Sales Inc
 *      (string)imprint: Chartwell Books Inc.,U.S
 *      (string)Publication City/Country: Edison, United States
 *      (string)Language: English
 *      (string)ISBN10: 0785837353
 *      (string)ISBN13: 9780785837350
 *      (int)Bestsellers rank: 563,072
 * (string)author:
 *    About Sir Arthur Conan Doyle
 *      Sir Arthur Conan Doyle (1859-1930) was a Scottish physician and prolific writer of fiction and nonfiction. He is most well known for his four novels and fifty-six short stories featuring the legendary and eccentric detective Sherlock Holmes. Holmes was modeled after Doyle's colleague, physician and surgeon Dr. Joseph Bell, who had been known for his acute powers of deductive observation. In his real life, Doyle worked in the name of justice too. He personally investigated two cases of innocent men who had been wrongfully imprisoned and helped to get them exonerated for their "crimes."
 *      Daniel Stashoweris a member of the Baker Street Irregulars and is the author of Teller of Tales: The Life of Arthur Conan Doyle and The Beautiful Cigar Girl: Mary Rogers, Edgar Allen Poe, and the Invention of Murder. He is also a co-editor of several other books about Sherlock Holmes and his creator, including Arthur Conan Doyle: A Life in Letters.
 * (float)rating: 4.5
 *      (string)source: Goodreads
 *          (URL)url: https://www.goodreads.com/book/show/44024032-the-complete-sherlock-holmes
 *      (int)total: 159991
 *      (int, int)5 star: 62%, 98964
 *      (int, int)4 star: 29%, 46400
 *      (int, int)3 star: 8%, 12394
 *      (int, int)2 star: 1%, 1519
 *      (int, int)1 star: 0%, 714
 */

public class Main {

    public static void main(String[] args) throws Exception {

        BookInfo bookInfo = new BookInfo();
        bookInfo.setIsbn("9780785837350");
        bookInfo.setBook_names(List.of("The Complete Sherlock Holmes : Works include: The Hound of the Baskervilles", "A Study in Scarlet", "The Adventures of Sherlock Holmes", "The Memoirs of Sherlock Holmes", "The Return of Sherlock Holmes"));
        bookInfo.setRating_sum(4.5);
        bookInfo.setCover("Hardback");
        bookInfo.setSeries("Chartwell Classics");
        bookInfo.setLanguage("English");
        bookInfo.setAuthor("Sir Arthur Conan Doyle");
        bookInfo.setIntroduction("Daniel Stashower");

        ArrayList<Price> prices = new ArrayList<>();
        prices.add(new Price("Hardback", "ft", 13001));
        prices.add(new Price("Paperback", "ft", 16413));
        bookInfo.setPrices(prices);

        bookInfo.setAvailable(true);

        ArrayList<Delivery> deliveries = new ArrayList<>();
        deliveries.add(new Delivery("free", 4));
        bookInfo.setDeliveries(deliveries);

        bookInfo.setDescription("Part of the elegant Chartwell Classics series, The Complete Sherlock Holmes comprises 4 full-length novels and 56 short stories featuring the world's most famous pipe-smoking detective.\n" +
                " *      Written by Sir Arthur Conan Doyle between the years 1867 and 1927, the legendary Sherlock Holmes employed his mastery of deductive reasoning and expert sleuthing to solve an array of complex and harrowing cases. From his home--221B Baker Street in London--the legendary Sherlock Holmes (accompanied by his loyal companion and chronicler, Dr. Watson) baffled policemen and became famous worldwide for his remarkable observations and even more eccentric habits.\n" +
                " *      Containing every known Sherlock Holmes tale ever written and featuring a comprehensive introduction by renowned Holmes scholar Daniel Stashower (author of A Teller of Tales: The Life of Arthur Conan Doyle and Sherlock Holmes in America) with enlightening information on the author's life and works, this elegantly designed edition brings the world's greatest detective to life. From Holmes' first appearance in \"A Study in Scarlet\" (1887) and The Hound of the Baskervilles (1901-1902), through the collection of stories in the The Case-Book of Sherlock Holmes, this deluxe edition boasts the entire Holmes catalog.\n" +
                " *      For Sherlock Holmes fans worldwide, this stunning hardcover edition is the perfect gift.");

        bookInfo.setFormat("Hardback, 1200 pages");
        bookInfo.setDimension("165 x 235 x 70mm, 1,837.05g");
        //bookInfo.setPublication_date(LocalDate.of(2019, 6, 25));
        bookInfo.setPublication_date("25 Jun 2019");
        bookInfo.setPublisher("Book Sales Inc");
        bookInfo.setImprint("Chartwell Books Inc.,U.S");
        bookInfo.setPublication_CityOrCountry("Edison, United States");
        bookInfo.setIsbn10("0785837353");
        bookInfo.setIsbn13("9780785837350");
        bookInfo.setBestseller_rank(563072);

        bookInfo.setAuthor_description(List.of("About Sir Arthur Conan Doyle\n" +
                " *      Sir Arthur Conan Doyle (1859-1930) was a Scottish physician and prolific writer of fiction and nonfiction. He is most well known for his four novels and fifty-six short stories featuring the legendary and eccentric detective Sherlock Holmes. Holmes was modeled after Doyle's colleague, physician and surgeon Dr. Joseph Bell, who had been known for his acute powers of deductive observation. In his real life, Doyle worked in the name of justice too. He personally investigated two cases of innocent men who had been wrongfully imprisoned and helped to get them exonerated for their \"crimes.\"\n" +
                " *      Daniel Stashoweris a member of the Baker Street Irregulars and is the author of Teller of Tales: The Life of Arthur Conan Doyle and The Beautiful Cigar Girl: Mary Rogers, Edgar Allen Poe, and the Invention of Murder. He is also a co-editor of several other books about Sherlock Holmes and his creator, including Arthur Conan Doyle: A Life in Letters."));

        //ArrayList<Rating> ratings = new ArrayList<>();
        //ratings.add(new Rating.Source("Goodreads",new URL("https://www.goodreads.com/book/show/44024032-the-complete-sherlock-holmes")));
        //ratings.add(new Rating.RatingStar(0.62,0.29,0.08,0.01,0.00));
        //bookInfo.setRatings(ratings);

        JAXBHelper.toXML(bookInfo,System.out);

    }

}
