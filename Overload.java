class Overload {

  public static void overload() {
        System.out.println("Overload with no args called. ");
    }
    public static void overload(int a) { // error no redifining methods if int arg not there.
        System.out.println("Overload with a %s was called. ".formatted(a));
    }

    public static void main(String args[])
    {

        Overload bob = new Overload();
        bob.overload();
        bob.overload(10);
    }

}
