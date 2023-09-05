package sturctural.adapter;

public class TranslatorAdapter implements VietnameseTarget{
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnamsesWords = translate(words);
        System.out.println("Sending Words ...");
        adaptee.reseive(vietnamsesWords);
    }
    private String translate(String vietnameseWords){
        System.out.println("Translated!");
        return "こんにちは";
    }
}
