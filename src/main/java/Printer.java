public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return this.paper;
    }

    public void print(int pages, int copies) {
        int reqPaper = pages * copies;
        if (reqPaper <= this.paper) {
            this.paper -= reqPaper;
            this.toner -= reqPaper;
        }
    }

    public void refillPaper() {
        this.paper = 20;
    }

    public int getToner() {
        return toner;
    }
}
