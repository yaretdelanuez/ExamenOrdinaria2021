
package examenordinariafilm.model;

import java.util.HashMap;


public class Film {
    //creo que debo de guardarlo en un hash map para dsp poder ordenarlos ya sea por Rating, duration, etc
    //(cuando empece tenía la idea de que se me pasaban por un bd o algo externo a mi),  pero me acabo de 
    //dar cuenta que las debo de dejar creadas yo con sus parametros para poder hacer una clase con metodos de ordenación
    // por fechas, por duracion , novedades para despues poder tener los datos y sacar las peliculas por orden de duracion por ejemplo
    private String title;
    private int year;
    private String director;
    private String actors;
    private Gender gender;
    private Rating rating;
    private int duration;//en min 
    
    public Film(String title, int year, String director, String actors, Gender gender, Rating rating, int duration) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.actors = actors;
        this.gender = gender;
        this.rating = rating;
        this.duration = duration;
    }
    
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public Gender getGender() {
        return gender;
    }

    public Rating getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }
    
     
    
}
