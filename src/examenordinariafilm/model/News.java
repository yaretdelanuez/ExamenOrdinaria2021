
package examenordinariafilm.model;

/**
 *
 * @author Yar
 */
public class News extends Cover{
    private String startDate;
    private String endDate;

    public News(String startDate, String endDate, String name) {
        super(name);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    
}
