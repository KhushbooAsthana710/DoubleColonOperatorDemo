class Sample
{
    public Sample()
    {
        System.out.println("Sample class constructor");
    }
}

interface CRExample
{
    public Sample getSample();
}

public class ExampleOfConstructorReference {

    public static void main(String[] args) {
        // Using lambda expression
        CRExample crExample1 = () -> {
            Sample sample=new Sample();
            return sample;
        };
        Sample sample1= crExample1.getSample();

        // Using double colon operator
        CRExample crExample2 = Sample::new;
        Sample sample2= crExample2.getSample();

        }
}
