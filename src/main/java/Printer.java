public class Printer {
    private int sheetsOfPaper = 100;
    private int tonerVolume = 50;

    public Printer(){
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public String print(int pages, int copies) {
        int totalPages = (pages * copies);
        if (this.sheetsOfPaper >= totalPages) {
            if (this.tonerVolume >= totalPages) {
                this.sheetsOfPaper -= totalPages;
                this.tonerVolume -= totalPages;
                return(String.format("Printed %d pages. There are %d sheets of paper and %d volumes of toner left in the cartridge.", totalPages, this.sheetsOfPaper, this.tonerVolume));
            } else {
                return(String.format("There are only %d volumes of toner and you require %d for your print request!", this.tonerVolume, totalPages));
            }
        } else {
            return(String.format("There are only %d sheets of paper and you require %d for your print request!", this.sheetsOfPaper, totalPages));
        }

    }

    public int refillPaper() {
        return this.sheetsOfPaper = 100;
    }

    public int refillToner() {
        return this.tonerVolume = 50;
    }

    public int getSheetsOfPaper() {
        return this.sheetsOfPaper;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

}
