package com.demir.iqtibos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuotesData {


    public static Collection<? extends QuotesList> getLifeQuotes(){


        final List<QuotesList> lifeQuoteList = new ArrayList<>();

        QuotesList lifeQuote1 = new QuotesList("Men mavjud bo'lishdan ko'ra yashashni tanlayman.", "Jeyms Alan Xetfild");
        lifeQuoteList.add(lifeQuote1);

        QuotesList lifeQuote2 = new QuotesList("Dazmol magnitga dedi: \"Eng muhimi, men sendan nafratlanaman, chunki sen o'zingni o'ziga tortasan, seni sudrab olishga kuchim yetmaydi!", "Fridrix Nitsshe");
        lifeQuoteList.add(lifeQuote2);

        QuotesList lifeQuote3 = new QuotesList("Hayot bu teatr. Faqat aktyorlar yerda, tomoshabinlar esa osmonda.", "Benkin");
        lifeQuoteList.add(lifeQuote3);

        QuotesList lifeQuote4 = new QuotesList("Hayot bilan muloqotda uning savoli emas, balki bizning javobimiz muhim.", "Marina Tsvetaeva");
        lifeQuoteList.add(lifeQuote4);

        QuotesList lifeQuote5 = new QuotesList("Hayot teatrdagi o'yinga o'xshaydi: muhimi uning qancha davom etishi emas, balki qanchalik yaxshi o'ynalganligidir.", "Seneka");
        lifeQuoteList.add(lifeQuote5);



        return lifeQuoteList;

    }

    public static Collection<? extends QuotesList> getMotivationQuotes(){

        final List<QuotesList> motivationQuoteList = new ArrayList<>();

        QuotesList motivationQuote1 = new QuotesList("O'z oldingizga yangi maqsad qo'yish yoki yangi orzu topish uchun hech qachon kech emas.", "Alberto Digorio");
        motivationQuoteList.add(motivationQuote1);

        QuotesList motivationQuote2 = new QuotesList("Yuragingizni oching va u nimani orzu qilayotganini tinglang", "Maykl Jon Bobek");
        motivationQuoteList.add(motivationQuote2);

        QuotesList motivationQuote3 = new QuotesList("Men o'zim xohlagan odamga aylanaman - agar shunday bo'lishimga ishonsam", "Gandi");
        motivationQuoteList.add(motivationQuote3);

        QuotesList motivationQuote4 = new QuotesList("Agar odamlar sizga ishonmasa, orzularingizdan voz kechmang.", "Jek Nikolson");
        motivationQuoteList.add(motivationQuote4);

        QuotesList motivationQuote5 = new QuotesList("Bugun boshqalar istamagan narsani qiling, ertaga siz boshqalar qila olmaydigan tarzda yashaysiz.", "Jared Leto");
        motivationQuoteList.add(motivationQuote5);

        QuotesList motivationQuote6 = new QuotesList("Ertaga degan so‘zni kambag‘allar, baxtsizlar va nosog‘lomlar ko‘p ishlatadi.", "Robert Kiyosaki");
        motivationQuoteList.add(motivationQuote6);

        return motivationQuoteList;

    }

    public static Collection<? extends QuotesList> getSuccessQuotes(){

        final List<QuotesList> successQuoteList = new ArrayList<>();

        QuotesList succesQuote1 = new QuotesList("Aqlli fikrlar faqat ahmoqona ishlar qilinganda paydo bo'ladi.\n" +
                "Faqat bema'ni urinishlar qilganlar imkonsiz narsaga erisha oladilar.", "Albert Eynshteyn");
        successQuoteList.add(succesQuote1);

        QuotesList succesQuote2 = new QuotesList("Men bilgan deyarli har bir muvaffaqiyat hikoyasi muvaffaqiyatsizlikka uchragan odamdan boshlangan.", "Jim Rohn");
        successQuoteList.add(succesQuote2);

        QuotesList succesQuote3 = new QuotesList("Avval ular sizni mensimaydilar, keyin ustingizdan kulishadi, keyin siz bilan jang qilishadi, keyin siz g'alaba qozonasiz.", "Gandi");
        successQuoteList.add(succesQuote3);

        QuotesList succesQuote4 = new QuotesList("Hech kim sizdan yaxshiroq emas. Hech kim sizdan aqlli emas. Ular faqat erta boshlashdi.", "Brayan Treysi");
        successQuoteList.add(succesQuote4);

        QuotesList succesQuote5 = new QuotesList("Agar kasbi quvonch keltirmasa, inson kamdan-kam hollarda biror narsada muvaffaqiyat qozonadi.", "Deyl Karnegi");
        successQuoteList.add(succesQuote5);

        return successQuoteList;
    }

    public static Collection<? extends QuotesList> getEnglishQuotes(){

        final List<QuotesList> englishQuoteList = new ArrayList<>();

        QuotesList englishQuote1 = new QuotesList("The only thing we have to fear is fear itself.", "Franklin D. Roosevelt");
        englishQuoteList.add(englishQuote1);

        QuotesList englishQuote2 = new QuotesList("\n" +
                "I have a dream that my four little children will one day live in a nation where they\n" +
                "will not be judged by the color of their skin but by the content of their character.", "Martin Luther King");
        englishQuoteList.add(englishQuote2);

        QuotesList englishQuote3 = new QuotesList("If you want something done right, do it yourself.", "Charles-Guillaume Etienne");
        englishQuoteList.add(englishQuote3);

        QuotesList englishQuote4 = new QuotesList("That’s one small step for a man, a giant leap for mankind.", "Neil Armstrong\n");
        englishQuoteList.add(englishQuote4);

        QuotesList englishQuote5 = new QuotesList("Two roads diverged in a wood, and I, I took the one less travelled by, and that has made all the difference.", "Robert Frost");
        englishQuoteList.add(englishQuote5);


        return englishQuoteList;


    }




}
