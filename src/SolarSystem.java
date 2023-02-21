public enum SolarSystem {
    EARTH("Жер планетасында жашоо бар"),
    MARS("Марс жер планетасына окшош"),
    JUPITER("Юпитер кун системасындагы эн чон планета"),
    SATURN("Сатурн кобунчо суутектен турат"),
    MERKURII("Кунго эн жакын планета"),
    URAN("Жаны заманда табылган биринчи планета"),
    NEPTUN("Массасы жердин массасынан ойдо турат"),
    PLUTON("Эн таанымал кичинекей планета"),
    VENERA("Венера тыгыз атмосфе");

    private String info;

    SolarSystem(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
