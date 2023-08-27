public class OuterClass {
    InnerClass innerClass = new InnerClass();
    public void outerPrint() {
        System.out.println("OuterClass has printed something");
        innerClass.innerPrint();
    }

    private class InnerClass {
        public void innerPrint() {
            System.out.println("InnerClass also printed something");
        }
    }

}
