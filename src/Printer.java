public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {

        int tempAmount = tonerAmount + tonerLevel;
        if (tonerAmount <= 0 || tonerAmount > 100 || tempAmount > 100) {
            return  -1;
        }

        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {

        if (duplex) {
            pages = (int) Math.round((double) pages / 2);
            System.out.println("Printing in duplex mode");
        }

        pagesPrinted += pages;

        return pages;
    }
}
