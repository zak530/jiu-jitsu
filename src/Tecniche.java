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


    @Override
    public String toString() {
        return "Tecniche{" +
                "nomeDellaTecnica='" + nomeDellaTecnica + '\'' +
                ", categoria='" + categoria + '\'' +
                ", difficolta=" + difficolta +
                '}';
    }
}
