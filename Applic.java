public class Applic {
    public static void main(String[] args) throws Exception{
        ReadInput readF = new ReadInput();
        // readF.inputReader();
        PowAndWrite ts = new PowAndWrite();

        ts.computing(readF.inputReader("a"),readF.inputReader("b"));
    }
}
