package factory;

public abstract class LanguageCreator {

    private final Language language;

    public LanguageCreator() {
        this.language = createLanguage();
    }
    abstract Language createLanguage();

   public void displayLanguageMethod() {
       showName();
       print();
   }
   public void showName() {
       language.showName();
   }
   public void print() {
       language.print();
   }
}
