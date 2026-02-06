public class Tecniche{


    private String nomeDellaTecnica;
    private String categoria;
    private int difficolta;

    public String getSottomissione() {
        return categoria;
    }


    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomeDellaTecnica() {
        return nomeDellaTecnica;
    }

    public void setNomeDellaTecnica(String nomeDellaTecnica) {
        this.nomeDellaTecnica = nomeDellaTecnica;
    }

    public int getDifficolta() {
        return difficolta;
    }

    public void setDifficolta(int difficolta) {
        this.difficolta = difficolta;
    }

    public Tecniche(String categoria, String nomeDellaTecnica, int difficolta) {
        this.categoria = categoria;
        this.nomeDellaTecnica = nomeDellaTecnica;
        this.difficolta = difficolta;
    }

    public int compareTo(Tecniche t) {
        if (this.difficolta < t.difficolta)
            return -1;
        else if (this.difficolta == t.difficolta)
            return 0;
        else
            return 1;
    }

    public String toString() {
        return nomeDellaTecnica + " - " + categoria + " - " + difficolta;
    }
}
