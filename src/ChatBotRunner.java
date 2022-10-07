public class ChatBotRunner {
    public static void main(String[] args)
    {
        ChatBot miko = new ChatBot("Miko", 24);
        miko.greeting("Zoe");
        miko.goodMorning();
        miko.weather();
        miko.oddOrEven();
        miko.favoriteNumber(6);
        System.out.println(miko.goodbye());
    }
}
