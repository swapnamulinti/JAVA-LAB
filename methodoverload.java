class Methodoverload
{
    void display(int a) {
        System.out.println("Value of a: " + a);
    }

    void display(int a, int b) {
        System.out.println("Values of a and b: " + a + ", " + b);
    }

    public static void main(String[] args) 
    {
        Methodoverload obj = new Methodoverload();
        obj.display(10);
        obj.display(20, 30);
    }
}
