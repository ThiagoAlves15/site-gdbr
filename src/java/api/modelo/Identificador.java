package api.modelo;

public class Identificador {
    private Long id;

    public Identificador() {}

    public Identificador(Long id) {
        this.setId(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
