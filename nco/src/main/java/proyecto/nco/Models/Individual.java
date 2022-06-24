package proyecto.nco.Models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "individuals")
public class Individual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column (name = "grade1")
    private int grade1;

    @Column(name="grade2")
    private int grade2;

    @Column(name="grade3")
    private int grade3;

    
    @Column(name="grade4")
    private int grade4;

    @Column(name="grade5")
    private int grade5;

    @Column(name="grade6")
    private int grade6;

    @Column(name="grade7")
    private int grade7;

    public Individual() {

    }

    public Individual(String name, int nota1, int nota2, int nota3, int nota4, int nota5, int nota6, int nota7) {
        this.name = name;
        this.grade1 = nota1;
        this.grade2 = nota2;
        this.grade3 = nota3;
        this.grade4 = nota4;
        this.grade5 = nota5;
        this.grade6 = nota6;
        this.grade7 = nota7;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Individual))
            return false;
        Individual employee = (Individual) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name);
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public int getGrade3() {
        return grade3;
    }

    public int getGrade4() {
        return grade4;
    }

    public int getGrade5() {
        return grade5;
    }

    public int getGrade6() {
        return grade6;
    }

    public int getGrade7() {
        return grade7;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(int grade3) {
        this.grade3 = grade3;
    }

    public void setGrade4(int grade4) {
        this.grade4 = grade4;
    }

    public void setGrade5(int grade5) {
        this.grade5 = grade5;
    }

    public void setGrade6(int grade6) {
        this.grade6 = grade6;
    }

    public void setGrade7(int grade7) {
        this.grade7 = grade7;
    }
}