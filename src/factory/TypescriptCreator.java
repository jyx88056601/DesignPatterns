package factory;

public class TypescriptCreator extends LanguageCreator {
    @Override
    Language createLanguage() {
        return new Typescript();
    }
}
