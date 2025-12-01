package paqueteEnum;

public enum Continentes {
    AMERICA(35),
    EUROPA(50),
    ASIA(48),
    AFRICA(54),
    OCEANIA(14);


    private final int paises;

    private Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }


}
