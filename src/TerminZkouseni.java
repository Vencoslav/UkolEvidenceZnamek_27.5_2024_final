import com.sun.jdi.IntegerValue;

import java.time.LocalDate;

public class TerminZkouseni {
    private String tema;
    private Integer znamka;
    private LocalDate datum;

    public TerminZkouseni(String tema, Integer znamka, LocalDate datum) {
        this.tema = tema;
        this.znamka = znamka;
        this.datum = datum;
    }

    //Umožněte také vytvářet termíny, kde se jako výchozí známka použije 1 a výchozí datum dnešní datum.
    // Téma zkoušení je třeba stále zadat.
    public TerminZkouseni(String tema){
        this(tema,1,LocalDate.now());
    }

    public String getTema() {
        return tema;
    }

    public Integer getZnamka() {
        return znamka;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setZnamka(Integer znamka) {
        this.znamka = znamka;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalDate nastavDatumNaDnesni(LocalDate datum){
        this.datum = LocalDate.now();
        return datum;
    }

    public Boolean jeLepsiNez(Integer znamka){
        boolean lespi = false;
        if(znamka < 3){
            lespi = true;
        }
        return lespi;

    }
}

