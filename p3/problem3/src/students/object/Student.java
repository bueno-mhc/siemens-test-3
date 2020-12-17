package students.object;

public class Student {
    private Integer id = 0;
    private String nome;
    private Float valor = 0f;
    private Integer intervalGrade = 0;

    public Student(int id, String nome, Float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        setIntervalGrade();
    }

    public Student(String id, String nome, String valor) {
        this.id = Integer.parseInt(id);
        this.nome = nome;
        this.valor = Float.parseFloat(valor);
        setIntervalGrade();
    }

    public Integer getId() {
        return this.id;
    }

    public String getNome() {
        if (this.nome.isEmpty()) {
            return null;
        } else {
            if (this.intervalGrade >= 8) {
                return this.nome;
            } else {
                return "NULL";
            }
        }
    }

    public Float getValor() {
        return this.valor;
    }

    public Integer getIntervalGrade() {
        return this.intervalGrade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Float valor) {
        this.valor = valor;
        setIntervalGrade();
    }

    public void setIntervalGrade() {
        // Convert to string and format value
        String gradeString = String.format("%06.2f", this.valor);
        // Extract the tens values
        String tensString = gradeString.substring(0, 2);
        // Cast to int
        int val = Integer.parseInt(tensString);
        // Evaluate the grade to the interval
        if (val != 10)
            val++;
        // Set value
        this.intervalGrade = val;
    }

}
