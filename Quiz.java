package Stepic_1;
// Сортировка реплик из пьесы по ролям

import static java.lang.System.out;

public class Quiz {

    public static void main(String[] args) throws Exception {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        Quiz quiz = new Quiz();
        out.print(quiz.printTextPerRole(roles,textLines));
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        //результирующая строка
        StringBuffer result = new StringBuffer();
        //перебираем роли
        for (int i = 0; i < roles.length; i++){
            //добавляем к результату роль и двоеточие, и перевод строки
            result.append(roles[i] + ":\n");
            //текс для проверки совпадения в массиве с репликами
            String txt = roles[i]+":";
            int txtLine = txt.length();
            //перебираем реплики
            for (int j = 0; j < textLines.length; j++){
                //проверяем вхождение роли в реплике
                if (textLines[j].startsWith(txt)){
                    //если вхождение TRUE, добавляем к результату номер реплики, скобку, обрезанную строку и перевод строки
                    result.append((j+1)+")"+textLines[j].substring(txtLine)+"\n");
                }
            }
            //по завершении проверки массива с репликами, добавляем перевод строки
            result.append("\n");
        }
        return result.toString();
    }
}
