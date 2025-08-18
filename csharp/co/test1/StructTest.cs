struct StructTest(int id, Estado estado, string titulo = "titulo")
{
    public int id = id;
    public string title = titulo;

    public Estado estado = estado;


    public void test()
    {

    }

}

enum Estado
{
    rs = 1,
    sp = 2,
    df = 3,
    es = 4,
    pr = 5
}

/*
struct StructTest
{
    public int id;

    public StructTest(int id){
        this.id = id;
    }
}
*/