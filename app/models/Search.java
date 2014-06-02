package models;

import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import play.data.Form;
import play.data.format.Formats;

import com.avaje.ebean.Page;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: serge stratan
 * Date: 5/26/14
 * Search model
 */
// @SuppressWarnings("unused")
@Entity
public class Search extends Model {

    @Id
    private Long id;
    private String ip;
    private String term;
    // private int year;
    // @Lob
    // private String description;

    @Temporal(TemporalType.TIMESTAMP)
    public Date date;


    public static Finder<Long, Search> find = new Finder<Long, Search>(
            Long.class, Search.class);


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }


    // public String getDescription() {
    //     return description;
    // }

    // public void setDescription(String description) {
    //     this.description = description;
    // }

    // public int getYear() {
    //     return year;
    // }

    // public void setYear(int year) {
    //     this.year = year;
    // }



    public static List<Search> all() {
        return find.all();
    }

    public static void create(Search enquiry, String ip) {
        enquiry.date = new Date();
        enquiry.ip = ip;
        enquiry.save();
    }

}