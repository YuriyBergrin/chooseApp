package com.hfad.user.chose;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionsData {

    public ArrayList<String> getEasyList() {
        return easyList;
    }

    public ArrayList<String> getNormalList() {
        return normalList;
    }

    public ArrayList<String> getHardList() {
        return hardList;
    }

    String[] hardArray = {
            "Переспать с бомжихой или съесть отрыжку друга?",
            "Выпить из лужи или шлепнуть по попе мужика в баре?",
            "Иметь член 35 см или иметь член 7см?",
            "Выпить залпом бутылку водки или спеть \"Зайка моя\" в магазине?",
            "Съесть муху или пойти на работу в домашних тапочках?",
            "Переспать с хламидиозной проституткой без презерватива или дать красивому парню сделать тебе минет?",
            "На один день стать человеком другого пола или на один день стать негром?",
            "Провести ночь в заброшенной психиатрической больнице или провести ночь в гей-клубе?",
            "Загорать на общественном пляже час полностью голым или вылить себе на голову бутылку молока в магазине?",
            "Отрубить себе руку или отрубить себе член?",
            "Признаться в любви кондуктору или облизнуть пол в подъезде?",
            "Затолкать автору в жопу бензопилу или вентилятор?",
            "Съесть стакан соды и запить уксусом или съесть пачку ментоса и запить колой?",
            "Описаться публично или обделаться в туалете и потратить 3 часа на то, чтобы отмыться?",
            "Покакать в гипермаркете незаметно от людей или прилюдно пописать на улице?",
            "Поставить на рабочем столе заставку из гей-порно или признаться десантнику, что заднеприводный?",
            "Снять видео как ты какаешь и отправить первой любви или снять видео как ты мастурбируешь и отправить (бывшему) классному руководителю?",
            "Пинуть амбала в баре и попытаться убежить или прелюдно плюнуть незнакомой девушке в лицо?",
            "Прижечь сигарету о свой лоб или до конца жизни пользоваться Internet Explorer?",
            "Трахнуть уродливую женщину или дать в рот самому красивому парню?",
            "Помастурбировать при ребенке или сесть на дилдо в доме престарелых?",
            "Подставить начальника и занять его место или никогда не подняться по карьерной лестнице?",
            "Съесть какашку птички или искупать в чане с гавном слона?",
            "Иметь возможность мыться только раз в месяц или всю жизнь справлять нужду в ведро?",
            "Никогда не любить или никогда не испытывать оргазм?",
            "Испытывать непроизвольные оргазмы в неожиданных местах или пукать 6 раз в день, но в определенное время?",
            "Иметь толстый член, но короткий или длинный, но очень тонкий?",
            "Переспать с 10 людьми за вечер или с одним всю свою жизнь?",
            "Не ходить в туалет по-большому неделю или сесть на обоссаный ободок унитаза?",
            "Иметь обе руки левые или всего одну ногу?",
            "Иметь очень прыщавое лицо или тело в язвах?"

    };

    String[] normalArray = {
            "Испытывать постоянную боль или невыносимый зуд?",
            "Умереть, сгорев в огне или замерзнуть до смерти?",
            "Подтираться наждачной бумагой или использовать уксус вместо глазных капель?",
            "Чтобы никто не пришел на вашу свадьбу или никто не явился на ваши похороны?",
            "Отказаться VK или отказаться от YouTube?",
            "Съесть козюльку друга или ушную серу своей бабушки?",
            "Облизать шерсть уличной собаки и засунуть палец в жопу домашнему коту?",
            "Прийти на работу в трусах или заняться сексом при родителях?",
            "Пройтись голым ночью по центру Бангкока или проваляться день вонючим бомжом?",
            "Заметно почесать между ног на совещании или пукнуть в лифте с с сослуживцами?",
            "Сказать начальнику \"Эй ты\" или девушке \"Ты бл*дь\"?",
            "Лишится большого пальца на ноге или родиться с родимым пятном на половину лица?",
            "Одеть футболку с изображением пениса или с изображением вагины?",
            "Ходить всю жизнь без трусов или всю жизнь в одних и тех же?",
            "Съесть живого африканского таракана или остаться на час с питоном в клетке?",
            "Воспитывать ребенка от предыдущего брака супруга или взять ребенка из приюта?",
            "Всю жизнь без оргазма или вкусной еды?",
            "Выпить залпом 2 литра воды или пробыть в остывшей ванне 5 часов?",
            "Спать по 20 часов в день или всю жизнь не спать, но постоянно хотеть?",
            "Обвинить невиновного человека в краже или врать ребенку до конца жизни что Санта Клаус существует?",
            "Сказать родному ребенку, что он приемный или врать всю жизнь, что приемный ребенок родной?",
            "Пить только чистую водку или вообще никогда не пить?",
            "Иметь абсолютно плоскую грудь или грудь 5го размера?",
            "Стать проктологом или патологоанатомом?",
            "Никогда больше не сидеть или не лежать?",
            "Пережить голод неделю или бессоницу месяц?",
            "Отдать своего ребенка в другую семью или никогда не иметь своего собственного ребенка?",
            "Носить всю жизнь только черную одежду или каждый раз одежду всех цветов радуги?",
            "Умереть после 35 счастливым человеком или в 80 несчастным?"

            };

    String[] easyArray = {
            "Уметь говорить на всех языках мира, или уметь разговаривать с животными?",
            "Иметь способность перематывать жизнь назад или ставить её на паузу?",
            "Отказаться от соли или отказаться от сахара?",
            "Иметь способность читать чужие мысли или летать?",
            "Родиться с хоботом слона или с длинной шеей жирафа?",
            "Быть сильно волосатым или абсолютно лысым?",
            "Вы бы отказались от сыра или шоколада?",
            "Знать на среднем уровне английский или в совершенстве китайский?",
            "Побриться налысо или покрасить волосы в салатовый цвет?",
            "Попить чай в шикарном ресторане или до отвала наесться в столовке?",
            "Работать только в женском коллективе всю жизнь или всю жизнь одному?",
            "Убить муху или муравья?",
            "Работать на работе с высокой зарплатой и не успевать заниматься хобби или зарабатывать хобби копейки?",
            "Никогда ни с кем не переписываться или не иметь возможность позвонить человеку?",
            "Отказаться от буквы \"а\" или \"о\" при написании?",
            "Назвать своего ребенка по имени первой любви, при условии, что твой партнер знает об этом или партнера называть по имени своей первой любви?",
            " Быть злым и одиноким или добрым, но которым постоянно пользуются?",
            "Отказаться от использования компьютера или телефона?",
            "Взять старомодное имя или ужасную фамилию?",
            "Жить во время Первой мировой войны или Второй мировой войны?",
            "Быть сильным, но трусливым или слабым, но безрассудно смелым?",
            "Заниматься только экстремальными видами спорта или не заниматься спортом вообще",
            "Никогда не есть сладкое или не есть соленое?",
            "Погулять по Европе или полежать возле моря в Тайланде?"

            };



    ArrayList<String> easyList = new ArrayList<>(Arrays.asList(easyArray));
    ArrayList<String> normalList = new ArrayList<>(Arrays.asList(normalArray));
    ArrayList<String> hardList = new ArrayList<>(Arrays.asList(hardArray));
}
