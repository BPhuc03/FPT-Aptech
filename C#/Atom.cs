using System.Collections;

class Atomic
{
    private int atomicNumber;
    private string symbol;
    private string fullName;
    private double weight;

    public Atomic(int atomicNumber, string symbol, string fullName, double weight)
    {
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.fullName = fullName;
        this.weight = weight;
    }

    public Atomic()
    {
    }
    ArrayList arr = new ArrayList();
    public bool accept()
    {
        System.Console.WriteLine("Enter atomic number : ");

        atomicNumber = Convert.ToInt32(System.Console.ReadLine());
        System.Console.WriteLine("Enter symbol : ");
        symbol = Console.ReadLine();

        System.Console.WriteLine("Enter full name : ");
        fullName = Console.ReadLine();

        System.Console.WriteLine("Enter atomic weight :  ");
        weight = Convert.ToDouble(System.Console.ReadLine());


        Atomic atm = new Atomic(atomicNumber, symbol, fullName, weight);
        arr.Add(atm);
        return true;

    }

    public void display()
    {
        foreach (Atomic at in arr)
        {
            System.Console.WriteLine(at.atomicNumber + " " + at.symbol + " " + at.fullName + " " + at.weight);
        }
    }
}