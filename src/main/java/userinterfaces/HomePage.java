package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {



    ////mapeamos los elementos de la pagina de inicio

    public static final Target InputCity=Target.the("City")
            .locatedBy(" /html/body/div[3]/div[2]/div/form/div[1]/div[1]/div/div/div[1]/div/div/input");



   //////Para pasar XPATH DYNAMICOS SE HACE DE ESTA FORMA
    public static final  Target InputDateInit=Target.the("{0} Date init")
            .locatedBy("//span[@aria-label='{0}']");


    public static final Target InputDatefinal=Target.the("{0} Date final")
            .locatedBy("//span[@aria-label='{0}']");


    public static final Target ButtonPerson=Target.the("Button Person")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/button");
///html/body/div[4]/div/div[2]/div/div[1]/div/form/div[1]/div[3]/div/button

    public static final Target Room=Target.the("Button Room")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[5]/div[2]/button[2]");


    public static final Target Adult=Target.the("Button Adult")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[1]/div[2]/button[2]");


    public static final Target Kids=Target.the("Button Kids")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[2]/div[2]/button[2]");


    public static final Target CloseButton=Target.the("Button Close")
            .locatedBy("#b2indexPage > div.f0fbe41bfe.b290b28eaf > div > div > div > div.a6482c8acb > div.c1d765e0d9.c62b7e9b8e.d421021d96 > div > button");


    public static final Target Age1=Target.the("Button Age 1")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[3]/div/div/select");


    public static final Target Age2=Target.the("Button Age 2")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[3]/div[2]/div/select");



    public static final Target ButtonOk=Target.the("Button OK")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/button");


    public static final Target ButtonSearch=Target.the("Button Search")
            .locatedBy("/html/body/div[3]/div[2]/div/form/div[1]/div[4]/button");

    public static final Target ButtonFilter=Target.the("Button Filter")
            .locatedBy("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[2]/div[2]/div[1]/div/div/span/button");


    public static final Target Filter=Target.the(" Filter")
            .locatedBy("/html/body/div[27]/div/ul/li[3]/button/div");


    public static final Target Price=Target.the(" Price")
            .locatedBy("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]");


    public static final Target Star=Target.the(" 3Star")
            .locatedBy("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[8]/div[9]/label/span[2]");



    public static final Target Star4=Target.the(" 4Star")
            .locatedBy("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[8]/div[11]/label/span[2]");


    public static final Target Star5=Target.the(" 5Star")
            .locatedBy("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[1]/div[3]/div[8]/div[13]/label/span[2]");




    public static final Target Texto=Target.the(" Texto")
            .locatedBy("/html/body/div[4]/div/div[2]/div/div[2]/div[3]/div[2]/div[2]/div[3]/div[3]");






}
