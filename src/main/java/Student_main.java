import org.junit.Assert;
import org.mockito.Mockito;

/**
 * Created by Sudipto Saha on 3/28/2017.
 */
public class Student_main {

    public static void main(String args[])
    {
        int m1[]={10,20,30};
        Student s1=new Student(1,"Sudipto",m1);
        System.out.println(s1.maxMarks());
        System.out.println(s1.Avearge());

        Student s2= Mockito.mock(Student.class);

        //mock the behaviour of student object
        Mockito.when(s2.maxMarks()).thenReturn(10);
        Assert.assertEquals(s2.maxMarks(),10);
        System.out.println(s2.maxMarks());
        Mockito.when(s2.getId()).thenReturn(21);
        System.out.println(s2.getId());

        //can even throw a exception while mocking

        //when the object of student class calls the getMarks() method, it should throw a runtime exception

        Mockito.doThrow(new RuntimeException("marks not available till date")).when(s2).getMarks();
        System.out.println(s2.getMarks());

    }
}
