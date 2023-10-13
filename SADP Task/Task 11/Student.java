import java.util.ArrayList;
import java.util.List;

public interface Student {
    void degree();
}

class Graduation {
    public void psc() {
        System.out.println("P.S.C Passed");
    }

    public void jsc() {
        System.out.println("J.S.C Passed");
    }
    public void ssc() {
        System.out.println("S.S.C Passed");
    }
}

class Psc implements Student {
    private Graduation grade;

    public Psc(Graduation grade) {
        this.grade = grade;
    }

    @Override
    public void degree() {
        grade.psc();
    }

}



class Jsc implements Student {
    private Graduation grade;

    public Jsc(Graduation grade) {
        this.grade = grade;
    }

    @Override
    public void degree() {
        grade.jsc();
    }

}
class Ssc implements Student {
    private Graduation grade;

    public Ssc(Graduation grade) {
        this.grade = grade;
    }

    @Override
    public void degree() {
        grade.ssc();
    }

}

class Result {
    private List<Student> degrees = new ArrayList<Student>();

    public void dlist(Student student) {
        degrees.add(student);
    }
    public void submit() {
        for (Student student : degrees) {
            student.degree();
        }
        degrees.clear();
    }

}
class Complete {
    public static void main(String[] args){
        Graduation grad = new Graduation();
        Student psc = new Psc(grad);
        Student ssc = new Jsc(grad);
        Student ssc = new Ssc(grad);  
        Result result = new Result();
        result.dlist(ssc);
        result.dlist(jsc);
        result.dlist(psc);
        result.submit();

    }
}