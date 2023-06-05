namespace bt2
{
    class GameItem
    {
        protected string Name;
        protected int Level;
        protected int Score;


        public GameItem()
        {
        }

        public void Input()
        {
            Console.Write("Nhap name: ");
            Name = Console.ReadLine();
            Console.Write("Nhap level: ");
            Level = Convert.ToInt32(Console.ReadLine());
            Console.Write("Nhap Score: ");
            Score = Convert.ToInt32(Console.ReadLine());
        }

        public virtual String ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score;
        }
    }

    class Weapon : GameItem
    {
        protected int Dame;

        public Weapon()
        {
        }
        public void InputDame()
        {
            Console.Write("Nhap Dame: ");
            Dame = Convert.ToInt32(Console.ReadLine());

        }

        public override String ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score +"\nDame is: "+Dame;
        }
    }

    class Armor : GameItem
    {
        protected int Hp;

        public Armor()
        {
        }

        public void InputHp()
        {
            Console.WriteLine("Nhap Hp: ");
            Hp = Convert.ToInt32(Console.ReadLine());
        }

        public override String ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score+"\nHp is: "+Hp;

        }
    }

    class Consumable : GameItem
    {
        protected string NameItem;

        public Consumable()
        {
        }

        public void InputNameItem()
        {
            Console.WriteLine("Nhap ten vat pham: ");
            NameItem = Console.ReadLine();
        }

        public override string ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score+"\nNameItem is: "+NameItem;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Weapon w = new Weapon();
            Armor a = new Armor();
            Consumable c = new Consumable();

            w.Input();
            w.InputDame();
            Console.WriteLine(w.ToString());

        }
    }
}