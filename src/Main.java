//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name="炎の剣";
        s.damage=10;

        Hero h1 = new Hero("ミナト");//呼んだ瞬間hp100の勇者ミナトが誕生する
        System.out.println(h1.hp);
        //h1.hp = 100;
        System.out.println("勇者"+h1.name+"を生み出しました");

        /*Hero h2 = new Hero();
        h2.name = "アサガ";
        //h2.hp = 100;
        System.out.println("勇者"+h2.name+"を生み出しました");*/

        Wizard w= new Wizard();
        w.name="スガワラ";
        w.hp=50;
        w.heal(h1);
        w.heal(h1);
        w.heal(h1);

        Matango m1 = new Matango();
        m1.hp=50;
        m1.suffix='A';
        h1.sword = s;
        System.out.println("現在の武器は"+h1.sword.name);

        Matango m2 = new Matango();
        m2.hp=48;
        m2.suffix='B';

        h1.slip();
        m1.run();
        m2.run();
        h1.run();
    }
}