package factory;

import factory.creator.Creator;

public class JavaCreator extends LanguageCreator {
    @Override
    Language createLanguage() {
        return new Java();
    }
}
