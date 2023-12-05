package menu.model;

import menu.phrase.Exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static menu.model.Category.*;

public enum Menu {
    GYUDON("규동", JAPANESE),
    UDON("우동", JAPANESE),
    MISOSHIRU("미소시루", JAPANESE),
    SUSHI("스시", JAPANESE),
    KATSUDON("가츠동", JAPANESE),
    ONIGIRI("오니기리", JAPANESE),
    HAYAISU("하이라이스", JAPANESE),
    RAMEN("라멘", JAPANESE),
    OKONOMIYAKI("오코노미야끼", JAPANESE),
    GIMBAP("김밥", KOREAN),
    KIMCHI_JJIGAE("김치찌개", KOREAN),
    SSAM_BAP("쌈밥", KOREAN),
    DOEJANG_JJIGAE("된장찌개", KOREAN),
    BIBIMBAP("비빔밥", KOREAN),
    KALGUKSU("칼국수", KOREAN),
    BULGOGI("불고기", KOREAN),
    TTEOKBOKKI("떡볶이", KOREAN),
    JAEYUK_BOKKEUM("제육볶음", KOREAN),
    KANPOONGI("깐풍기", CHINESE),
    STIR_FRIED_NOODLES("볶음면", CHINESE),
    DONGPAYUK("동파육", CHINESE),
    JAJANGMYEON("짜장면", CHINESE),
    JJAMPPONG("짬뽕", CHINESE),
    MAPADUBU("마파두부", CHINESE),
    TANGSUYUK("탕수육", CHINESE),
    TOMATO_EGG_STIR_FRY("토마토 달걀볶음", CHINESE),
    SPICY_CHICKEN("고추잡채", CHINESE),

    // 아시안 메뉴
    PAD_THAI("팟타이", ASIAN),
    KAO_PAD("카오 팟", ASIAN),
    NASI_GORENG("나시고렝", ASIAN),
    PINEAPPLE_FRIED_RICE("파인애플 볶음밥", ASIAN),
    PHO("쌀국수", ASIAN),
    TOM_YUM_KUNG("똠얌꿍", ASIAN),
    BANH_MI("반미", ASIAN),
    SUMMER_ROLLS("월남쌈", ASIAN),
    BUN_CHA("분짜", ASIAN),

    // 양식 메뉴
    LASAGNA("라자냐", WESTERN),
    GRATIN("그라탱", WESTERN),
    GNOCCHI("뇨끼", WESTERN),
    QUICHE("끼슈", WESTERN),
    FRENCH_TOAST("프렌치 토스트", WESTERN),
    BAGUETTE("바게트", WESTERN),
    SPAGHETTI("스파게티", WESTERN),
    PIZZA("피자", WESTERN),
    PANINI("파니니", WESTERN);

    private String name;
    private Category category;

    Menu(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public Category getCategory() {
        return category;
    }
}
